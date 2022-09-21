package typings.terserMCwkxx7L.mod

import typings.terserMCwkxx7L.terserMCwkxx7LStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManglePropertiesOptions extends StObject {
  
  var builtins: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var keep_quoted: js.UndefOr[Boolean | strict] = js.undefined
  
  var regex: js.UndefOr[js.RegExp | String] = js.undefined
  
  var reserved: js.UndefOr[js.Array[String]] = js.undefined
}
object ManglePropertiesOptions {
  
  inline def apply(): ManglePropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManglePropertiesOptions]
  }
  
  extension [Self <: ManglePropertiesOptions](x: Self) {
    
    inline def setBuiltins(value: Boolean): Self = StObject.set(x, "builtins", value.asInstanceOf[js.Any])
    
    inline def setBuiltinsUndefined: Self = StObject.set(x, "builtins", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setKeep_quoted(value: Boolean | strict): Self = StObject.set(x, "keep_quoted", value.asInstanceOf[js.Any])
    
    inline def setKeep_quotedUndefined: Self = StObject.set(x, "keep_quoted", js.undefined)
    
    inline def setRegex(value: js.RegExp | String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value*))
  }
}
