package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents a full screen 2d layer.
     * This can be usefull to display a picture in the  background of your scene for instance.
     * @see https://www.babylonjs-playground.com/#08A2BS#1
     */
@JSImport("babylonjs", "Layer")
@js.native
class Layer protected ()
  extends babylonjsLib.BABYLONNs.Layer {
  /**
           * Instantiates a new layer.
           * This represents a full screen 2d layer.
           * This can be usefull to display a picture in the  background of your scene for instance.
           * @see https://www.babylonjs-playground.com/#08A2BS#1
           * @param name Define the name of the layer in the scene
           * @param imgUrl Define the url of the texture to display in the layer
           * @param scene Define the scene the layer belongs to
           * @param isBackground Defines whether the layer is displayed in front or behind the scene
           * @param color Defines a color for the layer
           */
  def this(/**
           * Define the name of the layer.
           */
  name: java.lang.String, imgUrl: babylonjsLib.BABYLONNs.Nullable[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
  /**
           * Instantiates a new layer.
           * This represents a full screen 2d layer.
           * This can be usefull to display a picture in the  background of your scene for instance.
           * @see https://www.babylonjs-playground.com/#08A2BS#1
           * @param name Define the name of the layer in the scene
           * @param imgUrl Define the url of the texture to display in the layer
           * @param scene Define the scene the layer belongs to
           * @param isBackground Defines whether the layer is displayed in front or behind the scene
           * @param color Defines a color for the layer
           */
  def this(/**
           * Define the name of the layer.
           */
  name: java.lang.String, imgUrl: babylonjsLib.BABYLONNs.Nullable[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], isBackground: scala.Boolean) = this()
  /**
           * Instantiates a new layer.
           * This represents a full screen 2d layer.
           * This can be usefull to display a picture in the  background of your scene for instance.
           * @see https://www.babylonjs-playground.com/#08A2BS#1
           * @param name Define the name of the layer in the scene
           * @param imgUrl Define the url of the texture to display in the layer
           * @param scene Define the scene the layer belongs to
           * @param isBackground Defines whether the layer is displayed in front or behind the scene
           * @param color Defines a color for the layer
           */
  def this(/**
           * Define the name of the layer.
           */
  name: java.lang.String, imgUrl: babylonjsLib.BABYLONNs.Nullable[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], isBackground: scala.Boolean, color: babylonjsLib.BABYLONNs.Color4) = this()
}

