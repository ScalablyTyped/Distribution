package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterNameValue extends js.Object {
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
}

object ParameterNameValue {
  @scala.inline
  def apply(ParameterName: String = null, ParameterValue: String = null): ParameterNameValue = {
    val __obj = js.Dynamic.literal()
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName.asInstanceOf[js.Any])
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterNameValue]
  }
}

