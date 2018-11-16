package typings
package d3DashEaseLib.d3DashEaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticEasingFactory extends js.Object {
  /**
       * Calculate eased time.
       * @param normalizedTime Normalized time typically in the range [0, 1]
       */
  def apply(normalizedTime: scala.Double): scala.Double = js.native
  /**
       * Returns a new elastic easing with the specified amplitude a.
       * Defaults to 1,if not specified.
       *
       * @param a Amplitude for elastic easing.
       */
  def amplitude(a: scala.Double): ElasticEasingFactory = js.native
  /**
       * Returns a new elastic easing with the specified amplitude a.
       * Defaults to 0.3,if not specified.
       *
       * @param p Period for elastic easing.
       */
  def period(p: scala.Double): ElasticEasingFactory = js.native
}

