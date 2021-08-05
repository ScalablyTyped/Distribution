package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionAssociations extends StObject {
  
  /**
    *  Optional: A complex type that contains LambdaFunctionAssociation items for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined
  
  /**
    * The number of Lambda function associations for this cache behavior.
    */
  var Quantity: integer
}
object LambdaFunctionAssociations {
  
  inline def apply(Quantity: integer): LambdaFunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociations]
  }
  
  extension [Self <: LambdaFunctionAssociations](x: Self) {
    
    inline def setItems(value: LambdaFunctionAssociationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: LambdaFunctionAssociation*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
