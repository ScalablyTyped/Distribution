package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfoCommon[T /* <: NodeType */] extends js.Object {
  /**
    A description of this particular node. Useful to tell multiple instances of
    the same plugin apart during debugging. Example: `'vendor directories'`
    */
  var annotation: js.UndefOr[String | Null] = js.undefined
  /**
    A stack trace generated when the node constructor ran. Useful for telling
    where a given node was instantiated during debugging. This is `(new
    Error).stack` without the first line.
    */
  var instantiationStack: String
  /**
    The name of the plugin that this node is an instance of. Example:
    `'BroccoliMergeTrees'`
    */
  var name: String
  /**
    Either `'transform'` or `'source'`, indicating the node type.
    */
  var nodeType: T
}

object NodeInfoCommon {
  @scala.inline
  def apply[T](
    instantiationStack: String,
    name: String,
    nodeType: T,
    annotation: js.UndefOr[Null | String] = js.undefined
  ): NodeInfoCommon[T] = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(annotation)) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfoCommon[T]]
  }
}

