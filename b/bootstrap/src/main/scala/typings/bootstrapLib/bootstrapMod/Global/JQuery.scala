package typings
package bootstrapLib.bootstrapMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery[TElement] extends js.Object {
  def alert(): this.type = js.native
  @JSName("alert")
  def alert_close(action: bootstrapLib.bootstrapLibStrings.close): this.type = js.native
  @JSName("alert")
  def alert_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("button")
  def button_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("button")
  def button_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  def carousel(): this.type = js.native
  def carousel(action: scala.Double): this.type = js.native
  def carousel(options: bootstrapLib.bootstrapMod.CarouselOption): this.type = js.native
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
  def collapse(): this.type = js.native
  def collapse(options: bootstrapLib.bootstrapMod.CollapseOption): this.type = js.native
  @JSName("collapse")
  def collapse_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("collapse")
  def collapse_hide(action: bootstrapLib.bootstrapLibStrings.hide): this.type = js.native
  @JSName("collapse")
  def collapse_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  @JSName("collapse")
  def collapse_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  def dropdown(): this.type = js.native
  def dropdown(options: bootstrapLib.bootstrapMod.DropdownOption): this.type = js.native
  @JSName("dropdown")
  def dropdown_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("dropdown")
  def dropdown_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  @JSName("dropdown")
  def dropdown_update(action: bootstrapLib.bootstrapLibStrings.update): this.type = js.native
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
  @JSName("modal")
  def modal_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  def on(
    events: bootstrapLib.bootstrapMod.AlertEvent | bootstrapLib.bootstrapMod.CarouselEvent | bootstrapLib.bootstrapMod.CollapseEvent | bootstrapLib.bootstrapMod.DropdownEvent | bootstrapLib.bootstrapMod.ModalEvent | bootstrapLib.bootstrapMod.PopoverEvent | bootstrapLib.bootstrapMod.TapEvent | bootstrapLib.bootstrapMod.TooltipEvent,
    handler: (jqueryLib.JQueryNs.EventHandler[TElement, js.UndefOr[scala.Nothing]]) | (jqueryLib.JQueryNs.EventHandlerBase[
      TElement, 
      bootstrapLib.bootstrapMod.CarouselEventHandler[TElement] | bootstrapLib.bootstrapMod.TapEventHandler[TElement]
    ])
  ): this.type = js.native
  def on(
    events: bootstrapLib.bootstrapMod.ScrollspyEvent,
    handler: jqueryLib.JQueryNs.EventHandler[TElement, js.UndefOr[scala.Nothing]]
  ): this.type = js.native
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
  @JSName("popover")
  def popover_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  @JSName("popover")
  def popover_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  @JSName("popover")
  def popover_toggleEnabled(action: bootstrapLib.bootstrapLibStrings.toggleEnabled): this.type = js.native
  @JSName("popover")
  def popover_update(action: bootstrapLib.bootstrapLibStrings.update): this.type = js.native
  def scrollspy(): this.type = js.native
  def scrollspy(options: bootstrapLib.bootstrapMod.ScrollspyOption): this.type = js.native
  @JSName("scrollspy")
  def scrollspy_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("scrollspy")
  def scrollspy_refresh(action: bootstrapLib.bootstrapLibStrings.refresh): this.type = js.native
  @JSName("tab")
  def tab_dispose(action: bootstrapLib.bootstrapLibStrings.dispose): this.type = js.native
  @JSName("tab")
  def tab_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
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
  @JSName("tooltip")
  def tooltip_show(action: bootstrapLib.bootstrapLibStrings.show): this.type = js.native
  @JSName("tooltip")
  def tooltip_toggle(action: bootstrapLib.bootstrapLibStrings.toggle): this.type = js.native
  @JSName("tooltip")
  def tooltip_toggleEnabled(action: bootstrapLib.bootstrapLibStrings.toggleEnabled): this.type = js.native
  @JSName("tooltip")
  def tooltip_update(action: bootstrapLib.bootstrapLibStrings.update): this.type = js.native
}

