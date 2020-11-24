package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccountSettingResponse extends js.Object {
  
  /**
    * The account setting for the specified principal ARN.
    */
  var setting: js.UndefOr[Setting] = js.native
}
object DeleteAccountSettingResponse {
  
  @scala.inline
  def apply(): DeleteAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountSettingResponse]
  }
  
  @scala.inline
  implicit class DeleteAccountSettingResponseOps[Self <: DeleteAccountSettingResponse] (val x: Self) extends AnyVal {
    
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
    def setSetting(value: Setting): Self = this.set("setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
  }
}
