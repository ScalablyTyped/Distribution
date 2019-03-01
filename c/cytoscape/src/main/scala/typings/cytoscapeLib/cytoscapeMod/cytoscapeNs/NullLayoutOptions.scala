package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/null
  */
trait NullLayoutOptions extends LayoutOptions {
  var name: cytoscapeLib.cytoscapeLibStrings.`null`
}

object NullLayoutOptions {
  @scala.inline
  def apply(name: cytoscapeLib.cytoscapeLibStrings.`null`): NullLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NullLayoutOptions]
  }
}

