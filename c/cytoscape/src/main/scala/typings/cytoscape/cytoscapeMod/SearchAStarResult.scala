package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.aStar
  */
trait SearchAStarResult extends js.Object {
  var distance: Double
  var found: Boolean
  var path: CollectionReturnValue
}

object SearchAStarResult {
  @scala.inline
  def apply(distance: Double, found: Boolean, path: CollectionReturnValue): SearchAStarResult = {
    val __obj = js.Dynamic.literal(distance = distance, found = found, path = path)
  
    __obj.asInstanceOf[SearchAStarResult]
  }
}

