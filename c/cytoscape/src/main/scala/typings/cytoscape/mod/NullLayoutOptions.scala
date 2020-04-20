package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.`null`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/null
  */
trait NullLayoutOptions extends LayoutOptions {
  var name: `null`
}

object NullLayoutOptions {
  @scala.inline
  def apply(name: `null`): NullLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLayoutOptions]
  }
}

