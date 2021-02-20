package typings.babelTypes.anon

import typings.babelTypes.indexTs37Mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildUndefinedNode extends StObject {
  
  def buildUndefinedNode(): Node = js.native
  
  def push(value: Id): Unit = js.native
}
object BuildUndefinedNode {
  
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: Id => Unit): BuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[BuildUndefinedNode]
  }
  
  @scala.inline
  implicit class BuildUndefinedNodeMutableBuilder[Self <: BuildUndefinedNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildUndefinedNode(value: () => Node): Self = StObject.set(x, "buildUndefinedNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: Id => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
