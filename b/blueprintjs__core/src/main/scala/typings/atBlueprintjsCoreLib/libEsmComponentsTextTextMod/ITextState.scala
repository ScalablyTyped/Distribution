package typings
package atBlueprintjsCoreLib.libEsmComponentsTextTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextState extends js.Object {
  var isContentOverflowing: scala.Boolean
  var textContent: java.lang.String
}

object ITextState {
  @scala.inline
  def apply(isContentOverflowing: scala.Boolean, textContent: java.lang.String): ITextState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isContentOverflowing")(isContentOverflowing)
    __obj.updateDynamic("textContent")(textContent)
    __obj.asInstanceOf[ITextState]
  }
}

