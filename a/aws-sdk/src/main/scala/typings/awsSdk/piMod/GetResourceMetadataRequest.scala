package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceMetadataRequest extends StObject {
  
  /**
    * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights gathers metrics from this data source. To use a DB instance as a data source, specify its DbiResourceId value. For example, specify db-ABCDEFGHIJKLMNOPQRSTU1VW2X. 
    */
  var Identifier: RequestString
  
  /**
    * The Amazon Web Services service for which Performance Insights returns metrics.
    */
  var ServiceType: typings.awsSdk.piMod.ServiceType
}
object GetResourceMetadataRequest {
  
  inline def apply(Identifier: RequestString, ServiceType: ServiceType): GetResourceMetadataRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceMetadataRequest]
  }
  
  extension [Self <: GetResourceMetadataRequest](x: Self) {
    
    inline def setIdentifier(value: RequestString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
  }
}
