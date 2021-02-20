package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvInfo extends StObject {
  
  var appKey: String = js.native
  
  // 智能小程序 App Key    2.0.28
  var appName: String = js.native
  
  // 智能小程序名称
  var lastAppURL: String = js.native
  
  // 基础库版本
  var scheme: String = js.native
  
  // 智能小程序最近一次打开的调起协议
  var sdkVersion: String = js.native
}
object EnvInfo {
  
  @scala.inline
  def apply(appKey: String, appName: String, lastAppURL: String, scheme: String, sdkVersion: String): EnvInfo = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], lastAppURL = lastAppURL.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvInfo]
  }
  
  @scala.inline
  implicit class EnvInfoMutableBuilder[Self <: EnvInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAppURL(value: String): Self = StObject.set(x, "lastAppURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
  }
}
