package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBuilder[T /* <: Component */] extends StObject {
  
  def component(): T
  
  def withProperties[U](properties: U): ComponentBuilder[T]
  
  def withValidation(validation: js.Function1[/* component */ T, Boolean]): ComponentBuilder[T]
}
object ComponentBuilder {
  
  inline def apply[T /* <: Component */](
    component: () => T,
    withProperties: js.Any => ComponentBuilder[T],
    withValidation: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]
  ): ComponentBuilder[T] = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withProperties = js.Any.fromFunction1(withProperties), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[ComponentBuilder[T]]
  }
  
  extension [Self <: ComponentBuilder[?], T /* <: Component */](x: Self & ComponentBuilder[T]) {
    
    inline def setComponent(value: () => T): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
    
    inline def setWithProperties(value: js.Any => ComponentBuilder[T]): Self = StObject.set(x, "withProperties", js.Any.fromFunction1(value))
    
    inline def setWithValidation(value: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]): Self = StObject.set(x, "withValidation", js.Any.fromFunction1(value))
  }
}
