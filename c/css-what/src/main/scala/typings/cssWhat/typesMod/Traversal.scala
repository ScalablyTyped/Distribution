package typings.cssWhat.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Traversal
  extends StObject
     with Selector {
  
  var `type`: TraversalType
}
object Traversal {
  
  inline def apply(`type`: TraversalType): Traversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Traversal]
  }
  
  extension [Self <: Traversal](x: Self) {
    
    inline def setType(value: TraversalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
