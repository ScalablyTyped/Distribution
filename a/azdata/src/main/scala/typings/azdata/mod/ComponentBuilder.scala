package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentBuilder[T /* <: Component */] extends js.Object {
  
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
  implicit class ComponentBuilderOps[Self <: ComponentBuilder[_], T /* <: Component */] (val x: Self with ComponentBuilder[T]) extends AnyVal {
    
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
    def setComponent(value: () => T): Self = this.set("component", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithProperties(value: js.Any => ComponentBuilder[T]): Self = this.set("withProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithValidation(value: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]): Self = this.set("withValidation", js.Any.fromFunction1(value))
  }
}
