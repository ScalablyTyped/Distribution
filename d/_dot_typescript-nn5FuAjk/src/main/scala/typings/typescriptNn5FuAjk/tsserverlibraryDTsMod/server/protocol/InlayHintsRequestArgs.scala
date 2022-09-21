package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Length of the span.
    */
  var length: Double
  
  /**
    * Start position of the span.
    */
  var start: Double
}
object InlayHintsRequestArgs {
  
  inline def apply(file: String, length: Double, start: Double): InlayHintsRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintsRequestArgs]
  }
  
  extension [Self <: InlayHintsRequestArgs](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
