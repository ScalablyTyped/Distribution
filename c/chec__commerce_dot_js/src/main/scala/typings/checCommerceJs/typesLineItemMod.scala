package typings.checCommerceJs

import typings.checCommerceJs.typesAssetMod.Asset
import typings.checCommerceJs.typesPriceMod.Price
import typings.checCommerceJs.typesSelectedVariantMod.SelectedVariant
import typings.checCommerceJs.typesVariantMod.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLineItemMod {
  
  trait LineItem extends StObject {
    
    var id: String
    
    var image: Asset | Null
    
    var line_total: Price
    
    var media: Any
    
    var name: String
    
    var permalink: String
    
    var price: Price
    
    var product_id: String
    
    var product_meta: Any
    
    var product_name: String
    
    var quantity: Double
    
    // todo
    var selected_options: js.Array[SelectedVariant]
    
    var sku: String
    
    var variant: js.UndefOr[Variant] = js.undefined
  }
  object LineItem {
    
    inline def apply(
      id: String,
      line_total: Price,
      media: Any,
      name: String,
      permalink: String,
      price: Price,
      product_id: String,
      product_meta: Any,
      product_name: String,
      quantity: Double,
      selected_options: js.Array[SelectedVariant],
      sku: String
    ): LineItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line_total = line_total.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], product_meta = product_meta.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], selected_options = selected_options.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], image = null)
      __obj.asInstanceOf[LineItem]
    }
    
    extension [Self <: LineItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Asset): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setLine_total(value: Price): Self = StObject.set(x, "line_total", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
      
      inline def setProduct_meta(value: Any): Self = StObject.set(x, "product_meta", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSelected_options(value: js.Array[SelectedVariant]): Self = StObject.set(x, "selected_options", value.asInstanceOf[js.Any])
      
      inline def setSelected_optionsVarargs(value: SelectedVariant*): Self = StObject.set(x, "selected_options", js.Array(value*))
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: Variant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
