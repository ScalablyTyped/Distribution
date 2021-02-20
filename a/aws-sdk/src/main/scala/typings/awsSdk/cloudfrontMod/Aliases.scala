package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aliases extends StObject {
  
  /**
    * A complex type that contains the CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Items: js.UndefOr[AliasList] = js.native
  
  /**
    * The number of CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Quantity: integer = js.native
}
object Aliases {
  
  @scala.inline
  def apply(Quantity: integer): Aliases = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  @scala.inline
  implicit class AliasesMutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: AliasList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
