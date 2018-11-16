package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines an optimization used to increase or decrease the rendering resolution
     * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
     */
@JSImport("babylonjs", "HardwareScalingOptimization")
@js.native
class HardwareScalingOptimization ()
  extends babylonjsLib.BABYLONNs.HardwareScalingOptimization {
  /**
           * Creates the HardwareScalingOptimization object
           * @param priority defines the priority of this optimization (0 by default which means first in the list)
           * @param maximumScale defines the maximum scale to use (2 by default)
           * @param step defines the step to use between two passes (0.5 by default)
           */
  def this(/**
           * Defines the priority of this optimization (0 by default which means first in the list)
           */
  priority: scala.Double) = this()
  /**
           * Creates the HardwareScalingOptimization object
           * @param priority defines the priority of this optimization (0 by default which means first in the list)
           * @param maximumScale defines the maximum scale to use (2 by default)
           * @param step defines the step to use between two passes (0.5 by default)
           */
  def this(/**
           * Defines the priority of this optimization (0 by default which means first in the list)
           */
  priority: scala.Double, /**
           * Defines the maximum scale to use (2 by default)
           */
  maximumScale: scala.Double) = this()
  /**
           * Creates the HardwareScalingOptimization object
           * @param priority defines the priority of this optimization (0 by default which means first in the list)
           * @param maximumScale defines the maximum scale to use (2 by default)
           * @param step defines the step to use between two passes (0.5 by default)
           */
  def this(/**
           * Defines the priority of this optimization (0 by default which means first in the list)
           */
  priority: scala.Double, /**
           * Defines the maximum scale to use (2 by default)
           */
  maximumScale: scala.Double, /**
           * Defines the step to use between two passes (0.5 by default)
           */
  step: scala.Double) = this()
}

