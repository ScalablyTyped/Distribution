package typings.codemirror.anon

import typings.codemirror.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTo extends StObject {
  
  var from: Position | Double
  
  var to: Position | Double
}
object FromTo {
  
  inline def apply(from: Position | Double, to: Position | Double): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
  
  extension [Self <: FromTo](x: Self) {
    
    inline def setFrom(value: Position | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Position | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
