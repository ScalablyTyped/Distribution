package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  var anchor: Position = js.native
  
  def empty(): Boolean = js.native
  
  def from(): Position = js.native
  
  var head: Position = js.native
  
  def to(): Position = js.native
}
object Range {
  
  @scala.inline
  def apply(anchor: Position, empty: () => Boolean, from: () => Position, head: Position, to: () => Position): Range = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), from = js.Any.fromFunction0(from), head = head.asInstanceOf[js.Any], to = js.Any.fromFunction0(to))
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFrom(value: () => Position): Self = StObject.set(x, "from", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHead(value: Position): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: () => Position): Self = StObject.set(x, "to", js.Any.fromFunction0(value))
  }
}
