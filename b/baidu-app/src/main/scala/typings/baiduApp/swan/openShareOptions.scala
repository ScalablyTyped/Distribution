package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait openShareOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 分享标题
  var content: js.UndefOr[String] = js.native
  
  // 分享内容
  var imageUrl: js.UndefOr[String] = js.native
  
  // 分享图标
  var path: js.UndefOr[String] = js.native
  
  // 页面 path,必须是以 / 开头的完整路径。
  @JSName("success")
  var success_openShareOptions: js.UndefOr[js.Function1[/* res */ typings.baiduApp.anon.AuthSetting, Unit]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object openShareOptions {
  
  @scala.inline
  def apply(): openShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[openShareOptions]
  }
  
  @scala.inline
  implicit class openShareOptionsMutableBuilder[Self <: openShareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ typings.baiduApp.anon.AuthSetting => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
