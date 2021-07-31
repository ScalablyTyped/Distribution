package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 对机动车行驶证正本所有关键字段进行识别
  */
trait ocrVehicleLicenseOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false:不检测旋转角度，默认不检测。
  var accuracy: js.UndefOr[String] = js.undefined
  
  // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.undefined
  
  var image: String
  
  // normal 使用快速服务，1200ms左右时延；缺省或其它值使用高精度服务，1600ms左右时延。
  @JSName("success")
  var success_ocrVehicleLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrVehicleLicenseResponse, Unit]] = js.undefined
}
object ocrVehicleLicenseOptions {
  
  @scala.inline
  def apply(image: String): ocrVehicleLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrVehicleLicenseOptions]
  }
  
  @scala.inline
  implicit class ocrVehicleLicenseOptionsMutableBuilder[Self <: ocrVehicleLicenseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setDetect_direction(value: Boolean): Self = StObject.set(x, "detect_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect_directionUndefined: Self = StObject.set(x, "detect_direction", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ ocrVehicleLicenseResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
