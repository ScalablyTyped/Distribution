package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// 设备-----屏幕亮度
trait SetScreenBrightnessOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  var value: Double
}
object SetScreenBrightnessOptions {
  
  @scala.inline
  def apply(value: Double): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
  
  @scala.inline
  implicit class SetScreenBrightnessOptionsMutableBuilder[Self <: SetScreenBrightnessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
