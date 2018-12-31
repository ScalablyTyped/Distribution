package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an optimization used to reduce the size of render target textures
  * @description More details at http://doc.babylonjs.com/how_to/how_to_use_sceneoptimizer
  */
@JSGlobal("BABYLON.TextureOptimization")
@js.native
/**
  * Creates the TextureOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param maximumSize defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
  * @param step defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
  */
class TextureOptimization () extends SceneOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: scala.Double) = this()
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: scala.Double, /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: scala.Double) = this()
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: scala.Double, /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: scala.Double, /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: scala.Double) = this()
  /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  var maximumSize: scala.Double = js.native
  /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  var step: scala.Double = js.native
}

