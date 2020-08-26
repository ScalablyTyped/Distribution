package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfoCommon[T /* <: NodeType */] extends js.Object {
  /**
    A description of this particular node. Useful to tell multiple instances of
    the same plugin apart during debugging. Example: `'vendor directories'`
    */
  var annotation: js.UndefOr[String | Null] = js.native
  /**
    A stack trace generated when the node constructor ran. Useful for telling
    where a given node was instantiated during debugging. This is `(new
    Error).stack` without the first line.
    */
  var instantiationStack: String = js.native
  /**
    The name of the plugin that this node is an instance of. Example:
    `'BroccoliMergeTrees'`
    */
  var name: String = js.native
  /**
    Either `'transform'` or `'source'`, indicating the node type.
    */
  var nodeType: T = js.native
}

object NodeInfoCommon {
  @scala.inline
  def apply[/* <: typings.broccoliNodeApi.mod.NodeType */ T](instantiationStack: String, name: String, nodeType: T): NodeInfoCommon[T] = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfoCommon[T]]
  }
  @scala.inline
  implicit class NodeInfoCommonOps[Self <: NodeInfoCommon[_], /* <: typings.broccoliNodeApi.mod.NodeType */ T] (val x: Self with NodeInfoCommon[T]) extends AnyVal {
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
    def setInstantiationStack(value: String): Self = this.set("instantiationStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: T): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotation(value: String): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    @scala.inline
    def setAnnotationNull: Self = this.set("annotation", null)
  }
  
}

