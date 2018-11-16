package typings
package atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPopoverProps
  extends atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod.IPopoverSharedProps {
  /** HTML props for the backdrop element. Can be combined with `backdropClassName`. */
  var backdropProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLDivElement]] = js.undefined
  /**
       * The content displayed inside the popover. This can instead be provided as
       * the _second_ element in `children` (first is `target`).
       */
  var content: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Enables an invisible overlay beneath the popover that captures clicks and
       * prevents interaction with the rest of the document until the popover is
       * closed. This prop is only available when `interactionKind` is
       * `PopoverInteractionKind.CLICK`. When popovers with backdrop are opened,
       * they become focused.
       * @default false
       */
  var hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The kind of interaction that triggers the display of the popover.
       * @default PopoverInteractionKind.CLICK
       */
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.undefined
  /**
       * Whether to apply minimal styles to this popover, which includes removing
       * the arrow and adding `Classes.MINIMAL` to minimize and accelerate the
       * transitions.
       * @default false
       */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Ref supplied to the `Classes.POPOVER` element.
       */
  var popoverRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLDivElement | scala.Null, scala.Unit]] = js.undefined
  /**
       * The target to which the popover content is attached. This can instead be
       * provided as the _first_ element in `children`.
       */
  var target: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

