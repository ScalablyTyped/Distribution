package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOverlayProps
  extends IOverlayableProps
     with IBackdropProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Toggles the visibility of the overlay and its children.
       * This prop is required because the component is controlled.
       */
  var isOpen: scala.Boolean
  /**
       * Name of the transition for internal `CSSTransition`.
       * Providing your own name here will require defining new CSS transition properties.
       * @default Classes.OVERLAY
       */
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

