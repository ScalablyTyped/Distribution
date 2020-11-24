package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSetting extends js.Object {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSName("scope.address")
  var scopeDotaddress: String = js.native
  
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: String = js.native
  
  @JSName("scope.record")
  var scopeDotrecord: String = js.native
  
  @JSName("scope.userInfo")
  var scopeDotuserInfo: String = js.native
  
  @JSName("scope.userLocation")
  var scopeDotuserLocation: String = js.native
  
  @JSName("scope.werun")
  var scopeDotwerun: String = js.native
  
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: String = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.native
}
object AuthSetting {
  
  @scala.inline
  def apply(
    scopeDotaddress: String,
    scopeDotinvoiceTitle: String,
    scopeDotrecord: String,
    scopeDotuserInfo: String,
    scopeDotuserLocation: String,
    scopeDotwerun: String,
    scopeDotwritePhotosAlbum: String
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingOps[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
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
    def setScopeDotaddress(value: String): Self = this.set("scope.address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotinvoiceTitle(value: String): Self = this.set("scope.invoiceTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotrecord(value: String): Self = this.set("scope.record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotuserInfo(value: String): Self = this.set("scope.userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotuserLocation(value: String): Self = this.set("scope.userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotwerun(value: String): Self = this.set("scope.werun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDotwritePhotosAlbum(value: String): Self = this.set("scope.writePhotosAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
