package typings
package atBlueprintjsCoreLib.libEsmComponentsDialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDialogProps
  extends atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IOverlayableProps
     with atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IBackdropProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Name of a Blueprint UI icon (or an icon element) to render in the
       * dialog's header. Note that the header will only be rendered if `title` is
       * provided.
       */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /**
       * Whether to show the close button in the dialog's header.
       * Note that the header will only be rendered if `title` is provided.
       * @default true
       */
  var isCloseButtonShown: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Toggles the visibility of the overlay and its children.
       * This prop is required because the component is controlled.
       */
  var isOpen: scala.Boolean
  /**
       * CSS styles to apply to the dialog.
       * @default {}
       */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
       * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
       * will be rendered inside the dialog before any children elements.
       */
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * Name of the transition for internal `CSSTransition`. Providing your own
       * name here will require defining new CSS transition properties.
       */
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

