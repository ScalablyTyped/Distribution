package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components extends js.Object {
  var components: CollectionReturnValue = js.native
  var cut: EdgeCollection = js.native
  var partitionFirst: NodeCollection = js.native
  var partitionSecond: NodeCollection = js.native
}

object Components {
  @scala.inline
  def apply(
    components: CollectionReturnValue,
    cut: EdgeCollection,
    partitionFirst: NodeCollection,
    partitionSecond: NodeCollection
  ): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  @scala.inline
  implicit class ComponentsOps[Self <: Components] (val x: Self) extends AnyVal {
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
    def setComponents(value: CollectionReturnValue): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: EdgeCollection): Self = this.set("cut", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionFirst(value: NodeCollection): Self = this.set("partitionFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionSecond(value: NodeCollection): Self = this.set("partitionSecond", value.asInstanceOf[js.Any])
  }
  
}

