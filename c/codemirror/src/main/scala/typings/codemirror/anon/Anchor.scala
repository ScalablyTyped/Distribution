package typings.codemirror.anon

import typings.codemirror.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  var anchor: Position
  
  var head: Position
}
object Anchor {
  
  inline def apply(anchor: Position, head: Position): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  extension [Self <: Anchor](x: Self) {
    
    inline def setAnchor(value: Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setHead(value: Position): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
  }
}
