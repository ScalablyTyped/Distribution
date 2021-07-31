package typings.calidation.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormValidationProps[T /* <: js.Object */]
  extends StObject
     with FormProps[T]
     with ValidationProps[T] {
  
  @JSName("children")
  def children_MFormValidationProps(context: ValidationContext[T]): ReactNode
}
object FormValidationProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](children: ValidationContext[T] => ReactNode, config: FieldsConfig[T]): FormValidationProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidationProps[T]]
  }
  
  @scala.inline
  implicit class FormValidationPropsMutableBuilder[Self <: FormValidationProps[?], T /* <: js.Object */] (val x: Self & FormValidationProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ValidationContext[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
