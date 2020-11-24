package typings.baiduApp.swan

import typings.baiduApp.anon.ExtraData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region App里的onLaunch、onShow回调参数
@js.native
trait LaunchOptions extends js.Object {
  
  /**
    * 打开小程序的路径
    */
  var path: String = js.native
  
  /**
    * 打开小程序的query
    */
  var query: js.Object = js.native
  
  /**
    * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
    */
  var referrerInfo: ExtraData = js.native
  
  /**
    * 打开小程序的[场景值](https://smartprogram.baidu.com/docs/data/scene/)
    */
  var scene: Double = js.native
  
  /**
    * shareTicket，详见 获取更多[转发信息](https://smartprogram.baidu.com/docs/develop/api/open_share/)
    */
  var shareTicket: String = js.native
}
object LaunchOptions {
  
  @scala.inline
  def apply(path: String, query: js.Object, referrerInfo: ExtraData, scene: Double, shareTicket: String): LaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: ExtraData): Self = this.set("referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = this.set("shareTicket", value.asInstanceOf[js.Any])
  }
}
