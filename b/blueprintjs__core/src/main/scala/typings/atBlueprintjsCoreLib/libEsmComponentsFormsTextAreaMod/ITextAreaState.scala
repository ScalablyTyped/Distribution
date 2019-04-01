package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextAreaState extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
}

object ITextAreaState {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null): ITextAreaState = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextAreaState]
  }
}

