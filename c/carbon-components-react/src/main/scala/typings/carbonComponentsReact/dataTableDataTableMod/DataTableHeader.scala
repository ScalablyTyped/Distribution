package typings.carbonComponentsReact.dataTableDataTableMod

import typings.react.mod.ReactNode
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableHeader[K /* <: String */] extends StObject {
  
  var header: NonNullable[ReactNode]
  
  var key: K
}
object DataTableHeader {
  
  @scala.inline
  def apply[K /* <: String */](key: K): DataTableHeader[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableHeader[K]]
  }
  
  @scala.inline
  implicit class DataTableHeaderMutableBuilder[Self <: DataTableHeader[?], K /* <: String */] (val x: Self & DataTableHeader[K]) extends AnyVal {
    
    @scala.inline
    def setHeader(value: NonNullable[ReactNode]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
