package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaulttitle extends StObject {
  
  var default_title: js.UndefOr[String] = js.undefined
  
  var file_filters: js.UndefOr[js.Array[String]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object Defaulttitle {
  
  inline def apply(): Defaulttitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaulttitle]
  }
  
  extension [Self <: Defaulttitle](x: Self) {
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setFile_filters(value: js.Array[String]): Self = StObject.set(x, "file_filters", value.asInstanceOf[js.Any])
    
    inline def setFile_filtersUndefined: Self = StObject.set(x, "file_filters", js.undefined)
    
    inline def setFile_filtersVarargs(value: String*): Self = StObject.set(x, "file_filters", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
