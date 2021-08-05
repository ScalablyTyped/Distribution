package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var anchor: Position
  
  def empty(): Boolean
  
  def from(): Position
  
  var head: Position
  
  def to(): Position
}
object Range {
  
  inline def apply(anchor: Position, empty: () => Boolean, from: () => Position, head: Position, to: () => Position): Range = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), from = js.Any.fromFunction0(from), head = head.asInstanceOf[js.Any], to = js.Any.fromFunction0(to))
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setAnchor(value: Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
    
    inline def setFrom(value: () => Position): Self = StObject.set(x, "from", js.Any.fromFunction0(value))
    
    inline def setHead(value: Position): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setTo(value: () => Position): Self = StObject.set(x, "to", js.Any.fromFunction0(value))
  }
}
