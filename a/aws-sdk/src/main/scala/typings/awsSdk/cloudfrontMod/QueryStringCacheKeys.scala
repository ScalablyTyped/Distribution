package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringCacheKeys extends StObject {
  
  /**
    * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a cache behavior. If Quantity is 0, you can omit Items. 
    */
  var Items: js.UndefOr[QueryStringCacheKeysList] = js.native
  
  /**
    * The number of whitelisted query string parameters for a cache behavior.
    */
  var Quantity: integer = js.native
}
object QueryStringCacheKeys {
  
  @scala.inline
  def apply(Quantity: integer): QueryStringCacheKeys = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringCacheKeys]
  }
  
  @scala.inline
  implicit class QueryStringCacheKeysMutableBuilder[Self <: QueryStringCacheKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: QueryStringCacheKeysList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
