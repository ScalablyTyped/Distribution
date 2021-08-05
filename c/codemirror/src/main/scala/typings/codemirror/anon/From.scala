package typings.codemirror.anon

import typings.codemirror.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Position
  
  var to: Position
}
object From {
  
  inline def apply(from: Position, to: Position): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
