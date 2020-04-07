package typings.babylonjs.layersIndexMod

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Layers/index", "Layer")
@js.native
class Layer protected ()
  extends typings.babylonjs.layerMod.Layer {
  /**
    * Instantiates a new layer.
    * This represents a full screen 2d layer.
    * This can be useful to display a picture in the  background of your scene for instance.
    * @see https://www.babylonjs-playground.com/#08A2BS#1
    * @param name Define the name of the layer in the scene
    * @param imgUrl Define the url of the texture to display in the layer
    * @param scene Define the scene the layer belongs to
    * @param isBackground Defines whether the layer is displayed in front or behind the scene
    * @param color Defines a color for the layer
    */
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[Scene]
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[Scene],
    isBackground: Boolean
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[Scene],
    isBackground: Boolean,
    color: Color4
  ) = this()
}

