package typings.cytoscape

import typings.cytoscape.mod.EdgeCollection
import typings.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCut extends js.Object {
  var cut: EdgeCollection
  var partitionFirst: NodeCollection
  var partitionSecond: NodeCollection
}

object AnonCut {
  @scala.inline
  def apply(cut: EdgeCollection, partitionFirst: NodeCollection, partitionSecond: NodeCollection): AnonCut = {
    val __obj = js.Dynamic.literal(cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCut]
  }
}

