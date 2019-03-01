package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/animation
  *
  */
trait AnimationFitOptions extends js.Object {
  var eles: CollectionArgument | Selector
   // to which the viewport will be fitted.
  var padding: scala.Double
}

object AnimationFitOptions {
  @scala.inline
  def apply(eles: CollectionArgument | Selector, padding: scala.Double): AnimationFitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eles")(eles.asInstanceOf[js.Any])
    __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[AnimationFitOptions]
  }
}

