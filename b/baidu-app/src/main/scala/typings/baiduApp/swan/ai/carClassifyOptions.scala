package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于检测一张车辆图片的具体车型，即对于输入的一张图片（可正常解码，且长
  * 宽比适宜），输出图片的车辆品牌及型号、颜色及年份、位置信息。
  */
@js.native
trait carClassifyOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 图像资源地址
  var color_result: js.UndefOr[String] = js.native
  
  var image: String = js.native
  
  // 返回结果top n，默认5。
  @JSName("success")
  var success_carClassifyOptions: js.UndefOr[js.Function1[/* res */ carClassifyResponse, Unit]] = js.native
  
  // 颜色
  var top_num: js.UndefOr[Double] = js.native
}
object carClassifyOptions {
  
  @scala.inline
  def apply(image: String): carClassifyOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyOptions]
  }
  
  @scala.inline
  implicit class carClassifyOptionsMutableBuilder[Self <: carClassifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor_result(value: String): Self = StObject.set(x, "color_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor_resultUndefined: Self = StObject.set(x, "color_result", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ carClassifyResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTop_num(value: Double): Self = StObject.set(x, "top_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_numUndefined: Self = StObject.set(x, "top_num", js.undefined)
  }
}
