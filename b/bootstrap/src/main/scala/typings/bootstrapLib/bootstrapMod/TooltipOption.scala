package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOption extends js.Object {
  /**
    * Apply a CSS fade transition to the tooltip or popover.
    *
    * @default true
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overflow constraint boundary of the tooltip or popover.
    * Accepts the values of 'viewport', 'window', 'scrollParent',
    * or an HTMLElement reference (JavaScript only).
    * For more information refer to Popper.js's preventOverflow docs.
    *
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[popperDotJsLib.popperDotJsMod.Boundary | stdLib.HTMLElement] = js.undefined
  /**
    * Appends the tooltip or popover to a specific element. Example: `container: 'body'`.
    * This option is particularly useful in that it allows you to position the tooltip or popover
    * in the flow of the document near the triggering element - which will prevent
    * it from floating away from the triggering element during a window resize.
    *
    * @default false
    */
  var container: js.UndefOr[java.lang.String | stdLib.Element | bootstrapLib.bootstrapLibNumbers.`false`] = js.undefined
  /**
    * Delay showing and hiding the tooltip or popover (ms) - does not apply to manual trigger type.
    * If a number is supplied, delay is applied to both hide/show.
    * Object structure is: `delay: { "show": 500, "hide": 100 }`.
    *
    * @default 0
    */
  var delay: js.UndefOr[scala.Double | Delay] = js.undefined
  /**
    * Allow to specify which position Popper will use on fallback.
    * For more information refer to Popper.js's behavior docs.
    *
    * @default "flip"
    */
  var fallbackPlacement: js.UndefOr[
    popperDotJsLib.popperDotJsMod.Behavior | js.Array[popperDotJsLib.popperDotJsMod.Behavior]
  ] = js.undefined
  /**
    * Allow HTML in the tooltip or popover.
    * If true, HTML tags will be rendered in the tooltip or popover.
    * If false, jQuery's text method will be used to insert content into the DOM.
    * Use text if you're worried about XSS attacks.
    *
    * @default false
    */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Offset of the tooltip or popover relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * How to position the tooltip or popover - auto | top | bottom | left | right.
    * When "auto" is specified, it will dynamically reorient the tooltip or popover.
    *
    * When a function is used to determine the placement, it is called with
    * the tooltip or popover DOM node as its first argument and the triggering element DOM node as its second.
    * The `this` context is set to the tooltip or popover instance.
    *
    * @default tooltip: "top", popover: "right"
    */
  var placement: js.UndefOr[
    Placement | (js.ThisFunction2[
      /* this */ TooltipInstance[this.type], 
      /* node */ stdLib.HTMLElement, 
      /* trigger */ stdLib.Element, 
      Placement
    ])
  ] = js.undefined
  /**
    * If a selector is provided, tooltip or popover objects will be delegated to the specified targets.
    * In practice, this is used to enable dynamic HTML content to have popovers added.
    *
    * @default false
    */
  var selector: js.UndefOr[java.lang.String | bootstrapLib.bootstrapLibNumbers.`false`] = js.undefined
  /**
    * Base HTML to use when creating the tooltip or popover.
    * The tooltip's (resp., popover's) title will be injected into the `.tooltip-inner` (resp., `.popover-header`).
    * The `.arrow` will become the tooltip's (resp., popover's) arrow.
    * The outermost wrapper element should have the `.tooltip` (resp., .popover) class and `role="tooltip"`.
    *
    * @default '<div class="tooltip" role="tooltip"><div class="arrow"></div><div class="tooltip-inner"></div></div>'
    * @default '<div class="popover" role="tooltip"><div class="arrow"></div><h3 class="popover-header"></h3><div class="popover-body"></div></div>'
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default title value if title attribute isn't present.
    * If a function is given, it will be called with its `this` reference set to the element
    * that the tooltip or popover is attached to.
    *
    * @default ""
    */
  var title: js.UndefOr[
    java.lang.String | stdLib.Element | (js.ThisFunction0[/* this */ stdLib.Element, java.lang.String | stdLib.Element])
  ] = js.undefined
  /**
    * How tooltip or popover is triggered - click | hover | focus | manual. You may pass multiple triggers; separate them with a space.
    * 'manual' indicates that the tooltip will be triggered programmatically; this value cannot be combined with any other trigger.
    * 'hover' should only be used if alternative methods for conveying the same information for keyboard users is present.
    *
    * @default tooltip: "hover focus", popover: "click"
    */
  var trigger: js.UndefOr[Trigger] = js.undefined
}

