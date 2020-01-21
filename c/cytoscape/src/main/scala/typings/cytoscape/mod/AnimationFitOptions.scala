package typings.cytoscape.mod

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
  var padding: Double
}

object AnimationFitOptions {
  @scala.inline
  def apply(eles: CollectionArgument | Selector, padding: Double): AnimationFitOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnimationFitOptions]
  }
}

