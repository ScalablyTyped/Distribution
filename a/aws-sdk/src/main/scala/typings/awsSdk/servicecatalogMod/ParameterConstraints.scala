package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterConstraints extends js.Object {
  /**
    * The values that the administrator has allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[typings.awsSdk.servicecatalogMod.AllowedValues] = js.native
}

object ParameterConstraints {
  @scala.inline
  def apply(AllowedValues: AllowedValues = null): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterConstraints]
  }
}

