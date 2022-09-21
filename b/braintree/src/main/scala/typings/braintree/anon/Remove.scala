package typings.braintree.anon

import typings.braintree.mod.DiscountAddRequest
import typings.braintree.mod.DiscountUpdateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remove extends StObject {
  
  var add: js.UndefOr[js.Array[DiscountAddRequest]] = js.undefined
  
  var remove: js.UndefOr[js.Array[String]] = js.undefined
  
  var update: js.UndefOr[js.Array[DiscountUpdateRequest]] = js.undefined
}
object Remove {
  
  inline def apply(): Remove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remove]
  }
  
  extension [Self <: Remove](x: Self) {
    
    inline def setAdd(value: js.Array[DiscountAddRequest]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: DiscountAddRequest*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setUpdate(value: js.Array[DiscountUpdateRequest]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUpdateVarargs(value: DiscountUpdateRequest*): Self = StObject.set(x, "update", js.Array(value*))
  }
}
