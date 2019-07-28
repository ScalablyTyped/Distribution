package typings.bootstrap.bootstrapMod.Global

import typings.bootstrap.bootstrapMod.AlertEvent
import typings.bootstrap.bootstrapMod.CarouselEvent
import typings.bootstrap.bootstrapMod.CarouselEventHandler
import typings.bootstrap.bootstrapMod.CarouselOption
import typings.bootstrap.bootstrapMod.CollapseEvent
import typings.bootstrap.bootstrapMod.CollapseOption
import typings.bootstrap.bootstrapMod.DropdownEvent
import typings.bootstrap.bootstrapMod.DropdownOption
import typings.bootstrap.bootstrapMod.DropdownsEventHandler
import typings.bootstrap.bootstrapMod.ModalEvent
import typings.bootstrap.bootstrapMod.ModalEventHandler
import typings.bootstrap.bootstrapMod.ModalOption
import typings.bootstrap.bootstrapMod.PopoverEvent
import typings.bootstrap.bootstrapMod.PopoverOption
import typings.bootstrap.bootstrapMod.ScrollspyEvent
import typings.bootstrap.bootstrapMod.ScrollspyOption
import typings.bootstrap.bootstrapMod.TapEvent
import typings.bootstrap.bootstrapMod.TapEventHandler
import typings.bootstrap.bootstrapMod.ToastEvent
import typings.bootstrap.bootstrapMod.ToastOption
import typings.bootstrap.bootstrapMod.TooltipEvent
import typings.bootstrap.bootstrapMod.TooltipOption
import typings.bootstrap.bootstrapStrings.close
import typings.bootstrap.bootstrapStrings.cycle
import typings.bootstrap.bootstrapStrings.disable
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.enable
import typings.bootstrap.bootstrapStrings.handleUpdate
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.next
import typings.bootstrap.bootstrapStrings.pause
import typings.bootstrap.bootstrapStrings.prev
import typings.bootstrap.bootstrapStrings.refresh
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.toggleEnabled
import typings.bootstrap.bootstrapStrings.update
import typings.jquery.JQueryNs.EventHandler
import typings.jquery.JQueryNs.EventHandlerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery[TElement] extends js.Object {
  /**
    * If no _method_ is specified, makes an alert listen for click events on descendant elements which have the `data-dismiss="alert"` attribute.
    * (Not necessary when using the data-api's auto-initialization.)
    * Otherwise, call the method on the alert element:
    * * `close` – Closes an alert by removing it from the DOM. If the `.fade` and `.show` classes are present on the element, the alert will fade out before it is removed.
    * * `dispose` – Destroys an element's alert.
    */
  def alert(): this.type = js.native
  @JSName("alert")
  def alert_close(action: close): this.type = js.native
  @JSName("alert")
  def alert_dispose(action: dispose): this.type = js.native
  @JSName("button")
  def button_dispose(action: dispose): this.type = js.native
  /**
    * Call a method on the button element:
    * * `toggle` – Toggles push state. Gives the button the appearance that it has been activated.
    * * `dispose` – Destroys an element's button.
    */
  @JSName("button")
  def button_toggle(action: toggle): this.type = js.native
  /**
    * Initializes the carousel and starts cycling through items.
    */
  def carousel(): this.type = js.native
  def carousel(action: Double): this.type = js.native
  def carousel(options: CarouselOption): this.type = js.native
  /**
    * Call a method on the carousel element:
    * * `cycle` – Cycles through the carousel items from left to right.
    * * `pause` – Stops the carousel from cycling through items.
    * * _number_ – Cycles the carousel to a particular frame (0 based, similar to an array).
    * * `prev` – Cycles to the previous item.
    * * `next` – Cycles to the next item.
    * * `dispose` – Destroys an element's carousel.
    *
    * Returns to the caller before the target item has been shown (i.e. before the `slid.bs.carousel` event occurs).
    */
  @JSName("carousel")
  def carousel_cycle(action: cycle): this.type = js.native
  @JSName("carousel")
  def carousel_dispose(action: dispose): this.type = js.native
  @JSName("carousel")
  def carousel_next(action: next): this.type = js.native
  @JSName("carousel")
  def carousel_pause(action: pause): this.type = js.native
  @JSName("carousel")
  def carousel_prev(action: prev): this.type = js.native
  /**
    * Activates a content as a collapsible element.
    */
  def collapse(): this.type = js.native
  def collapse(options: CollapseOption): this.type = js.native
  @JSName("collapse")
  def collapse_dispose(action: dispose): this.type = js.native
  @JSName("collapse")
  def collapse_hide(action: hide): this.type = js.native
  @JSName("collapse")
  def collapse_show(action: show): this.type = js.native
  /**
    * Call a method on the collapsible element:
    * * `toggle` – Toggles a collapsible element to shown or hidden.
    * * `show` – Shows a collapsible element.
    * * `hide` – Hides a collapsible element.
    * * `dispose` – Destroys an element's collapse.
    *
    * Returns to the caller before the collapsible element has actually been shown or hidden (i.e. before the `shown.bs.collapse` or `hidden.bs.collapse` event occurs).
    */
  @JSName("collapse")
  def collapse_toggle(action: toggle): this.type = js.native
  /**
    * Toggle contextual overlays for displaying lists of links.
    *
    * The data-api, `data-toggle="dropdown"` is always required to be present on the dropdown's trigger element.
    */
  def dropdown(): this.type = js.native
  def dropdown(options: DropdownOption): this.type = js.native
  @JSName("dropdown")
  def dropdown_dispose(action: dispose): this.type = js.native
  @JSName("dropdown")
  def dropdown_hide(action: hide): this.type = js.native
  @JSName("dropdown")
  def dropdown_show(action: show): this.type = js.native
  /**
    * Call a method on the dropdown element:
    * * `toggle` – Toggles the dropdown menu of a given navbar or tabbed navigation.
    * * `show` – Shows the dropdown menu of a given navbar or tabbed navigation.
    * * `hide` – Hides the dropdown menu of a given navbar or tabbed navigation.
    * * `update` – Updates the position of an element's dropdown.
    * * `dispose` – Destroys an element's dropdown.
    */
  @JSName("dropdown")
  def dropdown_toggle(action: toggle): this.type = js.native
  @JSName("dropdown")
  def dropdown_update(action: update): this.type = js.native
  /**
    * Activates a content as a modal.
    */
  def modal(): this.type = js.native
  def modal(options: ModalOption): this.type = js.native
  @JSName("modal")
  def modal_dispose(action: dispose): this.type = js.native
  @JSName("modal")
  def modal_handleUpdate(action: handleUpdate): this.type = js.native
  @JSName("modal")
  def modal_hide(action: hide): this.type = js.native
  @JSName("modal")
  def modal_show(action: show): this.type = js.native
  /**
    * Call a method on the modal element:
    * * `toggle` – Manually toggles a modal.
    * * `show` – Manually opens a modal.
    * * `hide` – Manually hides a modal.
    * * `handleUpdate` – Manually readjust the modal's position if the height of a modal changes while it is open (i.e. in case a scrollbar appears).
    * * `dispose` – Destroys an element's modal.
    *
    * Returns to the caller before the modal has actually been shown or hidden (i.e. before the `shown.bs.modal` or `hidden.bs.modal` event occurs).
    */
  @JSName("modal")
  def modal_toggle(action: toggle): this.type = js.native
  def on(events: AlertEvent, handler: EventHandler[TElement, js.UndefOr[scala.Nothing]]): this.type = js.native
  def on(events: CarouselEvent, handler: EventHandlerBase[TElement, CarouselEventHandler[TElement]]): this.type = js.native
  def on(events: CollapseEvent, handler: EventHandler[TElement, js.UndefOr[scala.Nothing]]): this.type = js.native
  def on(events: DropdownEvent, handler: EventHandlerBase[TElement, DropdownsEventHandler[TElement]]): this.type = js.native
  def on(events: ModalEvent, handler: EventHandlerBase[TElement, ModalEventHandler[TElement]]): this.type = js.native
  def on(events: PopoverEvent, handler: EventHandler[TElement, js.UndefOr[scala.Nothing]]): this.type = js.native
  def on(events: ScrollspyEvent, handler: EventHandler[TElement, js.UndefOr[scala.Nothing]]): this.type = js.native
  def on(events: TapEvent, handler: EventHandlerBase[TElement, TapEventHandler[TElement]]): this.type = js.native
  def on(events: ToastEvent, handler: EventHandler[TElement, js.UndefOr[scala.Nothing]]): this.type = js.native
  def on(events: TooltipEvent, handler: EventHandler[TElement, js.UndefOr[scala.Nothing]]): this.type = js.native
  /**
    * Initializes popovers for an element collection.
    */
  def popover(): this.type = js.native
  def popover(options: PopoverOption): this.type = js.native
  @JSName("popover")
  def popover_disable(action: disable): this.type = js.native
  @JSName("popover")
  def popover_dispose(action: dispose): this.type = js.native
  @JSName("popover")
  def popover_enable(action: enable): this.type = js.native
  @JSName("popover")
  def popover_hide(action: hide): this.type = js.native
  /**
    * Call a method on the popover element:
    * * `show` – Reveals an element's popover. Popovers whose both title and content are zero-length are never displayed.
    * * `hide` – Hides an element's popover.
    * * `toggle` – Toggles an element's popover.
    * * `dispose` – Hides and destroys an element's popover.
    * Popovers that use delegation (which are created using the `selector` option) cannot be individually destroyed on descendant trigger elements.
    * * `enable` – Gives an element's popover the ability to be shown. Popovers are enabled by default.
    * * `disable` – Removes the ability for an element's popover to be shown. The popover will only be able to be shown if it is re-enabled.
    * * `toggleEnabled` – Toggles the ability for an element's popover to be shown or hidden.
    * * `update` – Updates the position of an element's popover.
    *
    * Returns to the caller before the popover has actually been shown or hidden (i.e. before the `shown.bs.popover` or `hidden.bs.popover` event occurs).
    * This is considered a "manual" triggering of the popover.
    */
  @JSName("popover")
  def popover_show(action: show): this.type = js.native
  @JSName("popover")
  def popover_toggle(action: toggle): this.type = js.native
  @JSName("popover")
  def popover_toggleEnabled(action: toggleEnabled): this.type = js.native
  @JSName("popover")
  def popover_update(action: update): this.type = js.native
  /**
    * Add scrollspy behavior to a topbar navigation.
    */
  def scrollspy(): this.type = js.native
  def scrollspy(options: ScrollspyOption): this.type = js.native
  @JSName("scrollspy")
  def scrollspy_dispose(action: dispose): this.type = js.native
  // tslint:disable:jsdoc-format
  /**
    * Call a method on the scrollspy element:
    * * `refresh` – When using scrollspy in conjunction with adding or removing of elements from the DOM, you'll need to call the refresh, see example.
    * * `dispose` – Destroys an element's scrollspy.
    *
    * @example
  ```javascript
  $('[data-spy="scroll"]').each(function () {
    var $spy = $(this).scrollspy('refresh')
  })
  ```
    */
  // tslint:enable:jsdoc-format
  @JSName("scrollspy")
  def scrollspy_refresh(action: refresh): this.type = js.native
  @JSName("tab")
  def tab_dispose(action: dispose): this.type = js.native
  /**
    * Call a method on the list item or tab element:
    * * `show` – Selects the given list item or tab and shows its associated pane.
    * Any other list item or tab that was previously selected becomes unselected and its associated pane is hidden.
    * * `dispose` – Destroys an element's tab.
    *
    * Returns to the caller before the tab pane has actually been shown (i.e. before the `shown.bs.tab` event occurs).
    */
  @JSName("tab")
  def tab_show(action: show): this.type = js.native
  /**
    * Attaches a toast handler to an element collection.
    */
  def toast(): this.type = js.native
  def toast(options: ToastOption): this.type = js.native
  @JSName("toast")
  def toast_dispose(action: dispose): this.type = js.native
  @JSName("toast")
  def toast_hide(action: hide): this.type = js.native
  /**
    * Call a method on the toast element:
    * * `show` – Reveals an element's toast. You have to manually call this method, instead your toast won't show.
    * * `hide` – Hides an element's toast. You have to manually call this method if you made `autohide` to false.
    * * `dispose` – Hides an element's toast. Your toast will remain on the DOM but won't show anymore.
    *
    * Returns to the caller before the toast has actually been shown or hidden (i.e. before the `shown.bs.toast` or `hidden.bs.toast` event occurs).
    */
  @JSName("toast")
  def toast_show(action: show): this.type = js.native
  /**
    * Attaches a tooltip handler to an element collection.
    */
  def tooltip(): this.type = js.native
  def tooltip(options: TooltipOption): this.type = js.native
  @JSName("tooltip")
  def tooltip_disable(action: disable): this.type = js.native
  @JSName("tooltip")
  def tooltip_dispose(action: dispose): this.type = js.native
  @JSName("tooltip")
  def tooltip_enable(action: enable): this.type = js.native
  @JSName("tooltip")
  def tooltip_hide(action: hide): this.type = js.native
  /**
    * Call a method on the tooltip element:
    * * `show` – Reveals an element's tooltip. Tooltips with zero-length titles are never displayed.
    * * `hide` – Hides an element's tooltip.
    * * `toggle` – Toggles an element's tooltip.
    * * `dispose` – Hides and destroys an element's tooltip.
    * Tooltips that use delegation (which are created using `selector` option) cannot be individually destroyed on descendant trigger elements.
    * * `enable` – Gives an element's tooltip the ability to be shown. Tooltips are enabled by default.
    * * `disable` – Removes the ability for an element's tooltip to be shown. The tooltip will only be able to be shown if it is re-enabled.
    * * `toggleEnabled` – Toggles the ability for an element's tooltip to be shown or hidden.
    * * `update` – Updates the position of an element's tooltip.
    *
    * Returns to the caller before the tooltip has actually been shown or hidden (i.e. before the `shown.bs.tooltip` or `hidden.bs.tooltip` event occurs).
    * This is considered a "manual" triggering of the tooltip.
    */
  @JSName("tooltip")
  def tooltip_show(action: show): this.type = js.native
  @JSName("tooltip")
  def tooltip_toggle(action: toggle): this.type = js.native
  @JSName("tooltip")
  def tooltip_toggleEnabled(action: toggleEnabled): this.type = js.native
  @JSName("tooltip")
  def tooltip_update(action: update): this.type = js.native
}

