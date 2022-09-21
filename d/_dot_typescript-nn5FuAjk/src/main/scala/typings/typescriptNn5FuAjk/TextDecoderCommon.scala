package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderCommon extends StObject {
  
  /** Returns encoding's name, lowercased. */
  val encoding: java.lang.String
  
  /** Returns true if error mode is "fatal", otherwise false. */
  val fatal: scala.Boolean
  
  /** Returns the value of ignore BOM. */
  val ignoreBOM: scala.Boolean
}
object TextDecoderCommon {
  
  inline def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
  
  extension [Self <: TextDecoderCommon](x: Self) {
    
    inline def setEncoding(value: java.lang.String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFatal(value: scala.Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBOM(value: scala.Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
  }
}
