package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidationContext[T] extends StObject {
  
  var Data: T = js.native
  
  var Key: String = js.native
  
  var Value: String = js.native
}
object IValidationContext {
  
  @scala.inline
  def apply[T](Data: T, Key: String, Value: String): IValidationContext[T] = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationContext[T]]
  }
  
  @scala.inline
  implicit class IValidationContextMutableBuilder[Self <: IValidationContext[_], T] (val x: Self with IValidationContext[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
