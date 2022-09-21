package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object found in response messages defining a span of text in source code.
  */
trait TextSpan extends StObject {
  
  /**
    * One character past last character of the definition.
    */
  var end: Location
  
  /**
    * First character of the definition.
    */
  var start: Location
}
object TextSpan {
  
  inline def apply(end: Location, start: Location): TextSpan = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSpan]
  }
  
  extension [Self <: TextSpan](x: Self) {
    
    inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
