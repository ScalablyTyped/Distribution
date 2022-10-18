package typings.checCommerceJs

import typings.checCommerceJs.anon.Available
import typings.checCommerceJs.anon.Billingaddress
import typings.checCommerceJs.anon.Checkout
import typings.checCommerceJs.anon.Collectsfullname
import typings.checCommerceJs.anon.Description
import typings.checCommerceJs.anon.Images
import typings.checCommerceJs.anon.Inventorymanaged
import typings.checCommerceJs.anon.Name
import typings.checCommerceJs.anon.Source
import typings.checCommerceJs.typesAssetMod.Asset
import typings.checCommerceJs.typesPriceMod.Price
import typings.checCommerceJs.typesProductAttributeMod.ProductAttribute
import typings.checCommerceJs.typesProductVariantGroupMod.ProductVariantGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProductMod {
  
  trait Product extends StObject {
    
    var active: Boolean
    
    var assets: js.Array[Asset]
    
    var attributes: js.Array[ProductAttribute]
    
    var categories: js.Array[Name]
    
    var checkout_url: Checkout
    
    var collects: Billingaddress
    
    var conditionals: Collectsfullname
    
    var created: Double
    
    var description: String
    
    var extra_fields: js.Array[Any]
    
    var has: Images
    
    var id: String
    
    var image: Asset | Null
    
    var inventory: Available
    
    var is: Inventorymanaged
    
    var media: Source
    
    var meta: Any
    
    var name: String
    
    var permalink: String
    
    var price: Price
    
    var related_products: js.Array[Any]
    
    var seo: Description
    
    var sku: String | Null
    
    var sort_order: Double
    
    var thank_you_url: String | Null
    
    var updated: Double
    
    var variant_groups: js.Array[ProductVariantGroup]
  }
  object Product {
    
    inline def apply(
      active: Boolean,
      assets: js.Array[Asset],
      attributes: js.Array[ProductAttribute],
      categories: js.Array[Name],
      checkout_url: Checkout,
      collects: Billingaddress,
      conditionals: Collectsfullname,
      created: Double,
      description: String,
      extra_fields: js.Array[Any],
      has: Images,
      id: String,
      inventory: Available,
      is: Inventorymanaged,
      media: Source,
      meta: Any,
      name: String,
      permalink: String,
      price: Price,
      related_products: js.Array[Any],
      seo: Description,
      sort_order: Double,
      updated: Double,
      variant_groups: js.Array[ProductVariantGroup]
    ): Product = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], assets = assets.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], checkout_url = checkout_url.asInstanceOf[js.Any], collects = collects.asInstanceOf[js.Any], conditionals = conditionals.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extra_fields = extra_fields.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], related_products = related_products.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], sort_order = sort_order.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], variant_groups = variant_groups.asInstanceOf[js.Any], image = null, sku = null, thank_you_url = null)
      __obj.asInstanceOf[Product]
    }
    
    extension [Self <: Product](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAssets(value: js.Array[Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setAttributes(value: js.Array[ProductAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: ProductAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setCategories(value: js.Array[Name]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Name*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCheckout_url(value: Checkout): Self = StObject.set(x, "checkout_url", value.asInstanceOf[js.Any])
      
      inline def setCollects(value: Billingaddress): Self = StObject.set(x, "collects", value.asInstanceOf[js.Any])
      
      inline def setConditionals(value: Collectsfullname): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExtra_fields(value: js.Array[Any]): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
      
      inline def setExtra_fieldsVarargs(value: Any*): Self = StObject.set(x, "extra_fields", js.Array(value*))
      
      inline def setHas(value: Images): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Asset): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setInventory(value: Available): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
      
      inline def setIs(value: Inventorymanaged): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Source): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setRelated_products(value: js.Array[Any]): Self = StObject.set(x, "related_products", value.asInstanceOf[js.Any])
      
      inline def setRelated_productsVarargs(value: Any*): Self = StObject.set(x, "related_products", js.Array(value*))
      
      inline def setSeo(value: Description): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setSkuNull: Self = StObject.set(x, "sku", null)
      
      inline def setSort_order(value: Double): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
      
      inline def setThank_you_url(value: String): Self = StObject.set(x, "thank_you_url", value.asInstanceOf[js.Any])
      
      inline def setThank_you_urlNull: Self = StObject.set(x, "thank_you_url", null)
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setVariant_groups(value: js.Array[ProductVariantGroup]): Self = StObject.set(x, "variant_groups", value.asInstanceOf[js.Any])
      
      inline def setVariant_groupsVarargs(value: ProductVariantGroup*): Self = StObject.set(x, "variant_groups", js.Array(value*))
    }
  }
}
