package typings.bookshelf.mod

import typings.bookshelf.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagination extends StObject {
  
  var pagination: Page
}
object Pagination {
  
  inline def apply(pagination: Page): Pagination = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  
  extension [Self <: Pagination](x: Self) {
    
    inline def setPagination(value: Page): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
