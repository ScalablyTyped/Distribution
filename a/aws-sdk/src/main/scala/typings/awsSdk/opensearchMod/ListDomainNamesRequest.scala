package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainNamesRequest extends StObject {
  
  /**
    *  Optional parameter to filter the output by domain engine type. Acceptable values are 'Elasticsearch' and 'OpenSearch'. 
    */
  var EngineType: js.UndefOr[typings.awsSdk.opensearchMod.EngineType] = js.undefined
}
object ListDomainNamesRequest {
  
  inline def apply(): ListDomainNamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesRequest]
  }
  
  extension [Self <: ListDomainNamesRequest](x: Self) {
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
  }
}
