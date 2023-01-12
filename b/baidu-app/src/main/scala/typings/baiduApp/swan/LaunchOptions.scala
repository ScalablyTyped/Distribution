package typings.baiduApp.swan

import typings.baiduApp.anon.ExtraData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region App里的onLaunch、onShow回调参数
trait LaunchOptions extends StObject {
  
  /**
    * 打开小程序的路径
    */
  var path: String
  
  /**
    * 打开小程序的query
    */
  var query: js.Object
  
  /**
    * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
    */
  var referrerInfo: ExtraData
  
  /**
    * 打开小程序的[场景值](https://smartprogram.baidu.com/docs/data/scene/)
    */
  var scene: Double
  
  /**
    * shareTicket，详见 获取更多[转发信息](https://smartprogram.baidu.com/docs/develop/api/open_share/)
    */
  var shareTicket: String
}
object LaunchOptions {
  
  inline def apply(path: String, query: js.Object, referrerInfo: ExtraData, scene: Double, shareTicket: String): LaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReferrerInfo(value: ExtraData): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
