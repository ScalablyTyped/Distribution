package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 通用物体及场景识别，即对于输入的一张图片（可正常解码，且长宽比适宜），输出图片中的多个物体及场景标签。
  */
trait GeneralIdentifyOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var image: String
  
  // 图像资源地址
  @JSName("success")
  var success_GeneralIdentifyOptions: js.UndefOr[js.Function1[/* res */ GeneralIdentifyResponse, Unit]] = js.undefined
}
object GeneralIdentifyOptions {
  
  inline def apply(image: String): GeneralIdentifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralIdentifyOptions]
  }
  
  extension [Self <: GeneralIdentifyOptions](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralIdentifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
