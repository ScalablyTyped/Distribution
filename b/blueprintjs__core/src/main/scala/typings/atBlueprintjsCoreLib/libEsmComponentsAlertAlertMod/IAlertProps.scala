package typings
package atBlueprintjsCoreLib.libEsmComponentsAlertAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAlertProps
  extends atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IOverlayLifecycleProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Whether pressing <kbd>escape</kbd> when focused on the Alert should cancel the alert.
       * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
       * @default false
       */
  var canEscapeKeyCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether clicking outside the Alert should cancel the alert.
       * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
       * @default false
       */
  var canOutsideClickCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The text for the cancel button.
       * If this prop is defined, then either `onCancel` or `onClose` must also be defined.
       */
  var cancelButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The text for the confirm (right-most) button.
       * This button will always appear, and uses the value of the `intent` prop below.
       * @default "OK"
       */
  var confirmButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to display on the left side. */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /**
       * The intent to be applied to the confirm (right-most) button.
       */
  var intent: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent] = js.undefined
  /**
       * Toggles the visibility of the alert.
       * This prop is required because the component is controlled.
       */
  var isOpen: scala.Boolean
  /**
       * Handler invoked when the alert is canceled. Alerts can be **canceled** in the following ways:
       * - clicking the cancel button (if `cancelButtonText` is defined)
       * - pressing the escape key (if `canEscapeKeyCancel` is enabled)
       * - clicking on the overlay backdrop (if `canOutsideClickCancel` is enabled)
       *
       * If any of the `cancel` props are defined, then either `onCancel` or `onClose` must be defined.
       */
  var onCancel: js.UndefOr[
    js.Function1[
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Handler invoked when the Alert is confirmed or canceled; see `onConfirm` and `onCancel` for more details.
       * First argument is `true` if confirmed, `false` otherwise.
       * This is an alternative to defining separate `onConfirm` and `onCancel` handlers.
       */
  var onClose: js.UndefOr[
    js.Function2[
      /* confirmed */ scala.Boolean, 
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Handler invoked when the confirm button is clicked. Alerts can be **confirmed** in the following ways:
       * - clicking the confirm button
       * - focusing on the confirm button and pressing `enter` or `space`
       */
  var onConfirm: js.UndefOr[
    js.Function1[
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * The container element into which the overlay renders its contents, when `usePortal` is `true`.
       * This prop is ignored if `usePortal` is `false`.
       * @default document.body
       */
  var portalContainer: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
       * CSS styles to apply to the alert.
       */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
       * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
       * This is used by React `CSSTransition` to know when a transition completes and must match
       * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
       * transitions with new transitions of a different length.
       * @default 300
       */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

