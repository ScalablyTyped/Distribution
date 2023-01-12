package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionalOptions extends StObject {
  
  var clarifyTimeoutError: js.UndefOr[Boolean] = js.undefined
  
  var forcedJSONParsing: js.UndefOr[Boolean] = js.undefined
  
  var silentJSONParsing: js.UndefOr[Boolean] = js.undefined
}
object TransitionalOptions {
  
  inline def apply(): TransitionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionalOptions] (val x: Self) extends AnyVal {
    
    inline def setClarifyTimeoutError(value: Boolean): Self = StObject.set(x, "clarifyTimeoutError", value.asInstanceOf[js.Any])
    
    inline def setClarifyTimeoutErrorUndefined: Self = StObject.set(x, "clarifyTimeoutError", js.undefined)
    
    inline def setForcedJSONParsing(value: Boolean): Self = StObject.set(x, "forcedJSONParsing", value.asInstanceOf[js.Any])
    
    inline def setForcedJSONParsingUndefined: Self = StObject.set(x, "forcedJSONParsing", js.undefined)
    
    inline def setSilentJSONParsing(value: Boolean): Self = StObject.set(x, "silentJSONParsing", value.asInstanceOf[js.Any])
    
    inline def setSilentJSONParsingUndefined: Self = StObject.set(x, "silentJSONParsing", js.undefined)
  }
}
