package typings.babelTraverse.anon

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confident extends StObject {
  
  var confident: Boolean
  
  var deopt: js.UndefOr[NodePath[Node]] = js.undefined
  
  var value: Any
}
object Confident {
  
  inline def apply(confident: Boolean, value: Any): Confident = {
    val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confident]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Confident] (val x: Self) extends AnyVal {
    
    inline def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
    
    inline def setDeopt(value: NodePath[Node]): Self = StObject.set(x, "deopt", value.asInstanceOf[js.Any])
    
    inline def setDeoptUndefined: Self = StObject.set(x, "deopt", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
