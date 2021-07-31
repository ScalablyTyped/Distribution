package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartElasticsearchServiceSoftwareUpdateResponse extends StObject {
  
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.esMod.ServiceSoftwareOptions] = js.undefined
}
object StartElasticsearchServiceSoftwareUpdateResponse {
  
  @scala.inline
  def apply(): StartElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
  }
  
  @scala.inline
  implicit class StartElasticsearchServiceSoftwareUpdateResponseMutableBuilder[Self <: StartElasticsearchServiceSoftwareUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
  }
}
