package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INotebookMetadata extends StObject {
  
  var kernelspec: js.UndefOr[IKernelSpec] = js.undefined
  
  var language_info: js.UndefOr[ILanguageInfo] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object INotebookMetadata {
  
  inline def apply(): INotebookMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INotebookMetadata]
  }
  
  extension [Self <: INotebookMetadata](x: Self) {
    
    inline def setKernelspec(value: IKernelSpec): Self = StObject.set(x, "kernelspec", value.asInstanceOf[js.Any])
    
    inline def setKernelspecUndefined: Self = StObject.set(x, "kernelspec", js.undefined)
    
    inline def setLanguage_info(value: ILanguageInfo): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
    
    inline def setLanguage_infoUndefined: Self = StObject.set(x, "language_info", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
