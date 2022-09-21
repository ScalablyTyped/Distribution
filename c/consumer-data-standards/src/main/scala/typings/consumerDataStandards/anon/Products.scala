package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Products
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of products returned.  If the filter results in an empty set then this array may have no records
    */
  var products: js.Array[ApplicationUri]
}
object Products {
  
  inline def apply(products: js.Array[ApplicationUri]): Products = {
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[Products]
  }
  
  extension [Self <: Products](x: Self) {
    
    inline def setProducts(value: js.Array[ApplicationUri]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: ApplicationUri*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
