package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The effect layer Helps adding post process effect blended with the main pass.
  *
  * This can be for instance use to generate glow or higlight effects on the scene.
  *
  * The effect layer class can not be used directly and is intented to inherited from to be
  * customized per effects.
  */
@JSImport("babylonjs", "EffectLayer")
@js.native
abstract class EffectLayer protected ()
  extends babylonjsLib.BABYLONNs.EffectLayer {
  /**
    * Instantiates a new effect Layer and references it in the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    */
  def this(/** The Friendly of the effect in the scene */
  name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
  * The effect layer Helps adding post process effect blended with the main pass.
  *
  * This can be for instance use to generate glow or higlight effects on the scene.
  *
  * The effect layer class can not be used directly and is intented to inherited from to be
  * customized per effects.
  */
@JSImport("babylonjs", "EffectLayer")
@js.native
object EffectLayer extends js.Object {
  /**
    * Creates an effect layer from parsed effect layer data
    * @param parsedEffectLayer defines effect layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the effect layer information
    * @returns a parsed effect Layer
    */
  def Parse(parsedEffectLayer: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.EffectLayer = js.native
}

