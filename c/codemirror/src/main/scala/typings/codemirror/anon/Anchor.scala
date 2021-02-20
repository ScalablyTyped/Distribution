package typings.codemirror.anon

import typings.codemirror.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends StObject {
  
  var anchor: Position = js.native
  
  var head: Position = js.native
}
object Anchor {
  
  @scala.inline
  def apply(anchor: Position, head: Position): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: Position): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
  }
}
