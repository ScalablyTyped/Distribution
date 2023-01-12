package typings.checCommerceJs

import org.scalablytyped.runtime.StringDictionary
import typings.checCommerceJs.typesAssetMod.Asset
import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVariantMod {
  
  trait Variant extends StObject {
    
    var assets: js.Array[Asset]
    
    var created: js.UndefOr[Double] = js.undefined
    
    var description: String | Null
    
    var id: String
    
    var invalid_reason_code: String | Null
    
    var inventory: Double | Null
    
    var is_valid: Boolean
    
    var meta: Any
    
    var options: StringDictionary[String]
    
    var price: Price | Null
    
    var sku: String | Null
    
    var updated: js.UndefOr[Double] = js.undefined
  }
  object Variant {
    
    inline def apply(
      assets: js.Array[Asset],
      id: String,
      is_valid: Boolean,
      meta: Any,
      options: StringDictionary[String]
    ): Variant = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_valid = is_valid.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], description = null, invalid_reason_code = null, inventory = null, price = null, sku = null)
      __obj.asInstanceOf[Variant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Variant] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: js.Array[Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInvalid_reason_code(value: String): Self = StObject.set(x, "invalid_reason_code", value.asInstanceOf[js.Any])
      
      inline def setInvalid_reason_codeNull: Self = StObject.set(x, "invalid_reason_code", null)
      
      inline def setInventory(value: Double): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
      
      inline def setInventoryNull: Self = StObject.set(x, "inventory", null)
      
      inline def setIs_valid(value: Boolean): Self = StObject.set(x, "is_valid", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceNull: Self = StObject.set(x, "price", null)
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setSkuNull: Self = StObject.set(x, "sku", null)
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
}
