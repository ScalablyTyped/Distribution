package typings.bootstrap.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bootstrap.bootstrapBooleans.`false`
import typings.popperJs.mod.Behavior
import typings.popperJs.mod.Boundary
import typings.std.Element
import typings.std.HTMLElement
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
  var content: js.UndefOr[String | Element | (js.ThisFunction0[/* this */ Element, String | Element])] = js.undefined
}

object PopoverOption {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    boundary: Boundary | HTMLElement = null,
    container: String | Element | `false` = null,
    content: String | Element | (js.ThisFunction0[/* this */ Element, String | Element]) = null,
    delay: Double | Delay = null,
    fallbackPlacement: Behavior | js.Array[Behavior] = null,
    html: js.UndefOr[Boolean] = js.undefined,
    offset: Double | String = null,
    placement: Placement | (js.ThisFunction2[
      /* this */ TooltipInstance[PopoverOption], 
      /* node */ HTMLElement, 
      /* trigger */ Element, 
      Placement
    ]) = null,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    sanitizeFn: /* input */ String => String = null,
    selector: String | `false` = null,
    template: String = null,
    title: String | Element | (js.ThisFunction0[/* this */ Element, String | Element]) = null,
    trigger: Trigger = null,
    whiteList: StringDictionary[js.Array[String]] = null
  ): PopoverOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (fallbackPlacement != null) __obj.updateDynamic("fallbackPlacement")(fallbackPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (sanitizeFn != null) __obj.updateDynamic("sanitizeFn")(js.Any.fromFunction1(sanitizeFn))
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverOption]
  }
}

