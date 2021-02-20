package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentBuilder[T /* <: Component */] extends StObject {
  
  def component(): T = js.native
  
  def withProperties[U](properties: U): ComponentBuilder[T] = js.native
  
  def withValidation(validation: js.Function1[/* component */ T, Boolean]): ComponentBuilder[T] = js.native
}
object ComponentBuilder {
  
  @scala.inline
  def apply[T /* <: Component */](
    component: () => T,
    withProperties: js.Any => ComponentBuilder[T],
    withValidation: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]
  ): ComponentBuilder[T] = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withProperties = js.Any.fromFunction1(withProperties), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[ComponentBuilder[T]]
  }
  
  @scala.inline
  implicit class ComponentBuilderMutableBuilder[Self <: ComponentBuilder[_], T /* <: Component */] (val x: Self with ComponentBuilder[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: () => T): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithProperties(value: js.Any => ComponentBuilder[T]): Self = StObject.set(x, "withProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithValidation(value: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]): Self = StObject.set(x, "withValidation", js.Any.fromFunction1(value))
  }
}
