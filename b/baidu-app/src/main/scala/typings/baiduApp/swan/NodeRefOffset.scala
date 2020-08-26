package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRefOffset extends js.Object {
  /** 节点的dataset */
  var dataset: js.Any = js.native
  /** 节点的ID */
  var id: String = js.native
  /** 节点的水平滚动位置 */
  var scrollLeft: Double = js.native
  /** 节点的竖直滚动位置 */
  var scrollTop: Double = js.native
}

object NodeRefOffset {
  @scala.inline
  def apply(dataset: js.Any, id: String, scrollLeft: Double, scrollTop: Double): NodeRefOffset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefOffset]
  }
  @scala.inline
  implicit class NodeRefOffsetOps[Self <: NodeRefOffset] (val x: Self) extends AnyVal {
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
    def setDataset(value: js.Any): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
  
}

