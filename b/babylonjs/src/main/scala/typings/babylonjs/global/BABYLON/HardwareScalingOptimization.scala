package typings.babylonjs.global.BABYLON

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
class HardwareScalingOptimization ()
  extends typings.babylonjs.BABYLON.HardwareScalingOptimization {
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
  /* CompleteClass */
  override var _currentScale: js.Any = js.native
  /* CompleteClass */
  override var _directionOffset: js.Any = js.native
  /**
    * Defines the maximum scale to use (2 by default)
    */
  /* CompleteClass */
  override var maximumScale: Double = js.native
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  override var priority: Double = js.native
  /**
    * Defines the step to use between two passes (0.5 by default)
    */
  /* CompleteClass */
  override var step: Double = js.native
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(scene: typings.babylonjs.BABYLON.Scene, optimizer: typings.babylonjs.BABYLON.SceneOptimizer): Boolean = js.native
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
}

