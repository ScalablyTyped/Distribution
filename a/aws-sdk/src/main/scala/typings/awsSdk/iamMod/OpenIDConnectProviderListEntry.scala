package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenIDConnectProviderListEntry extends js.Object {
  
  var Arn: js.UndefOr[arnType] = js.native
}
object OpenIDConnectProviderListEntry {
  
  @scala.inline
  def apply(): OpenIDConnectProviderListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDConnectProviderListEntry]
  }
  
  @scala.inline
  implicit class OpenIDConnectProviderListEntryOps[Self <: OpenIDConnectProviderListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
  }
}
