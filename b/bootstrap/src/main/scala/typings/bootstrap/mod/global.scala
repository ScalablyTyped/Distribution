package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptions
import typings.bootstrap.anon.PartialOptionsAnimation
import typings.bootstrap.anon.PartialOptionsAutoClose
import typings.bootstrap.anon.PartialOptionsBackdrop
import typings.bootstrap.anon.PartialOptionsMethod
import typings.bootstrap.anon.PartialOptionsParent
import typings.bootstrap.bootstrapStrings.close
import typings.bootstrap.bootstrapStrings.cycle
import typings.bootstrap.bootstrapStrings.dispose
import typings.bootstrap.bootstrapStrings.handleUpdate
import typings.bootstrap.bootstrapStrings.hiddenDotbsDotmodal
import typings.bootstrap.bootstrapStrings.hide
import typings.bootstrap.bootstrapStrings.hideDotbsDotmodal
import typings.bootstrap.bootstrapStrings.hidePreventedDotbsDotmodal
import typings.bootstrap.bootstrapStrings.next
import typings.bootstrap.bootstrapStrings.nextWhenVisible
import typings.bootstrap.bootstrapStrings.pause
import typings.bootstrap.bootstrapStrings.prev
import typings.bootstrap.bootstrapStrings.refresh
import typings.bootstrap.bootstrapStrings.show
import typings.bootstrap.bootstrapStrings.showDotbsDotmodal
import typings.bootstrap.bootstrapStrings.shownDotbsDotmodal
import typings.bootstrap.bootstrapStrings.slidDotbsDotcarousel
import typings.bootstrap.bootstrapStrings.slideDotbsDotcarousel
import typings.bootstrap.bootstrapStrings.to
import typings.bootstrap.bootstrapStrings.toggle
import typings.bootstrap.bootstrapStrings.update
import typings.bootstrap.jsDistAlertMod.Alert.jQueryInterface
import typings.bootstrap.jsDistCarouselMod.Carousel.Event
import typings.bootstrap.jsDistCarouselMod.Carousel.Events
import typings.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @js.native
  trait Element extends StObject {
    
    def addEventListener(
      `type`: hiddenDotbsDotmodal | hideDotbsDotmodal | hidePreventedDotbsDotmodal | showDotbsDotmodal | shownDotbsDotmodal | slidDotbsDotcarousel | slideDotbsDotcarousel,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ev */ Event) | (/* ev */ typings.bootstrap.jsDistModalMod.Modal.Event), 
          Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: hiddenDotbsDotmodal | hideDotbsDotmodal | hidePreventedDotbsDotmodal | showDotbsDotmodal | shownDotbsDotmodal | slidDotbsDotcarousel | slideDotbsDotcarousel,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ev */ Event) | (/* ev */ typings.bootstrap.jsDistModalMod.Modal.Event), 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: hiddenDotbsDotmodal | hideDotbsDotmodal | hidePreventedDotbsDotmodal | showDotbsDotmodal | shownDotbsDotmodal | slidDotbsDotcarousel | slideDotbsDotcarousel,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ev */ Event) | (/* ev */ typings.bootstrap.jsDistModalMod.Modal.Event), 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(`type`: Events, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def addEventListener(
      `type`: Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: typings.bootstrap.jsDistModalMod.Modal.Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ typings.bootstrap.jsDistModalMod.Modal.Event, Any]
    ): Unit = js.native
    def addEventListener(
      `type`: typings.bootstrap.jsDistModalMod.Modal.Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ typings.bootstrap.jsDistModalMod.Modal.Event, Any],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: typings.bootstrap.jsDistModalMod.Modal.Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ typings.bootstrap.jsDistModalMod.Modal.Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  @js.native
  trait JQuery extends StObject {
    
    def alert(): JQuery = js.native
    def alert(config: close | dispose): JQuery = js.native
    @JSName("alert")
    var alert_Original: jQueryInterface = js.native
    
    def button(): JQuery = js.native
    def button(config: toggle | dispose): JQuery = js.native
    @JSName("button")
    var button_Original: typings.bootstrap.jsDistButtonMod.Button.jQueryInterface = js.native
    
    def carousel(): JQuery = js.native
    def carousel(config: cycle | pause | prev | next | nextWhenVisible | to | dispose): JQuery = js.native
    def carousel(config: Double): JQuery = js.native
    def carousel(config: PartialOptions): JQuery = js.native
    @JSName("carousel")
    var carousel_Original: typings.bootstrap.jsDistCarouselMod.Carousel.jQueryInterface = js.native
    
    def collapse(): JQuery = js.native
    def collapse(config: show | hide | toggle | dispose): JQuery = js.native
    def collapse(config: PartialOptionsParent): JQuery = js.native
    @JSName("collapse")
    var collapse_Original: typings.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface = js.native
    
    def dropdown(): JQuery = js.native
    def dropdown(config: toggle | show | hide | update | dispose): JQuery = js.native
    def dropdown(config: PartialOptionsAutoClose): JQuery = js.native
    @JSName("dropdown")
    var dropdown_Original: typings.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface = js.native
    
    def modal(): JQuery = js.native
    def modal(config: toggle | show | hide | handleUpdate | dispose): JQuery = js.native
    def modal(config: PartialOptionsBackdrop): JQuery = js.native
    @JSName("modal")
    var modal_Original: typings.bootstrap.jsDistModalMod.Modal.jQueryInterface = js.native
    
    def offcanvas(): JQuery = js.native
    def offcanvas(config: toggle | show | hide): JQuery = js.native
    @JSName("offcanvas")
    var offcanvas_Original: typings.bootstrap.jsDistOffcanvasMod.Offcanvas.jQueryInterface = js.native
    
    def scrollspy(): JQuery = js.native
    def scrollspy(config: refresh | dispose): JQuery = js.native
    def scrollspy(config: PartialOptionsMethod): JQuery = js.native
    @JSName("scrollspy")
    var scrollspy_Original: typings.bootstrap.jsDistScrollspyMod.ScrollSpy.jQueryInterface = js.native
    
    def tab(): JQuery = js.native
    def tab(config: show | dispose): JQuery = js.native
    @JSName("tab")
    var tab_Original: typings.bootstrap.jsDistTabMod.Tab.jQueryInterface = js.native
    
    def toast(): JQuery = js.native
    def toast(config: show | hide | dispose): JQuery = js.native
    def toast(config: PartialOptionsAnimation): JQuery = js.native
    @JSName("toast")
    var toast_Original: typings.bootstrap.jsDistToastMod.Toast.jQueryInterface = js.native
  }
}
