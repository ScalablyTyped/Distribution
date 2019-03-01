package typings
package atBlueprintjsCoreLib.libEsmComponentsToastToasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterState extends js.Object {
  var toasts: js.Array[IToastOptions]
}

object IToasterState {
  @scala.inline
  def apply(toasts: js.Array[IToastOptions]): IToasterState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toasts")(toasts)
    __obj.asInstanceOf[IToasterState]
  }
}

