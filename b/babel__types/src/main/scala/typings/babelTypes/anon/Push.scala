package typings.babelTypes.anon

import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Push extends js.Object {
  
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
  implicit class PushOps[Self <: Push] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildUndefinedNode(value: () => Node): Self = this.set("buildUndefinedNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: Init => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
}
