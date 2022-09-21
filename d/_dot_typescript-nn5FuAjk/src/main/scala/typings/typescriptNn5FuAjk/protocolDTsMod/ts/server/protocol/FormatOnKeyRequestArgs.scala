package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for format on key messages.
  */
trait FormatOnKeyRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Key pressed (';', '\n', or '}').
    */
  var key: String
  
  var options: js.UndefOr[FormatCodeSettings] = js.undefined
}
object FormatOnKeyRequestArgs {
  
  inline def apply(file: String, key: String, line: Double, offset: Double): FormatOnKeyRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOnKeyRequestArgs]
  }
  
  extension [Self <: FormatOnKeyRequestArgs](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FormatCodeSettings): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
