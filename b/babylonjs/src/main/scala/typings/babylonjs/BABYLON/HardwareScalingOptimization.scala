package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.HardwareScalingOptimization")
@js.native
/**
  * Creates the HardwareScalingOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param maximumScale defines the maximum scale to use (2 by default)
  * @param step defines the step to use between two passes (0.5 by default)
  */
class HardwareScalingOptimization () extends SceneOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Double,
    /**
    * Defines the step to use between two passes (0.5 by default)
    */
  step: Double
  ) = this()
  var _currentScale: js.Any = js.native
  var _directionOffset: js.Any = js.native
  /**
    * Defines the maximum scale to use (2 by default)
    */
  var maximumScale: Double = js.native
  /**
    * Defines the step to use between two passes (0.5 by default)
    */
  var step: Double = js.native
}

