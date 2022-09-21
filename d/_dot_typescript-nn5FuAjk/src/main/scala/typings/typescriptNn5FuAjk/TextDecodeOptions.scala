package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecodeOptions extends StObject {
  
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}
object TextDecodeOptions {
  
  inline def apply(): TextDecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecodeOptions]
  }
  
  extension [Self <: TextDecodeOptions](x: Self) {
    
    inline def setStream(value: scala.Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
