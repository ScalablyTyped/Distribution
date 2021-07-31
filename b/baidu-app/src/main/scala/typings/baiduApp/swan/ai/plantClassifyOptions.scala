package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于检测和识别图片中的植物信息
  */
trait plantClassifyOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var image: String
  
  // 图像资源地址
  @JSName("success")
  var success_plantClassifyOptions: js.UndefOr[js.Function1[/* res */ plantClassifyResponse, Unit]] = js.undefined
}
object plantClassifyOptions {
  
  @scala.inline
  def apply(image: String): plantClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[plantClassifyOptions]
  }
  
  @scala.inline
  implicit class plantClassifyOptionsMutableBuilder[Self <: plantClassifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ plantClassifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
