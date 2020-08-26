package typings.cytoscape.mod.Css

import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A padding defines an addition to a node’s dimension.
  * For example, padding-left adds to a node’s outer (i.e. total) width.
  * This can be used to add spacing around the label of width: label; height: label; nodes,
  * or it can be used to add spacing between a compound node parent and its children.
  */
@js.native
trait PaddingNode extends js.Object {
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.native
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.native
}

object PaddingNode {
  @scala.inline
  def apply(): PaddingNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingNode]
  }
  @scala.inline
  implicit class PaddingNodeOps[Self <: PaddingNode] (val x: Self) extends AnyVal {
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
    def `setPadding-bottomFunction1`(value: NodeSingular => String): Self = this.set("padding-bottom", js.Any.fromFunction1(value))
    @scala.inline
    def `setPadding-bottom`(value: PropertyValueNode[String]): Self = this.set("padding-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-bottom`: Self = this.set("padding-bottom", js.undefined)
    @scala.inline
    def `setPadding-leftFunction1`(value: NodeSingular => String): Self = this.set("padding-left", js.Any.fromFunction1(value))
    @scala.inline
    def `setPadding-left`(value: PropertyValueNode[String]): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    @scala.inline
    def `setPadding-rightFunction1`(value: NodeSingular => String): Self = this.set("padding-right", js.Any.fromFunction1(value))
    @scala.inline
    def `setPadding-right`(value: PropertyValueNode[String]): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
    @scala.inline
    def `setPadding-topFunction1`(value: NodeSingular => String): Self = this.set("padding-top", js.Any.fromFunction1(value))
    @scala.inline
    def `setPadding-top`(value: PropertyValueNode[String]): Self = this.set("padding-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-top`: Self = this.set("padding-top", js.undefined)
  }
  
}

