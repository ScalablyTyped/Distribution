package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingComponentBuilder
  extends StObject
     with ComponentBuilder[LoadingComponent] {
  
  /**
    * Set the component wrapped by the LoadingComponent
    * @param component The component to wrap
    */
  def withItem(component: Component): LoadingComponentBuilder
}
object LoadingComponentBuilder {
  
  inline def apply(
    component: () => LoadingComponent,
    withItem: Component => LoadingComponentBuilder,
    withProperties: js.Any => ComponentBuilder[LoadingComponent],
    withValidation: js.Function1[LoadingComponent, Boolean] => ComponentBuilder[LoadingComponent]
  ): LoadingComponentBuilder = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withItem = js.Any.fromFunction1(withItem), withProperties = js.Any.fromFunction1(withProperties), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[LoadingComponentBuilder]
  }
  
  extension [Self <: LoadingComponentBuilder](x: Self) {
    
    inline def setWithItem(value: Component => LoadingComponentBuilder): Self = StObject.set(x, "withItem", js.Any.fromFunction1(value))
  }
}
