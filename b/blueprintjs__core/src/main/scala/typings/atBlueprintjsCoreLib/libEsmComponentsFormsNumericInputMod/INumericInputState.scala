package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumericInputState extends js.Object {
  var shouldSelectAfterUpdate: scala.Boolean
  var stepMaxPrecision: scala.Double
  var value: java.lang.String
}

object INumericInputState {
  @scala.inline
  def apply(shouldSelectAfterUpdate: scala.Boolean, stepMaxPrecision: scala.Double, value: java.lang.String): INumericInputState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shouldSelectAfterUpdate")(shouldSelectAfterUpdate)
    __obj.updateDynamic("stepMaxPrecision")(stepMaxPrecision)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[INumericInputState]
  }
}

