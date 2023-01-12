package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageInfo extends StObject {
  
  var codemirror_mode: js.UndefOr[String | ICodeMirrorMode] = js.undefined
  
  var mimetype: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var version: js.UndefOr[String] = js.undefined
}
object ILanguageInfo {
  
  inline def apply(name: String): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILanguageInfo] (val x: Self) extends AnyVal {
    
    inline def setCodemirror_mode(value: String | ICodeMirrorMode): Self = StObject.set(x, "codemirror_mode", value.asInstanceOf[js.Any])
    
    inline def setCodemirror_modeUndefined: Self = StObject.set(x, "codemirror_mode", js.undefined)
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
