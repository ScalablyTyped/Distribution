package typings.checCommerceJs

import typings.checCommerceJs.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  trait PaginationMeta extends StObject {
    
    var pagination: Count
  }
  object PaginationMeta {
    
    inline def apply(pagination: Count): PaginationMeta = {
      val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationMeta]
    }
    
    extension [Self <: PaginationMeta](x: Self) {
      
      inline def setPagination(value: Count): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
}
