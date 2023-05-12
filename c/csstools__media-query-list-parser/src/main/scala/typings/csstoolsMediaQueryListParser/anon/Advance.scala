package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advance extends StObject {
  
  var advance: Double
  
  var node: MediaOr
}
object Advance {
  
  inline def apply(advance: Double, node: MediaOr): Advance = {
    val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Advance] (val x: Self) extends AnyVal {
    
    inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
    
    inline def setNode(value: MediaOr): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
