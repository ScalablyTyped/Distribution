package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait openShareOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 分享标题
  var content: js.UndefOr[String] = js.undefined
  
  // 分享内容
  var imageUrl: js.UndefOr[String] = js.undefined
  
  // 分享图标
  var path: js.UndefOr[String] = js.undefined
  
  // 页面 path,必须是以 / 开头的完整路径。
  @JSName("success")
  var success_openShareOptions: js.UndefOr[js.Function1[/* res */ typings.baiduApp.anon.AuthSetting, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object openShareOptions {
  
  inline def apply(): openShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[openShareOptions]
  }
  
  extension [Self <: openShareOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSuccess(value: /* res */ typings.baiduApp.anon.AuthSetting => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
