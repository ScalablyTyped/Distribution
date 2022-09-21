package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 对机动车驾驶证所有关键字段进行识别。
  */
trait ocrDrivingLicenseOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.undefined
  
  var image: String
  
  // true: 归一化格式输出;false 或无此参数按非归一化格式输出。
  @JSName("success")
  var success_ocrDrivingLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrDrivingLicenseResponse, Unit]] = js.undefined
  
  // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true;false:不检测旋转角度，默认不检测。
  var unified_valid_period: js.UndefOr[Boolean] = js.undefined
}
object ocrDrivingLicenseOptions {
  
  inline def apply(image: String): ocrDrivingLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrDrivingLicenseOptions]
  }
  
  extension [Self <: ocrDrivingLicenseOptions](x: Self) {
    
    inline def setDetect_direction(value: Boolean): Self = StObject.set(x, "detect_direction", value.asInstanceOf[js.Any])
    
    inline def setDetect_directionUndefined: Self = StObject.set(x, "detect_direction", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ ocrDrivingLicenseResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUnified_valid_period(value: Boolean): Self = StObject.set(x, "unified_valid_period", value.asInstanceOf[js.Any])
    
    inline def setUnified_valid_periodUndefined: Self = StObject.set(x, "unified_valid_period", js.undefined)
  }
}
