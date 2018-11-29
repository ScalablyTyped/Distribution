package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOverlayableProps extends IOverlayLifecycleProps {
  /**
       * Whether the overlay should acquire application focus when it first opens.
       * @default true
       */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether pressing the `esc` key should invoke `onClose`.
       * @default true
       */
  var canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
       * to focus an element outside the overlay and this prop is enabled, then the overlay will
       * immediately bring focus back to itself. If you are nesting overlay components, either disable
       * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
       * @default true
       */
  var enforceFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
       * to the DOM when the overlay is opened for the first time; otherwise this happens when the
       * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
       * of overlays at once, such as on each row of a table.
       * @default true
       */
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A callback that is invoked when user interaction causes the overlay to close, such as
       * clicking on the overlay or pressing the `esc` key (if enabled).
       *
       * Receives the event from the user's interaction, if there was an event (generally either a
       * mouse or key event). Note that, since this component is controlled by the `isOpen` prop, it
       * will not actually close itself until that prop becomes `false`.
       */
  var onClose: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Space-delimited string of class names applied to the `Portal` element if
       * `usePortal={true}`.
       */
  var portalClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The container element into which the overlay renders its contents, when `usePortal` is `true`.
       * This prop is ignored if `usePortal` is `false`.
       * @default document.body
       */
  var portalContainer: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
       * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
       * This is used by React `CSSTransition` to know when a transition completes and must match
       * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
       * transitions with new transitions of a different length.
       * @default 100
       */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether the overlay should be wrapped in a `Portal`, which renders its contents in a new
       * element attached to `portalContainer` prop.
       *
       * This prop essentially determines which element is covered by the backdrop: if `false`,
       * then only its parent is covered; otherwise, the entire page is covered (because the parent
       * of the `Portal` is the `<body>` itself).
       *
       * Set this prop to `false` on nested overlays (such as `Dialog` or `Popover`) to ensure that they
       * are rendered above their parents.
       * @default true
       */
  var usePortal: js.UndefOr[scala.Boolean] = js.undefined
}

