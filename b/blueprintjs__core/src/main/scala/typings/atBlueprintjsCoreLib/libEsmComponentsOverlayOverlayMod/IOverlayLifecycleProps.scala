package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayLifecycleProps extends js.Object {
  /**
    * Lifecycle method invoked just after the CSS _close_ transition ends but
    * before the child has been removed from the DOM. Receives the DOM element
    * of the child being closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, scala.Unit]] = js.undefined
  /**
    * Lifecycle method invoked just before the CSS _close_ transition begins on
    * a child. Receives the DOM element of the child being closed.
    */
  var onClosing: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, scala.Unit]] = js.undefined
  /**
    * Lifecycle method invoked just after the CSS _open_ transition ends.
    * Receives the DOM element of the child being opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, scala.Unit]] = js.undefined
  /**
    * Lifecycle method invoked just after mounting the child in the DOM but
    * just before the CSS _open_ transition begins. Receives the DOM element of
    * the child being opened.
    */
  var onOpening: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, scala.Unit]] = js.undefined
}

object IOverlayLifecycleProps {
  @scala.inline
  def apply(
    onClosed: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onClosing: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpened: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpening: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null
  ): IOverlayLifecycleProps = {
    val __obj = js.Dynamic.literal()
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onClosing != null) __obj.updateDynamic("onClosing")(onClosing)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (onOpening != null) __obj.updateDynamic("onOpening")(onOpening)
    __obj.asInstanceOf[IOverlayLifecycleProps]
  }
}

