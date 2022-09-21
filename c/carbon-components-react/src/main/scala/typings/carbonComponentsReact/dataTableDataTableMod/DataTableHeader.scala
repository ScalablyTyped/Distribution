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
  
  inline def apply[K /* <: String */](header: NonNullable[ReactNode], key: K): DataTableHeader[K] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableHeader[K]]
  }
  
  extension [Self <: DataTableHeader[?], K /* <: String */](x: Self & DataTableHeader[K]) {
    
    inline def setHeader(value: NonNullable[ReactNode]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
