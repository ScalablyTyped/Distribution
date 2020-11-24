package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// 设备-----屏幕亮度
@js.native
trait SetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  var value: Double = js.native
}
object SetScreenBrightnessOptions {
  
  @scala.inline
  def apply(value: Double): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
  
  @scala.inline
  implicit class SetScreenBrightnessOptionsOps[Self <: SetScreenBrightnessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
