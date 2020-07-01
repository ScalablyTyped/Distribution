package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

