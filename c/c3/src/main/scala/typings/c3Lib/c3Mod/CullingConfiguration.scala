package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CullingConfiguration extends js.Object {
  /**
    * The number of tick texts will be adjusted to less than this value.
    */
  var max: scala.Double
}

object CullingConfiguration {
  @scala.inline
  def apply(max: scala.Double): CullingConfiguration = {
    val __obj = js.Dynamic.literal(max = max)
  
    __obj.asInstanceOf[CullingConfiguration]
  }
}

