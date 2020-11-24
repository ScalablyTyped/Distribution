package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMap extends js.Object {
  
  var source: SourceNode = js.native
  
  var transform: TransformNode = js.native
}
object NodeMap {
  
  @scala.inline
  def apply(source: SourceNode, transform: TransformNode): NodeMap = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMap]
  }
  
  @scala.inline
  implicit class NodeMapOps[Self <: NodeMap] (val x: Self) extends AnyVal {
    
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
    def setSource(value: SourceNode): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: TransformNode): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
}
