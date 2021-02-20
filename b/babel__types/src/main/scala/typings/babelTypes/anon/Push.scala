package typings.babelTypes.anon

import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Push extends StObject {
  
  def buildUndefinedNode(): Node = js.native
  
  def push(value: Init): Unit = js.native
}
object Push {
  
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: Init => Unit): Push = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push]
  }
  
  @scala.inline
  implicit class PushMutableBuilder[Self <: Push] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildUndefinedNode(value: () => Node): Self = StObject.set(x, "buildUndefinedNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: Init => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
