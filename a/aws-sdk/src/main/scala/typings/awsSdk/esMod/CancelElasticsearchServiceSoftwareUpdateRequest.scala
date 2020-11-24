package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
  
  /**
    * The name of the domain that you want to stop the latest service software update on.
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}
object CancelElasticsearchServiceSoftwareUpdateRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): CancelElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
  }
  
  @scala.inline
  implicit class CancelElasticsearchServiceSoftwareUpdateRequestOps[Self <: CancelElasticsearchServiceSoftwareUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
  }
}
