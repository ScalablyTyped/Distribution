package typings.bookshelf

import org.scalablytyped.runtime.Instantiable1
import typings.bookshelf.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable[R /* <: Model[Any] */]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, R]
  
  trait Page extends StObject {
    
    var page: Double
    
    var pageCount: Double
    
    var pageSize: Double
    
    var rowCount: Double
  }
  object Page {
    
    inline def apply(page: Double, pageCount: Double, pageSize: Double, rowCount: Double): Page = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    }
  }
}
