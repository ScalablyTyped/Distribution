package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// App.View
/////////////////////////////////////////
@js.native
trait ViewPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  
  /**
    * Override the init method to perform actions when the View is first created and shown on the page
    */
  var init: js.UndefOr[js.Function] = js.native
  
  /**
    * Determines if the view is visible
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var navigateTo: js.UndefOr[js.Function] = js.native
  
  var options: js.UndefOr[Route] = js.native
  
  var parentView: js.UndefOr[js.Any] = js.native
  
  /**
    * Override the ready method to perform actions when the DOM is ready and
    * all data-query have been executed.
    */
  var ready: js.UndefOr[js.Function] = js.native
  
  /**
    * Routes to a specific URL and actives the appropriate views associated with the URL
    * 
    * @param name Name of the route
    */
  var route: js.UndefOr[js.Function1[/* name */ String, this.type]] = js.native
  
  /**
    * Override the routed method to perform actions when the View have routing and routing mechanism actives it.
    */
  var routed: js.UndefOr[js.Function] = js.native
}
object ViewPrototype {
  
  @scala.inline
  def apply(): ViewPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPrototype]
  }
  
  @scala.inline
  implicit class ViewPrototypeOps[Self <: ViewPrototype] (val x: Self) extends AnyVal {
    
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
    def setInit(value: js.Function): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setNavigateTo(value: js.Function): Self = this.set("navigateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateTo: Self = this.set("navigateTo", js.undefined)
    
    @scala.inline
    def setOptions(value: Route): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParentView(value: js.Any): Self = this.set("parentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentView: Self = this.set("parentView", js.undefined)
    
    @scala.inline
    def setReady(value: js.Function): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRoute(value: /* name */ String => ViewPrototype): Self = this.set("route", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setRouted(value: js.Function): Self = this.set("routed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouted: Self = this.set("routed", js.undefined)
  }
}
