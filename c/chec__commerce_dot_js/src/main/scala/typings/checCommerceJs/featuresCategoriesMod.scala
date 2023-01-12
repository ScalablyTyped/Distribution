package typings.checCommerceJs

import typings.checCommerceJs.anon.Type
import typings.checCommerceJs.mod.^
import typings.checCommerceJs.typesCategoryMod.Category
import typings.checCommerceJs.typesPaginationMod.PaginationMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresCategoriesMod {
  
  @JSImport("@chec/commerce.js/features/categories", "Categories")
  @js.native
  open class Categories protected () extends StObject {
    def this(commerce: ^) = this()
    
    def list(): js.Promise[CategoryCollection] = js.native
    def list(params: Any): js.Promise[CategoryCollection] = js.native
    
    def retrieve(id: String): js.Promise[Category] = js.native
    def retrieve(id: String, params: Type): js.Promise[Category] = js.native
  }
  
  trait CategoryCollection extends StObject {
    
    var data: js.Array[Category]
    
    var meta: PaginationMeta
  }
  object CategoryCollection {
    
    inline def apply(data: js.Array[Category], meta: PaginationMeta): CategoryCollection = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryCollection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategoryCollection] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Category]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Category*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMeta(value: PaginationMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
