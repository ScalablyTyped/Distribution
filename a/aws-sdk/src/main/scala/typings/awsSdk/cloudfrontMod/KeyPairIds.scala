package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairIds extends StObject {
  
  /**
    * A list of CloudFront key pair identifiers.
    */
  var Items: js.UndefOr[KeyPairIdList] = js.native
  
  /**
    * The number of key pair identifiers in the list.
    */
  var Quantity: integer = js.native
}
object KeyPairIds {
  
  @scala.inline
  def apply(Quantity: integer): KeyPairIds = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairIds]
  }
  
  @scala.inline
  implicit class KeyPairIdsMutableBuilder[Self <: KeyPairIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: KeyPairIdList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
