package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Default: false
    */
  var includeStack: scala.Boolean
  /**
    * Default: true
    */
  var showDiff: scala.Boolean
  /**
    * Default: 40
    */
  var truncateThreshold: scala.Double
}

object Config {
  @scala.inline
  def apply(includeStack: scala.Boolean, showDiff: scala.Boolean, truncateThreshold: scala.Double): Config = {
    val __obj = js.Dynamic.literal(includeStack = includeStack, showDiff = showDiff, truncateThreshold = truncateThreshold)
  
    __obj.asInstanceOf[Config]
  }
}

