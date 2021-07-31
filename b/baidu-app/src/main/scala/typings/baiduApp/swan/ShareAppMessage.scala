package typings.baiduApp.swan

import typings.baiduApp.anon.ShareTickets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 开放接口-----分享
trait ShareAppMessage
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 分享描述, 默认为当前小程序名称
    */
  var desc: js.UndefOr[String] = js.undefined
  
  /**
    * 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径，支持PNG及JPG
    * 不传入 imageUrl 则使用默认截图。显示图片长宽比是 5:4
    * @version 1.5.0
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 分享路径  当默认为前页面 path ，
    * 必须是以 / 开头的完整路径
    *
    */
  var path: js.UndefOr[String] = js.undefined
  
  @JSName("success")
  var success_ShareAppMessage: js.UndefOr[js.Function1[/* res */ ShareTickets, Unit]] = js.undefined
  
  /**
    * 分享标题  默认为当前小程序名称
    *
    */
  var title: js.UndefOr[String] = js.undefined
}
object ShareAppMessage {
  
  @scala.inline
  def apply(): ShareAppMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareAppMessage]
  }
  
  @scala.inline
  implicit class ShareAppMessageMutableBuilder[Self <: ShareAppMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ ShareTickets => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
