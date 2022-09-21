package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.EndOfLineState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation response message. Gives series of text spans depending on the format ar.
  */
trait EncodedSemanticClassificationsResponseBody extends StObject {
  
  var endOfLineState: EndOfLineState
  
  var spans: Array[Double]
}
object EncodedSemanticClassificationsResponseBody {
  
  inline def apply(endOfLineState: EndOfLineState, spans: Array[Double]): EncodedSemanticClassificationsResponseBody = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedSemanticClassificationsResponseBody]
  }
  
  extension [Self <: EncodedSemanticClassificationsResponseBody](x: Self) {
    
    inline def setEndOfLineState(value: EndOfLineState): Self = StObject.set(x, "endOfLineState", value.asInstanceOf[js.Any])
    
    inline def setSpans(value: Array[Double]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
  }
}
