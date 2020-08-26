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

@js.native
trait TooltipOption extends js.Object {
  /**
    * Apply a CSS fade transition to the tooltip or popover.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Overflow constraint boundary of the tooltip or popover.
    * Accepts the values of 'viewport', 'window', 'scrollParent',
    * or an HTMLElement reference (JavaScript only).
    * For more information refer to Popper.js's preventOverflow docs.
    *
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary | HTMLElement] = js.native
  /**
    * Appends the tooltip or popover to a specific element. Example: `container: 'body'`.
    * This option is particularly useful in that it allows you to position the tooltip or popover
    * in the flow of the document near the triggering element - which will prevent
    * it from floating away from the triggering element during a window resize.
    *
    * @default false
    */
  var container: js.UndefOr[String | Element | `false`] = js.native
  /**
    * Delay showing and hiding the tooltip or popover (ms) - does not apply to manual trigger type.
    * If a number is supplied, delay is applied to both hide/show.
    * Object structure is: `delay: { "show": 500, "hide": 100 }`.
    *
    * @default 0
    */
  var delay: js.UndefOr[Double | Delay] = js.native
  /**
    * Allow to specify which position Popper will use on fallback.
    * For more information refer to Popper.js's behavior docs.
    *
    * @default "flip"
    */
  var fallbackPlacement: js.UndefOr[Behavior | js.Array[Behavior]] = js.native
  /**
    * Allow HTML in the tooltip or popover.
    * If true, HTML tags will be rendered in the tooltip or popover.
    * If false, jQuery's text method will be used to insert content into the DOM.
    * Use text if you're worried about XSS attacks.
    *
    * @default false
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * Offset of the tooltip or popover relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[Double | String] = js.native
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
      /* node */ HTMLElement, 
      /* trigger */ Element, 
      Placement
    ])
  ] = js.native
  /**
    * To change Bootstrap's default Popper.js config,
    * see {@link https://popper.js.org/docs/v1/ Popper.js's configuration}
    */
  var popperConfig: js.UndefOr[Null | js.Object] = js.native
  /**
    * Enable or disable the sanitization. If activated 'template', 'content' and 'title' options will be sanitized.
    *
    * @default true
    */
  var sanitize: js.UndefOr[Boolean] = js.native
  /**
    * Here you can supply your own sanitize function. This can be useful if you prefer to use a dedicated library to perform sanitization.
    *
    * @default null
    */
  var sanitizeFn: js.UndefOr[Null | (js.Function1[/* input */ String, String])] = js.native
  /**
    * If a selector is provided, tooltip or popover objects will be delegated to the specified targets.
    * In practice, this is used to enable dynamic HTML content to have popovers added.
    *
    * @default false
    */
  var selector: js.UndefOr[String | `false`] = js.native
  /**
    * Base HTML to use when creating the tooltip or popover.
    * The tooltip's (resp., popover's) title will be injected into the `.tooltip-inner` (resp., `.popover-header`).
    * The `.arrow` will become the tooltip's (resp., popover's) arrow.
    * The outermost wrapper element should have the `.tooltip` (resp., .popover) class and `role="tooltip"`.
    *
    * @default '<div class="tooltip" role="tooltip"><div class="arrow"></div><div class="tooltip-inner"></div></div>'
    * @default '<div class="popover" role="tooltip"><div class="arrow"></div><h3 class="popover-header"></h3><div class="popover-body"></div></div>'
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Default title value if title attribute isn't present.
    * If a function is given, it will be called with its `this` reference set to the element
    * that the tooltip or popover is attached to.
    *
    * @default ""
    */
  var title: js.UndefOr[String | Element | (js.ThisFunction0[/* this */ Element, String | Element])] = js.native
  /**
    * How tooltip or popover is triggered - click | hover | focus | manual. You may pass multiple triggers; separate them with a space.
    * 'manual' indicates that the tooltip will be triggered programmatically; this value cannot be combined with any other trigger.
    * 'hover' should only be used if alternative methods for conveying the same information for keyboard users is present.
    *
    * @default tooltip: "hover focus", popover: "click"
    */
  var trigger: js.UndefOr[Trigger] = js.native
  /**
    * Object which contains allowed attributes and tags.
    */
  var whiteList: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object TooltipOption {
  @scala.inline
  def apply(): TooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOption]
  }
  @scala.inline
  implicit class TooltipOptionOps[Self <: TooltipOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBoundary(value: Boundary | HTMLElement): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setContainer(value: String | Element | `false`): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDelay(value: Double | Delay): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFallbackPlacementVarargs(value: Behavior*): Self = this.set("fallbackPlacement", js.Array(value :_*))
    @scala.inline
    def setFallbackPlacement(value: Behavior | js.Array[Behavior]): Self = this.set("fallbackPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackPlacement: Self = this.set("fallbackPlacement", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPlacement(
      value: Placement | (js.ThisFunction2[
          /* this */ TooltipInstance[TooltipOption], 
          /* node */ HTMLElement, 
          /* trigger */ Element, 
          Placement
        ])
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopperConfig(value: js.Object): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    @scala.inline
    def setPopperConfigNull: Self = this.set("popperConfig", null)
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    @scala.inline
    def setSanitizeFn(value: /* input */ String => String): Self = this.set("sanitizeFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSanitizeFn: Self = this.set("sanitizeFn", js.undefined)
    @scala.inline
    def setSanitizeFnNull: Self = this.set("sanitizeFn", null)
    @scala.inline
    def setSelector(value: String | `false`): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitle(value: String | Element | (js.ThisFunction0[/* this */ Element, String | Element])): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrigger(value: Trigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setWhiteList(value: StringDictionary[js.Array[String]]): Self = this.set("whiteList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteList: Self = this.set("whiteList", js.undefined)
  }
  
}

