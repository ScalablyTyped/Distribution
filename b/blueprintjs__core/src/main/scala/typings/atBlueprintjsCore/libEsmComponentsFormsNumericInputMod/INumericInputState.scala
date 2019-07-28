package typings.atBlueprintjsCore.libEsmComponentsFormsNumericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumericInputState extends js.Object {
  var shouldSelectAfterUpdate: Boolean
  var stepMaxPrecision: Double
  var value: String
}

object INumericInputState {
  @scala.inline
  def apply(shouldSelectAfterUpdate: Boolean, stepMaxPrecision: Double, value: String): INumericInputState = {
    val __obj = js.Dynamic.literal(shouldSelectAfterUpdate = shouldSelectAfterUpdate, stepMaxPrecision = stepMaxPrecision, value = value)
  
    __obj.asInstanceOf[INumericInputState]
  }
}

