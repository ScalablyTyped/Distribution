package typings.c3.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CullingConfiguration extends js.Object {
  /**
    * The number of tick texts will be adjusted to less than this value.
    */
  var max: Double
}

object CullingConfiguration {
  @scala.inline
  def apply(max: Double): CullingConfiguration = {
    val __obj = js.Dynamic.literal(max = max)
  
    __obj.asInstanceOf[CullingConfiguration]
  }
}

