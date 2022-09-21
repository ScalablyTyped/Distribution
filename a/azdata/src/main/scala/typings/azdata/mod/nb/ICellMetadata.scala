package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellMetadata extends StObject {
  
  var azdata_cell_guid: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object ICellMetadata {
  
  inline def apply(): ICellMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellMetadata]
  }
  
  extension [Self <: ICellMetadata](x: Self) {
    
    inline def setAzdata_cell_guid(value: String): Self = StObject.set(x, "azdata_cell_guid", value.asInstanceOf[js.Any])
    
    inline def setAzdata_cell_guidUndefined: Self = StObject.set(x, "azdata_cell_guid", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
