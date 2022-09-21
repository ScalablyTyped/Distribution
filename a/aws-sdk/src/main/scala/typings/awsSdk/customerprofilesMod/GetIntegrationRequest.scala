package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntegrationRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The URI of the S3 bucket or any other type of data source.
    */
  var Uri: string1To255
}
object GetIntegrationRequest {
  
  inline def apply(DomainName: name, Uri: string1To255): GetIntegrationRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationRequest]
  }
  
  extension [Self <: GetIntegrationRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setUri(value: string1To255): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
