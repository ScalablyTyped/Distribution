package typings.calidation.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationProps[T /* <: js.Object */] extends StObject {
  
  def children(context: ValidationContext[T]): ReactNode = js.native
  
  var config: FieldsConfig[T] = js.native
  
  var initialValues: js.UndefOr[T] = js.native
  
  var transforms: js.UndefOr[Transforms[T]] = js.native
}
object ValidationProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](children: ValidationContext[T] => ReactNode, config: FieldsConfig[T]): ValidationProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationProps[T]]
  }
  
  @scala.inline
  implicit class ValidationPropsMutableBuilder[Self <: ValidationProps[_], T /* <: js.Object */] (val x: Self with ValidationProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ValidationContext[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfig(value: FieldsConfig[T]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValues(value: T): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValuesUndefined: Self = StObject.set(x, "initialValues", js.undefined)
    
    @scala.inline
    def setTransforms(value: Transforms[T]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
  }
}
