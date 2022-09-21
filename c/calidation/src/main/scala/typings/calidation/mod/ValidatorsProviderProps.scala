package typings.calidation.mod

import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorsProviderProps[T /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var validators: Record[String, CustomValidatorFunction[T]]
}
object ValidatorsProviderProps {
  
  inline def apply[T /* <: js.Object */](validators: Record[String, CustomValidatorFunction[T]]): ValidatorsProviderProps[T] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps[T]]
  }
  
  extension [Self <: ValidatorsProviderProps[?], T /* <: js.Object */](x: Self & ValidatorsProviderProps[T]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setValidators(value: Record[String, CustomValidatorFunction[T]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
  }
}
