package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// App.View
/////////////////////////////////////////
trait ViewPrototype
  extends StObject
     with /* propertyName */ StringDictionary[js.Any] {
  
  /**
    * Override the init method to perform actions when the View is first created and shown on the page
    */
  var init: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Determines if the view is visible
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var navigateTo: js.UndefOr[js.Function] = js.undefined
  
  var options: js.UndefOr[Route] = js.undefined
  
  var parentView: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Override the ready method to perform actions when the DOM is ready and
    * all data-query have been executed.
    */
  var ready: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Routes to a specific URL and actives the appropriate views associated with the URL
    * 
    * @param name Name of the route
    */
  var route: js.UndefOr[js.Function1[/* name */ String, this.type]] = js.undefined
  
  /**
    * Override the routed method to perform actions when the View have routing and routing mechanism actives it.
    */
  var routed: js.UndefOr[js.Function] = js.undefined
}
object ViewPrototype {
  
  @scala.inline
  def apply(): ViewPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPrototype]
  }
  
  @scala.inline
  implicit class ViewPrototypeMutableBuilder[Self <: ViewPrototype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setNavigateTo(value: js.Function): Self = StObject.set(x, "navigateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateToUndefined: Self = StObject.set(x, "navigateTo", js.undefined)
    
    @scala.inline
    def setOptions(value: Route): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParentView(value: js.Any): Self = StObject.set(x, "parentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentViewUndefined: Self = StObject.set(x, "parentView", js.undefined)
    
    @scala.inline
    def setReady(value: js.Function): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRoute(value: /* name */ String => ViewPrototype): Self = StObject.set(x, "route", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setRouted(value: js.Function): Self = StObject.set(x, "routed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutedUndefined: Self = StObject.set(x, "routed", js.undefined)
  }
}
