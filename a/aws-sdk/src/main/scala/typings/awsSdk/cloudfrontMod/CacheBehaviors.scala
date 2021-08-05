package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheBehaviors extends StObject {
  
  /**
    * Optional: A complex type that contains cache behaviors for this distribution. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[CacheBehaviorList] = js.undefined
  
  /**
    * The number of cache behaviors for this distribution. 
    */
  var Quantity: integer
}
object CacheBehaviors {
  
  inline def apply(Quantity: integer): CacheBehaviors = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheBehaviors]
  }
  
  extension [Self <: CacheBehaviors](x: Self) {
    
    inline def setItems(value: CacheBehaviorList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: CacheBehavior*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
