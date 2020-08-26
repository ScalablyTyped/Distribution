package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.aStar
  */
@js.native
trait SearchAStarResult extends js.Object {
  var distance: Double = js.native
  var found: Boolean = js.native
  var path: CollectionReturnValue = js.native
}

object SearchAStarResult {
  @scala.inline
  def apply(distance: Double, found: Boolean, path: CollectionReturnValue): SearchAStarResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarResult]
  }
  @scala.inline
  implicit class SearchAStarResultOps[Self <: SearchAStarResult] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFound(value: Boolean): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: CollectionReturnValue): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

