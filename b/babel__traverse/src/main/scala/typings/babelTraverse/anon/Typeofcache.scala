package typings.babelTraverse.anon

import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.Node
import typings.std.Map
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcache extends StObject {
  
  def clear(): Unit
  
  def clearPath(): Unit
  
  def clearScope(): Unit
  
  var path: WeakMap[Node, Map[Node, NodePath[Node]]]
  
  var scope: WeakMap[Node, Scope]
}
object Typeofcache {
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofcache] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearPath(value: () => Unit): Self = StObject.set(x, "clearPath", js.Any.fromFunction0(value))
    
    inline def setClearScope(value: () => Unit): Self = StObject.set(x, "clearScope", js.Any.fromFunction0(value))
    
    inline def setPath(value: WeakMap[Node, Map[Node, NodePath[Node]]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScope(value: WeakMap[Node, Scope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
