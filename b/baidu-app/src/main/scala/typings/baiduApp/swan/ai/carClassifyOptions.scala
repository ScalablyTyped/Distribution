package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
  * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
  */
trait carClassifyOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 图像资源地址
  var color_result: js.UndefOr[String] = js.undefined
  
  var image: String
  
  // 返回结果top n，默认5。
  @JSName("success")
  var success_carClassifyOptions: js.UndefOr[js.Function1[/* res */ carClassifyResponse, Unit]] = js.undefined
  
  // 颜色
  var top_num: js.UndefOr[Double] = js.undefined
}
object carClassifyOptions {
  
  inline def apply(image: String): carClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyOptions]
  }
  
  extension [Self <: carClassifyOptions](x: Self) {
    
    inline def setColor_result(value: String): Self = StObject.set(x, "color_result", value.asInstanceOf[js.Any])
    
    inline def setColor_resultUndefined: Self = StObject.set(x, "color_result", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ carClassifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTop_num(value: Double): Self = StObject.set(x, "top_num", value.asInstanceOf[js.Any])
    
    inline def setTop_numUndefined: Self = StObject.set(x, "top_num", js.undefined)
  }
}
