package typings.cytoscape

import typings.cytoscape.cytoscapeMod.EdgeCollection
import typings.cytoscape.cytoscapeMod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cut extends js.Object {
  var cut: EdgeCollection
  var partitionFirst: NodeCollection
  var partitionSecond: NodeCollection
}

object Anon_Cut {
  @scala.inline
  def apply(cut: EdgeCollection, partitionFirst: NodeCollection, partitionSecond: NodeCollection): Anon_Cut = {
    val __obj = js.Dynamic.literal(cut = cut.asInstanceOf[js.Any], partitionFirst = partitionFirst.asInstanceOf[js.Any], partitionSecond = partitionSecond.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cut]
  }
}

