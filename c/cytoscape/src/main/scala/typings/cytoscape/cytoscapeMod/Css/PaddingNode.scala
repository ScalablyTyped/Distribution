package typings.cytoscape.cytoscapeMod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A padding defines an addition to a node’s dimension.
  * For example, padding-left adds to a node’s outer (i.e. total) width.
  * This can be used to add spacing around the label of width: label; height: label; nodes,
  * or it can be used to add spacing between a compound node parent and its children.
  */
trait PaddingNode extends js.Object {
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.undefined
}

object PaddingNode {
  @scala.inline
  def apply(
    `padding-bottom`: PropertyValueNode[String] = null,
    `padding-left`: PropertyValueNode[String] = null,
    `padding-right`: PropertyValueNode[String] = null,
    `padding-top`: PropertyValueNode[String] = null
  ): PaddingNode = {
    val __obj = js.Dynamic.literal()
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingNode]
  }
}

