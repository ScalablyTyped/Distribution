package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths extends StObject {
  
  /**
    * A complex type that contains a list of the paths that you want to invalidate.
    */
  var Items: js.UndefOr[PathList] = js.undefined
  
  /**
    * The number of invalidation paths specified for the objects that you want to invalidate.
    */
  var Quantity: integer
}
object Paths {
  
  @scala.inline
  def apply(Quantity: integer): Paths = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  
  @scala.inline
  implicit class PathsMutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: PathList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
