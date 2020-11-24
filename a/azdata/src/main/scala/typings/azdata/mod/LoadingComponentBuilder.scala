package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingComponentBuilder extends ComponentBuilder[LoadingComponent] {
  
  /**
    * Set the component wrapped by the LoadingComponent
    * @param component The component to wrap
    */
  def withItem(component: Component): LoadingComponentBuilder = js.native
}
object LoadingComponentBuilder {
  
  @scala.inline
  def apply(
    component: () => LoadingComponent,
    withItem: Component => LoadingComponentBuilder,
    withProperties: js.Any => ComponentBuilder[LoadingComponent],
    withValidation: js.Function1[LoadingComponent, Boolean] => ComponentBuilder[LoadingComponent]
  ): LoadingComponentBuilder = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withItem = js.Any.fromFunction1(withItem), withProperties = js.Any.fromFunction1(withProperties), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[LoadingComponentBuilder]
  }
  
  @scala.inline
  implicit class LoadingComponentBuilderOps[Self <: LoadingComponentBuilder] (val x: Self) extends AnyVal {
    
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
    def setWithItem(value: Component => LoadingComponentBuilder): Self = this.set("withItem", js.Any.fromFunction1(value))
  }
}
