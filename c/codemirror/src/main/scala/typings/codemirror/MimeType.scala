package typings.codemirror

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeType extends StObject {
  
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  var ext: js.UndefOr[js.Array[String]] = js.undefined
  
  var file: js.UndefOr[RegExp] = js.undefined
  
  var mime: js.UndefOr[String] = js.undefined
  
  var mimes: js.UndefOr[String] = js.undefined
  
  var mode: String
  
  var name: String
}
object MimeType {
  
  inline def apply(mode: String, name: String): MimeType = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
  
  extension [Self <: MimeType](x: Self) {
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    inline def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
    
    inline def setFile(value: RegExp): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setMimes(value: String): Self = StObject.set(x, "mimes", value.asInstanceOf[js.Any])
    
    inline def setMimesUndefined: Self = StObject.set(x, "mimes", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
