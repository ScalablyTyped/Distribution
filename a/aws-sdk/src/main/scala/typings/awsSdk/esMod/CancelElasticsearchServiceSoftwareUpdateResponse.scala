package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelElasticsearchServiceSoftwareUpdateResponse extends StObject {
  
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.esMod.ServiceSoftwareOptions] = js.undefined
}
object CancelElasticsearchServiceSoftwareUpdateResponse {
  
  inline def apply(): CancelElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
  }
  
  extension [Self <: CancelElasticsearchServiceSoftwareUpdateResponse](x: Self) {
    
    inline def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
  }
}
