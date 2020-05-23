package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TextureOptimization")
@js.native
/**
  * Creates the TextureOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param maximumSize defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
  * @param step defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
  */
class TextureOptimization ()
  extends typings.babylonjs.BABYLON.TextureOptimization {
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
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  /* CompleteClass */
  override var maximumSize: Double = js.native
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  override var priority: Double = js.native
  /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
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

