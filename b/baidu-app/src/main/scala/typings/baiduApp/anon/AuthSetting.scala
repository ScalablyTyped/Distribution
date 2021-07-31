package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSetting extends StObject {
  
  var authSetting: typings.baiduApp.swan.AuthSetting
}
object AuthSetting {
  
  @scala.inline
  def apply(authSetting: typings.baiduApp.swan.AuthSetting): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingMutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSetting(value: typings.baiduApp.swan.AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
