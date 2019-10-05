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
  var `padding-bottom`: js.UndefOr[String] = js.undefined
  var `padding-left`: js.UndefOr[String] = js.undefined
  var `padding-right`: js.UndefOr[String] = js.undefined
  var `padding-top`: js.UndefOr[String] = js.undefined
}

object PaddingNode {
  @scala.inline
  def apply(
    `padding-bottom`: String = null,
    `padding-left`: String = null,
    `padding-right`: String = null,
    `padding-top`: String = null
  ): PaddingNode = {
    val __obj = js.Dynamic.literal()
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`)
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`)
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`)
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`)
    __obj.asInstanceOf[PaddingNode]
  }
}

