package typings.cytoscape.cytoscapeMod.Css

import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ghost properties allow for creating a ghosting effect, a semitransparent duplicate of the element drawn at an offset.
  * https://js.cytoscape.org/#style/ghost
  */
trait Ghost extends js.Object {
  /**
    * Whether to use the ghost effect; may be yes or no.
    */
  var ghost: PropertyValueNode[yes | no]
  /**
    * The horizontal offset used to position the ghost effect.
    */
  var `ghost-offset-x`: PropertyValueNode[Double]
  /**
    * The vertical offset used to position the ghost effect.
    */
  var `ghost-offset-y`: PropertyValueNode[Double]
  /**
    * The opacity of the ghost effect.
    */
  var `ghost-opacity`: PropertyValueNode[Double]
}

object Ghost {
  @scala.inline
  def apply(
    ghost: PropertyValueNode[yes | no],
    `ghost-offset-x`: PropertyValueNode[Double],
    `ghost-offset-y`: PropertyValueNode[Double],
    `ghost-opacity`: PropertyValueNode[Double]
  ): Ghost = {
    val __obj = js.Dynamic.literal(ghost = ghost.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-offset-x")(`ghost-offset-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-offset-y")(`ghost-offset-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-opacity")(`ghost-opacity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost]
  }
}

