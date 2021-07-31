package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 自定义图像审核。
  */
trait imageAuditOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var image: String
  
  // 图像资源地址
  var imgUrl: js.UndefOr[String] = js.undefined
  
  // 网图URL地址，以网图形式请求，图片Url需要做UrlEncode，不能与image并存。
  @JSName("success")
  var success_imageAuditOptions: js.UndefOr[js.Function1[/* res */ imageAuditResponse, Unit]] = js.undefined
}
object imageAuditOptions {
  
  @scala.inline
  def apply(image: String): imageAuditOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditOptions]
  }
  
  @scala.inline
  implicit class imageAuditOptionsMutableBuilder[Self <: imageAuditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ imageAuditResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
