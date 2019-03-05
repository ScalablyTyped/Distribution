package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOption extends TooltipOption {
  /**
    * Default content value if `data-content` attribute isn't present.
    * If a function is given, it will be called with its `this` reference
    * set to the element that the popover is attached to.
    *
    * @default ""
    */
  var content: js.UndefOr[
    java.lang.String | stdLib.Element | (js.ThisFunction0[/* this */ stdLib.Element, java.lang.String | stdLib.Element])
  ] = js.undefined
}

object PopoverOption {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    boundary: popperDotJsLib.popperDotJsMod.Boundary | stdLib.HTMLElement = null,
    container: java.lang.String | stdLib.Element | bootstrapLib.bootstrapLibNumbers.`false` = null,
    content: java.lang.String | stdLib.Element | (js.ThisFunction0[/* this */ stdLib.Element, java.lang.String | stdLib.Element]) = null,
    delay: scala.Double | Delay = null,
    fallbackPlacement: popperDotJsLib.popperDotJsMod.Behavior | js.Array[popperDotJsLib.popperDotJsMod.Behavior] = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Double | java.lang.String = null,
    placement: Placement | (js.ThisFunction2[
      /* this */ TooltipInstance[PopoverOption], 
      /* node */ stdLib.HTMLElement, 
      /* trigger */ stdLib.Element, 
      Placement
    ]) = null,
    sanitize: js.UndefOr[scala.Boolean] = js.undefined,
    sanitizeFn: js.Function1[/* input */ java.lang.String, java.lang.String] = null,
    selector: java.lang.String | bootstrapLib.bootstrapLibNumbers.`false` = null,
    template: java.lang.String = null,
    title: java.lang.String | stdLib.Element | (js.ThisFunction0[/* this */ stdLib.Element, java.lang.String | stdLib.Element]) = null,
    trigger: Trigger = null,
    whiteList: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null
  ): PopoverOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (fallbackPlacement != null) __obj.updateDynamic("fallbackPlacement")(fallbackPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    if (sanitizeFn != null) __obj.updateDynamic("sanitizeFn")(sanitizeFn)
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (whiteList != null) __obj.updateDynamic("whiteList")(whiteList)
    __obj.asInstanceOf[PopoverOption]
  }
}

