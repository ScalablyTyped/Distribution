package typings.babelTypes.anon

import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildUndefinedNode extends StObject {
  
  def buildUndefinedNode(): Node
  
  def push(value: Id): Unit
}
object BuildUndefinedNode {
  
  inline def apply(buildUndefinedNode: () => Node, push: Id => Unit): BuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[BuildUndefinedNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildUndefinedNode] (val x: Self) extends AnyVal {
    
    inline def setBuildUndefinedNode(value: () => Node): Self = StObject.set(x, "buildUndefinedNode", js.Any.fromFunction0(value))
    
    inline def setPush(value: Id => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
