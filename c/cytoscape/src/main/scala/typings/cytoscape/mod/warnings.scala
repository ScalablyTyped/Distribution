package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cytoscape", "warnings")
@js.native
object warnings extends js.Object {
  /**
    * Surpress Cytoscape internal warnings globally with a flag.
    * @param condition If true, all Cytoscape warnings are surpressed.
    * https://js.cytoscape.org/#core/initialisation
    */
  def apply(condition: Boolean): Unit = js.native
}

