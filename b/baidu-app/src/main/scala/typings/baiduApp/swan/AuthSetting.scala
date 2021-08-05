package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSetting extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("scope.address")
  var scopeDotaddress: String
  
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: String
  
  @JSName("scope.record")
  var scopeDotrecord: String
  
  @JSName("scope.userInfo")
  var scopeDotuserInfo: String
  
  @JSName("scope.userLocation")
  var scopeDotuserLocation: String
  
  @JSName("scope.werun")
  var scopeDotwerun: String
  
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: String
  
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}
object AuthSetting {
  
  inline def apply(
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
  
  extension [Self <: AuthSetting](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setScopeDotaddress(value: String): Self = StObject.set(x, "scope.address", value.asInstanceOf[js.Any])
    
    inline def setScopeDotinvoiceTitle(value: String): Self = StObject.set(x, "scope.invoiceTitle", value.asInstanceOf[js.Any])
    
    inline def setScopeDotrecord(value: String): Self = StObject.set(x, "scope.record", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserInfo(value: String): Self = StObject.set(x, "scope.userInfo", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserLocation(value: String): Self = StObject.set(x, "scope.userLocation", value.asInstanceOf[js.Any])
    
    inline def setScopeDotwerun(value: String): Self = StObject.set(x, "scope.werun", value.asInstanceOf[js.Any])
    
    inline def setScopeDotwritePhotosAlbum(value: String): Self = StObject.set(x, "scope.writePhotosAlbum", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
