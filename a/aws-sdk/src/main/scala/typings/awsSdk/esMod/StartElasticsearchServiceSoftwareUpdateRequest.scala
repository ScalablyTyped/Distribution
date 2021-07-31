package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartElasticsearchServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The name of the domain that you want to update to the latest service software.
    */
  var DomainName: typings.awsSdk.esMod.DomainName
}
object StartElasticsearchServiceSoftwareUpdateRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): StartElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateRequest]
  }
  
  @scala.inline
  implicit class StartElasticsearchServiceSoftwareUpdateRequestMutableBuilder[Self <: StartElasticsearchServiceSoftwareUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
