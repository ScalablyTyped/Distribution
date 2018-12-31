package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackdropProps extends js.Object {
  /** CSS class names to apply to backdrop element. */
  var backdropClassName: js.UndefOr[java.lang.String] = js.undefined
  /** HTML props for the backdrop element. */
  var backdropProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement]] = js.undefined
  /**
    * Whether clicking outside the overlay element (either on backdrop when present or on document)
    * should invoke `onClose`.
    * @default true
    */
  var canOutsideClickClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether a container-spanning backdrop element should be rendered behind the contents.
    * @default true
    */
  var hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
}

