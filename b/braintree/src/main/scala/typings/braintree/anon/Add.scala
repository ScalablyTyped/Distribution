package typings.braintree.anon

import typings.braintree.mod.AddOnAddRequest
import typings.braintree.mod.AddOnUpdateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: js.UndefOr[js.Array[AddOnAddRequest]] = js.undefined
  
  var remove: js.UndefOr[js.Array[String]] = js.undefined
  
  var update: js.UndefOr[js.Array[AddOnUpdateRequest]] = js.undefined
}
object Add {
  
  inline def apply(): Add = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: js.Array[AddOnAddRequest]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: AddOnAddRequest*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setUpdate(value: js.Array[AddOnUpdateRequest]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUpdateVarargs(value: AddOnUpdateRequest*): Self = StObject.set(x, "update", js.Array(value*))
  }
}
