package typings.checCommerceJs

import typings.checCommerceJs.priceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productVariantGroupMod {
  
  trait ProductVariantGroup extends StObject {
    
    var created: Double | Null
    
    var id: String
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var name: String
    
    var options: js.Array[ProductVariantOption]
    
    var updated: Double | Null
  }
  object ProductVariantGroup {
    
    inline def apply(id: String, name: String, options: js.Array[ProductVariantOption]): ProductVariantGroup = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], created = null, updated = null)
      __obj.asInstanceOf[ProductVariantGroup]
    }
    
    extension [Self <: ProductVariantGroup](x: Self) {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedNull: Self = StObject.set(x, "created", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[ProductVariantOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: ProductVariantOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    }
  }
  
  trait ProductVariantOption extends StObject {
    
    var assets: js.Array[String] | Null
    
    var created: Double | Null
    
    var id: String
    
    var meta: Any
    
    var name: String
    
    var price: Price
    
    var updated: Double | Null
  }
  object ProductVariantOption {
    
    inline def apply(id: String, meta: Any, name: String, price: Price): ProductVariantOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], assets = null, created = null, updated = null)
      __obj.asInstanceOf[ProductVariantOption]
    }
    
    extension [Self <: ProductVariantOption](x: Self) {
      
      inline def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsNull: Self = StObject.set(x, "assets", null)
      
      inline def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedNull: Self = StObject.set(x, "created", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    }
  }
}
