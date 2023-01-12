package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvInfo extends StObject {
  
  var appKey: String
  
  // 智能小程序 App Key    2.0.28
  var appName: String
  
  // 智能小程序名称
  var lastAppURL: String
  
  // 基础库版本
  var scheme: String
  
  // 智能小程序最近一次打开的调起协议
  var sdkVersion: String
}
object EnvInfo {
  
  inline def apply(appKey: String, appName: String, lastAppURL: String, scheme: String, sdkVersion: String): EnvInfo = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], lastAppURL = lastAppURL.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvInfo] (val x: Self) extends AnyVal {
    
    inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setLastAppURL(value: String): Self = StObject.set(x, "lastAppURL", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
  }
}
