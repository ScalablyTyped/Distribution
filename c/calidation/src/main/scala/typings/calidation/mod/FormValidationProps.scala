package typings.calidation.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormValidationProps[T /* <: js.Object */]
  extends FormProps[T]
     with ValidationProps[T] {
  
  @JSName("children")
  def children_MFormValidationProps(context: ValidationContext[T]): ReactNode = js.native
}
object FormValidationProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](children: ValidationContext[T] => ReactNode, config: FieldsConfig[T]): FormValidationProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidationProps[T]]
  }
  
  @scala.inline
  implicit class FormValidationPropsOps[Self <: FormValidationProps[_], T /* <: js.Object */] (val x: Self with FormValidationProps[T]) extends AnyVal {
    
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
    def setChildren(value: ValidationContext[T] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
