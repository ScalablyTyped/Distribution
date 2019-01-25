package typings
package bootstrapLib.bootstrapMod.Global

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
  def alert_close(action: bootstrapLib.bootstrapLibStrings.close): this.type = js.native
  @JSName("alert")
  def alert_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("button")
  def button_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  /**
    * Call a method on the button element:
    * * `toggle` – Toggles push state. Gives the button the appearance that it has been activated.
    * * `dispose` – Destroys an element's button.
    */
  @JSName("button")
  def button_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  /**
    * Initializes the carousel and starts cycling through items.
    */
  def carousel(): this.type = js.native
  def carousel(action: scala.Double): this.type = js.native
  def carousel(options: bootstrapLib.bootstrapMod.CarouselOption): this.type = js.native
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
  def carousel_cycle(action: bootstrapLib.bootstrapLibStrings.cycle): this.type = js.native
  @JSName("carousel")
  def carousel_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("carousel")
  def carousel_next(action: bootstrapLib.bootstrapLibStrings.next): this.type = js.native
  @JSName("carousel")
  def carousel_pause(action: bootstrapLib.bootstrapLibStrings.pause): this.type = js.native
  @JSName("carousel")
  def carousel_prev(action: bootstrapLib.bootstrapLibStrings.prev): this.type = js.native
  /**
    * Activates a content as a collapsible element.
    */
  def collapse(): this.type = js.native
  def collapse(options: bootstrapLib.bootstrapMod.CollapseOption): this.type = js.native
  @JSName("collapse")
  def collapse_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("collapse")
  def collapse_hide(action: bootstrapLib.bootstrapLibStrings.hide): this.type = js.native
  @JSName("collapse")
  def collapse_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
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
  def collapse_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  /**
    * Toggle contextual overlays for displaying lists of links.
    *
    * The data-api, `data-toggle="dropdown"` is always required to be present on the dropdown's trigger element.
    */
  def dropdown(): this.type = js.native
  def dropdown(options: bootstrapLib.bootstrapMod.DropdownOption): this.type = js.native
  @JSName("dropdown")
  def dropdown_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  /**
    * Call a method on the dropdown element:
    * * `toggle` – Toggles the dropdown menu of a given navbar or tabbed navigation.
    * * `update` – Updates the position of an element's dropdown.
    * * `dispose` – Destroys an element's dropdown.
    */
  @JSName("dropdown")
  def dropdown_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  @JSName("dropdown")
  def dropdown_update(action: bootstrapLib.bootstrapLibStrings.update): this.type = js.native
  /**
    * Activates a content as a modal.
    */
  def modal(): this.type = js.native
  def modal(options: bootstrapLib.bootstrapMod.ModalOption): this.type = js.native
  @JSName("modal")
  def modal_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("modal")
  def modal_handleUpdate(action: bootstrapLib.bootstrapLibStrings.handleUpdate): this.type = js.native
  @JSName("modal")
  def modal_hide(action: bootstrapLib.bootstrapLibStrings.hide): this.type = js.native
  @JSName("modal")
  def modal_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
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
  def modal_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  def on(
    events: bootstrapLib.bootstrapMod.AlertEvent | bootstrapLib.bootstrapMod.CarouselEvent | bootstrapLib.bootstrapMod.CollapseEvent | bootstrapLib.bootstrapMod.DropdownEvent | bootstrapLib.bootstrapMod.ModalEvent | bootstrapLib.bootstrapMod.PopoverEvent | bootstrapLib.bootstrapMod.TapEvent | bootstrapLib.bootstrapMod.ToastEvent | bootstrapLib.bootstrapMod.TooltipEvent,
    handler: (jqueryLib.JQueryNs.EventHandler[TElement, js.UndefOr[scala.Nothing]]) | (jqueryLib.JQueryNs.EventHandlerBase[
      TElement, 
      bootstrapLib.bootstrapMod.CarouselEventHandler[TElement] | bootstrapLib.bootstrapMod.DropdownsEventHandler[TElement] | bootstrapLib.bootstrapMod.ModalEventHandler[TElement] | bootstrapLib.bootstrapMod.TapEventHandler[TElement]
    ])
  ): this.type = js.native
  def on(
    events: bootstrapLib.bootstrapMod.ScrollspyEvent,
    handler: jqueryLib.JQueryNs.EventHandler[TElement, js.UndefOr[scala.Nothing]]
  ): this.type = js.native
  /**
    * Initializes popovers for an element collection.
    */
  def popover(): this.type = js.native
  def popover(options: bootstrapLib.bootstrapMod.PopoverOption): this.type = js.native
  @JSName("popover")
  def popover_disable(action: bootstrapLib.bootstrapLibStrings.disable): this.type = js.native
  @JSName("popover")
  def popover_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("popover")
  def popover_enable(action: bootstrapLib.bootstrapLibStrings.enable): this.type = js.native
  @JSName("popover")
  def popover_hide(action: bootstrapLib.bootstrapLibStrings.hide): this.type = js.native
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
  def popover_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  @JSName("popover")
  def popover_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  @JSName("popover")
  def popover_toggleEnabled(action: bootstrapLib.bootstrapLibStrings.toggleEnabled): this.type = js.native
  @JSName("popover")
  def popover_update(action: bootstrapLib.bootstrapLibStrings.update): this.type = js.native
  /**
    * Add scrollspy behavior to a topbar navigation.
    */
  def scrollspy(): this.type = js.native
  def scrollspy(options: bootstrapLib.bootstrapMod.ScrollspyOption): this.type = js.native
  @JSName("scrollspy")
  def scrollspy_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
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
  def scrollspy_refresh(action: bootstrapLib.bootstrapLibStrings.refresh): this.type = js.native
  @JSName("tab")
  def tab_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  /**
    * Call a method on the list item or tab element:
    * * `show` – Selects the given list item or tab and shows its associated pane.
    * Any other list item or tab that was previously selected becomes unselected and its associated pane is hidden.
    * * `dispose` – Destroys an element's tab.
    *
    * Returns to the caller before the tab pane has actually been shown (i.e. before the `shown.bs.tab` event occurs).
    */
  @JSName("tab")
  def tab_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  /**
    * Attaches a toast handler to an element collection.
    */
  def toast(): this.type = js.native
  def toast(options: bootstrapLib.bootstrapMod.ToastOption): this.type = js.native
  @JSName("toast")
  def toast_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("toast")
  def toast_hide(action: bootstrapLib.bootstrapLibStrings.hide): this.type = js.native
  /**
    * Call a method on the toast element:
    * * `show` – Reveals an element's toast. You have to manually call this method, instead your toast won't show.
    * * `hide` – Hides an element's toast. You have to manually call this method if you made `autohide` to false.
    * * `dispose` – Hides an element's toast. Your toast will remain on the DOM but won't show anymore.
    *
    * Returns to the caller before the toast has actually been shown or hidden (i.e. before the `shown.bs.toast` or `hidden.bs.toast` event occurs).
    */
  @JSName("toast")
  def toast_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  /**
    * Attaches a tooltip handler to an element collection.
    */
  def tooltip(): this.type = js.native
  def tooltip(options: bootstrapLib.bootstrapMod.TooltipOption): this.type = js.native
  @JSName("tooltip")
  def tooltip_disable(action: bootstrapLib.bootstrapLibStrings.disable): this.type = js.native
  @JSName("tooltip")
  def tooltip_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("tooltip")
  def tooltip_enable(action: bootstrapLib.bootstrapLibStrings.enable): this.type = js.native
  @JSName("tooltip")
  def tooltip_hide(action: bootstrapLib.bootstrapLibStrings.hide): this.type = js.native
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
  def tooltip_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  @JSName("tooltip")
  def tooltip_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  @JSName("tooltip")
  def tooltip_toggleEnabled(action: bootstrapLib.bootstrapLibStrings.toggleEnabled): this.type = js.native
  @JSName("tooltip")
  def tooltip_update(action: bootstrapLib.bootstrapLibStrings.update): this.type = js.native
}

