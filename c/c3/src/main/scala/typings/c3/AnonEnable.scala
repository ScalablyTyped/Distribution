package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnable extends js.Object {
  /**
    * Zoom by giving x domain.
    * @param domain If given, the chart will be zoomed to the given domain.
    * @returns `domain`, if given; otherwise the current zoom range of the chart.
    */
  def apply(): js.Array[Double] = js.native
  def apply(domain: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Enable and disable zooming.
    * @param enabled If enabled is `true`, the feature of zooming will be enabled. If `false` is given, it will be disabled.
    */
  def enable(enabled: Boolean): Unit = js.native
  /**
    * Set or get the maximum x value of the chart for zooming.
    * @param max The new maximum zoom value.
    * @returns If `max` is _not_ given, will return the existing zoom value.
    *
    */
  def max(): Double = js.native
  def max(max: Double): Unit = js.native
  /**
    * Set or get the minimum x value of the chart for zooming.
    * @param min The new minimum zoom value.
    * @returns If `min` is _not_ given, will return the existing zoom value.
    *
    */
  def min(): Double = js.native
  def min(min: Double): Unit = js.native
  /**
    * Set or get both the max and min zoom values at the same time.
    * @param range An object with max and/or min values.
    * @returns If `range` is _not_ given, returns an object with current max and min zoom values.
    */
  def range(): AnonMinNumber = js.native
  def range(range: AnonMaxNumberMinNumber): Unit = js.native
}

