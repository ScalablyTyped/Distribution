package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.`2020`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for EncodedSemanticClassificationsRequest request.
  */
trait EncodedSemanticClassificationsRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Optional parameter for the semantic highlighting response, if absent it
    * defaults to "original".
    */
  var format: js.UndefOr[original | `2020`] = js.undefined
  
  /**
    * Length of the span.
    */
  var length: Double
  
  /**
    * Start position of the span.
    */
  var start: Double
}
object EncodedSemanticClassificationsRequestArgs {
  
  inline def apply(file: String, length: Double, start: Double): EncodedSemanticClassificationsRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedSemanticClassificationsRequestArgs]
  }
  
  extension [Self <: EncodedSemanticClassificationsRequestArgs](x: Self) {
    
    inline def setFormat(value: original | `2020`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
