package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingComponentBuilder
  extends StObject
     with ComponentBuilder[LoadingComponent, LoadingComponentProperties] {
  
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
    withProperties: LoadingComponentProperties => ComponentBuilder[LoadingComponent, LoadingComponentProperties],
    withProps: LoadingComponentProperties => ComponentBuilder[LoadingComponent, LoadingComponentProperties],
    withValidation: js.Function1[LoadingComponent, Boolean | Thenable[Boolean]] => ComponentBuilder[LoadingComponent, LoadingComponentProperties]
  ): LoadingComponentBuilder = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withItem = js.Any.fromFunction1(withItem), withProperties = js.Any.fromFunction1(withProperties), withProps = js.Any.fromFunction1(withProps), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[LoadingComponentBuilder]
  }
  
  extension [Self <: LoadingComponentBuilder](x: Self) {
    
    inline def setWithItem(value: Component => LoadingComponentBuilder): Self = StObject.set(x, "withItem", js.Any.fromFunction1(value))
  }
}
