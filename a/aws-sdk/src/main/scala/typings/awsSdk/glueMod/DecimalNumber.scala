package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecimalNumber extends js.Object {
  
  /**
    * The scale that determines where the decimal point falls in the unscaled value.
    */
  var Scale: Integer = js.native
  
  /**
    * The unscaled numeric value.
    */
  var UnscaledValue: _Blob = js.native
}
object DecimalNumber {
  
  @scala.inline
  def apply(Scale: Integer, UnscaledValue: _Blob): DecimalNumber = {
    val __obj = js.Dynamic.literal(Scale = Scale.asInstanceOf[js.Any], UnscaledValue = UnscaledValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalNumber]
  }
  
  @scala.inline
  implicit class DecimalNumberOps[Self <: DecimalNumber] (val x: Self) extends AnyVal {
    
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
    def setScale(value: Integer): Self = this.set("Scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnscaledValue(value: _Blob): Self = this.set("UnscaledValue", value.asInstanceOf[js.Any])
  }
}
