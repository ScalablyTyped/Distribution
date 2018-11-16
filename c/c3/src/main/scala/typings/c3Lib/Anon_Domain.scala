package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Domain extends js.Object {
  /**
           * Zoom by giving x domain.
           * @param domain If domain is given, the chart will be zoomed to the given domain. If no argument is given, the current zoomed domain will be returned.
           */
  def apply(): js.Array[scala.Double] = js.native
  /**
           * Zoom by giving x domain.
           * @param domain If domain is given, the chart will be zoomed to the given domain. If no argument is given, the current zoomed domain will be returned.
           */
  def apply(domain: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
           * Enable and disable zooming.
           * @param enabled If enabled is true, the feature of zooming will be enabled. If false is given, it will be disabled.
           */
  def enable(enabled: scala.Boolean): scala.Unit = js.native
}

