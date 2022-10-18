package typings.checCommerceJs

import typings.checCommerceJs.mod.^
import typings.checCommerceJs.typesPaginationMod.PaginationMeta
import typings.checCommerceJs.typesProductMod.Product
import typings.checCommerceJs.typesVariantMod.Variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresProductsMod {
  
  @JSImport("@chec/commerce.js/features/products", "Products")
  @js.native
  open class Products protected () extends StObject {
    def this(commerce: ^) = this()
    
    def getVariant(id: String, variantId: String): js.Promise[Variant] = js.native
    
    def getVariants(id: String): js.Promise[VariantCollection] = js.native
    def getVariants(id: String, data: js.Object): js.Promise[VariantCollection] = js.native
    
    def list(): js.Promise[ProductCollection] = js.native
    def list(params: Any): js.Promise[ProductCollection] = js.native
    
    def retrieve(id: String): js.Promise[Product] = js.native
    def retrieve(id: String, data: js.Object): js.Promise[Product] = js.native
  }
  
  trait ProductCollection extends StObject {
    
    var data: js.Array[Product]
    
    var meta: PaginationMeta
  }
  object ProductCollection {
    
    inline def apply(data: js.Array[Product], meta: PaginationMeta): ProductCollection = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductCollection]
    }
    
    extension [Self <: ProductCollection](x: Self) {
      
      inline def setData(value: js.Array[Product]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Product*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMeta(value: PaginationMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariantCollection extends StObject {
    
    var data: js.Array[Variant]
    
    var meta: PaginationMeta
  }
  object VariantCollection {
    
    inline def apply(data: js.Array[Variant], meta: PaginationMeta): VariantCollection = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariantCollection]
    }
    
    extension [Self <: VariantCollection](x: Self) {
      
      inline def setData(value: js.Array[Variant]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Variant*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMeta(value: PaginationMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
