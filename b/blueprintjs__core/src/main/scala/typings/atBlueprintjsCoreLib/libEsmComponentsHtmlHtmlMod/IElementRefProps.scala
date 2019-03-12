package typings
package atBlueprintjsCoreLib.libEsmComponentsHtmlHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementRefProps[E /* <: stdLib.HTMLElement */] extends js.Object {
  /** Ref handler to access the instance of the internal HTML element. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ E | scala.Null, scala.Unit]] = js.undefined
}

object IElementRefProps {
  @scala.inline
  def apply[E /* <: stdLib.HTMLElement */](elementRef: /* ref */ E | scala.Null => scala.Unit = null): IElementRefProps[E] = {
    val __obj = js.Dynamic.literal()
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1(elementRef))
    __obj.asInstanceOf[IElementRefProps[E]]
  }
}

