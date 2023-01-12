package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.libComponentsDataTableDataTableMod.DataTableHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header[H /* <: DataTableHeader[String] */] extends StObject {
  
  var header: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any
}
object Header {
  
  inline def apply[H /* <: DataTableHeader[String] */](header: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any): Header[H] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header[H]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header[?], H /* <: DataTableHeader[String] */] (val x: Self & Header[H]) extends AnyVal {
    
    inline def setHeader(value: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
