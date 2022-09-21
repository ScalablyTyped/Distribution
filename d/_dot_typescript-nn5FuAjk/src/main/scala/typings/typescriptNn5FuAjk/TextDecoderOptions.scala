package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderOptions extends StObject {
  
  var fatal: js.UndefOr[scala.Boolean] = js.undefined
  
  var ignoreBOM: js.UndefOr[scala.Boolean] = js.undefined
}
object TextDecoderOptions {
  
  inline def apply(): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoderOptions]
  }
  
  extension [Self <: TextDecoderOptions](x: Self) {
    
    inline def setFatal(value: scala.Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    inline def setIgnoreBOM(value: scala.Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
  }
}
