package typings.bootstrap.tooltipMod.Tooltip

import typings.bootstrap.anon.Hide
import typings.bootstrap.anon.RecordkeyofHTMLElementTag
import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.`click focus`
import typings.bootstrap.bootstrapStrings.`click hover focus`
import typings.bootstrap.bootstrapStrings.`click hover`
import typings.bootstrap.bootstrapStrings.`hover focus`
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.bottom
import typings.bootstrap.bootstrapStrings.click
import typings.bootstrap.bootstrapStrings.focus
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.left
import typings.bootstrap.bootstrapStrings.manual
import typings.bootstrap.bootstrapStrings.right
import typings.bootstrap.bootstrapStrings.scrollParent
import typings.bootstrap.bootstrapStrings.top
import typings.bootstrap.bootstrapStrings.viewport
import typings.bootstrap.bootstrapStrings.window
import typings.popperJs.mod.Behavior
import typings.popperJs.mod.PopperOptions
import typings.popperJs.mod.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Apply a CSS fade transition to the tooltip
    *
    * @default true
    */
  var animation: Boolean = js.native
  
  /**
    * Overflow constraint boundary of the popover. Accepts the values of
    * 'viewport', 'window', 'scrollParent', or an HTMLElement reference
    * (JavaScript only).
    *
    * @see {@link https://popper.js.org/docs/v1/#modifiers..preventOverflow.boundariesElement}
    * @default 'scrollParent'
    */
  var boundary: viewport | window | scrollParent | Element = js.native
  
  /**
    * Appends the tooltip to a specific element. Example: container:
    * 'body'. This option is particularly useful in that it allows you to
    * position the tooltip in the flow of the document near the triggering
    * element - which will prevent the tooltip from floating away from the
    * triggering element during a window resize.
    *
    * @default false
    */
  var container: String | Element | `false` = js.native
  
  /**
    * Delay showing and hiding the popover (ms) - does not apply to manual
    * trigger type
    *
    * If a number is supplied, delay is applied to both hide/show
    *
    * @default 0
    */
  var delay: Double | Hide = js.native
  
  /**
    * Allow to specify which position Popper will use on fallback.
    *
    * @see {@link https://popper.js.org/docs/v1/#modifiers..flip.behavior}
    * @default 'flip'
    */
  var fallbackPlacement: Behavior | js.Array[Position] = js.native
  
  /**
    * Allow HTML in the tooltip.
    *
    * If true, HTML tags in the tooltip's title will be rendered in the
    * tooltip. If false, innerText property will be used to insert content
    * into the DOM.
    *
    * Use text if you're worried about XSS attacks.
    *
    * @default false
    */
  var html: Boolean = js.native
  
  /**
    * Offset of the tooltip relative to its target.
    *
    * When a function is used to determine the offset, it is called with an
    * object containing the offset data as its first argument. The function
    * must return an object with the same structure. The triggering element
    * DOM node is passed as the second argument.
    *
    * @see {@link https://popper.js.org/docs/v1/#modifiers..offset.offset}
    * @default 0
    */
  var offset: Double | String | js.Function0[Unit] = js.native
  
  /**
    * How to position the popover - auto | top | bottom | left | right.
    * When auto is specified, it will dynamically reorient the popover.
    *
    * When a function is used to determine the placement, it is called with
    * the popover DOM node as its first argument and the triggering element
    * DOM node as its second. The this context is set to the popover
    * instance.
    *
    * @default 'top'
    */
  var placement: auto | top | bottom | left | right | js.Function0[Unit] = js.native
  
  /**
    * To change Bootstrap's default Popper.js config
    *
    * @see {@link https://popper.js.org/docs/v1/#Popper.Defaults}
    * @default null
    */
  var popperConfig: PopperOptions | Null = js.native
  
  /**
    * Enable or disable the sanitization. If activated 'template' and
    * 'title' options will be sanitized.
    *
    * @default true
    */
  var sanitize: Boolean = js.native
  
  /**
    * Here you can supply your own sanitize function. This can be useful if
    * you prefer to use a dedicated library to perform sanitization.
    *
    * @default null
    */
  def sanitizeFn(): Unit | Null = js.native
  
  /**
    * If a selector is provided, tooltip objects will be delegated to the
    * specified targets. In practice, this is used to also apply tooltips
    * to dynamically added DOM elements (jQuery.on support).
    *
    * @default false
    */
  var selector: String | `false` = js.native
  
  /**
    * Base HTML to use when creating the tooltip.
    *
    * The tooltip's title will be injected into the .tooltip-inner.
    *
    * .tooltip-arrow will become the tooltip's arrow.
    *
    * The outermost wrapper element should have the .tooltip class and
    * role="tooltip".
    *
    * @default '<div class="tooltip" role="tooltip"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div>'
    */
  var template: String = js.native
  
  /**
    * Default title value if title attribute isn't present.
    *
    * If a function is given, it will be called with its this reference set
    * to the element that the popover is attached to.
    *
    * @default ''
    */
  var title: String | Element | js.Function0[Unit] = js.native
  
  /**
    * How tooltip is triggered - click | hover | focus | manual. You may
    * pass multiple triggers; separate them with a space.
    *
    * 'manual' indicates that the tooltip will be triggered
    * programmatically via the .tooltip('show'), .tooltip('hide') and
    * .tooltip('toggle') methods; this value cannot be combined with any
    * other trigger.
    *
    * 'hover' on its own will result in tooltips that cannot be triggered
    * via the keyboard, and should only be used if alternative methods for
    * conveying the same information for keyboard users is present.
    *
    * @default 'hover focus'
    */
  var trigger: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`) = js.native
  
  /**
    * Object which contains allowed attributes and tags
    *
    * @see {@link https://v5.getbootstrap.com/docs/5.0/getting-started/javascript/#sanitizer}
    */
  var whiteList: RecordkeyofHTMLElementTag = js.native
}
object Options {
  
  @scala.inline
  def apply(
    animation: Boolean,
    boundary: viewport | window | scrollParent | Element,
    container: String | Element | `false`,
    delay: Double | Hide,
    fallbackPlacement: Behavior | js.Array[Position],
    html: Boolean,
    offset: Double | String | js.Function0[Unit],
    placement: auto | top | bottom | left | right | js.Function0[Unit],
    sanitize: Boolean,
    sanitizeFn: () => Unit | Null,
    selector: String | `false`,
    template: String,
    title: String | Element | js.Function0[Unit],
    trigger: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`),
    whiteList: RecordkeyofHTMLElementTag
  ): Options = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], fallbackPlacement = fallbackPlacement.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], sanitizeFn = js.Any.fromFunction0(sanitizeFn), selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBoundary(value: viewport | window | scrollParent | Element): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String | Element | `false`): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackPlacementVarargs(value: Position*): Self = this.set("fallbackPlacement", js.Array(value :_*))
    
    @scala.inline
    def setFallbackPlacement(value: Behavior | js.Array[Position]): Self = this.set("fallbackPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetFunction0(value: () => Unit): Self = this.set("offset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffset(value: Double | String | js.Function0[Unit]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementFunction0(value: () => Unit): Self = this.set("placement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizeFn(value: () => Unit | Null): Self = this.set("sanitizeFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelector(value: String | `false`): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => Unit): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String | Element | js.Function0[Unit]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(
      value: click | hover | focus | manual | (`click hover`) | (`click focus`) | (`hover focus`) | (`click hover focus`)
    ): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteList(value: RecordkeyofHTMLElementTag): Self = this.set("whiteList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperConfig(value: PopperOptions): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperConfigNull: Self = this.set("popperConfig", null)
  }
}
