package typings.cypress.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Default: false
    */
  var includeStack: Boolean
  /**
    * Default: true
    */
  var showDiff: Boolean
  /**
    * Default: 40
    */
  var truncateThreshold: Double
}

object Config {
  @scala.inline
  def apply(includeStack: Boolean, showDiff: Boolean, truncateThreshold: Double): Config = {
    val __obj = js.Dynamic.literal(includeStack = includeStack, showDiff = showDiff, truncateThreshold = truncateThreshold)
  
    __obj.asInstanceOf[Config]
  }
}

