package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用户向服务请求识别身份证，身份证识别包括正面和背面。
  */
trait ocrIdCardOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.undefined
  
  // front：身份证含照片的一面；back：身份证带国徽的一面。
  var detect_risk: js.UndefOr[Boolean] = js.undefined
  
  // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false: 不检测旋转角度，默认不检测。
  var id_card_side: js.UndefOr[String] = js.undefined
  
  var image: String
  
  // 是否开启身份证风险类型(身份证复印件、临时身份证、身份证翻拍、修改过的身份证)功能，默认不开启，即：false。可选值:true-开启；false-不开启。
  @JSName("success")
  var success_ocrIdCardOptions: js.UndefOr[js.Function1[/* res */ ocrIdCardResponse, Unit]] = js.undefined
}
object ocrIdCardOptions {
  
  inline def apply(image: String): ocrIdCardOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrIdCardOptions]
  }
  
  extension [Self <: ocrIdCardOptions](x: Self) {
    
    inline def setDetect_direction(value: Boolean): Self = StObject.set(x, "detect_direction", value.asInstanceOf[js.Any])
    
    inline def setDetect_directionUndefined: Self = StObject.set(x, "detect_direction", js.undefined)
    
    inline def setDetect_risk(value: Boolean): Self = StObject.set(x, "detect_risk", value.asInstanceOf[js.Any])
    
    inline def setDetect_riskUndefined: Self = StObject.set(x, "detect_risk", js.undefined)
    
    inline def setId_card_side(value: String): Self = StObject.set(x, "id_card_side", value.asInstanceOf[js.Any])
    
    inline def setId_card_sideUndefined: Self = StObject.set(x, "id_card_side", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ ocrIdCardResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
