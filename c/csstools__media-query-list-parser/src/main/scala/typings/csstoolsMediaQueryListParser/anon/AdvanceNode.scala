package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvanceNode extends StObject {
  
  var advance: Double
  
  var node: MediaAnd
}
object AdvanceNode {
  
  inline def apply(advance: Double, node: MediaAnd): AdvanceNode = {
    val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvanceNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvanceNode] (val x: Self) extends AnyVal {
    
    inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
    
    inline def setNode(value: MediaAnd): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
