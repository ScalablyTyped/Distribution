package typings.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParent extends js.Object {
  var parent: String
}

object AnonParent {
  @scala.inline
  def apply(parent: String): AnonParent = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParent]
  }
}

