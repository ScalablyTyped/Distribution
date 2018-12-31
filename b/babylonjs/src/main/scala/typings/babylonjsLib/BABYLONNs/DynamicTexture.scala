package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class extending Texture allowing drawing on a texture
  * @see http://doc.babylonjs.com/how_to/dynamictexture
  */
@JSGlobal("BABYLON.DynamicTexture")
@js.native
class DynamicTexture protected () extends Texture {
  /**
    * Creates a DynamicTexture
    * @param name defines the name of the texture
    * @param options provides 3 alternatives for width and height of texture, a canvas, object with width and height properties, number for both width and height
    * @param scene defines the scene where you want the texture
    * @param generateMipMaps defines the use of MinMaps or not (default is false)
    * @param samplingMode defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    * @param format defines the texture format to use (default is BABYLON.Engine.TEXTUREFORMAT_RGBA)
    */
  def this(name: java.lang.String, options: js.Any, scene: Scene, generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, options: js.Any, scene: scala.Null, generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, options: js.Any, scene: Scene, generateMipMaps: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: scala.Null, generateMipMaps: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: Scene, generateMipMaps: scala.Boolean, samplingMode: scala.Double, format: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: scala.Boolean, samplingMode: scala.Double, format: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: scala.Null, generateMipMaps: scala.Boolean, samplingMode: scala.Double, format: scala.Double) = this()
  var _canvas: js.Any = js.native
  var _context: js.Any = js.native
  var _engine: js.Any = js.native
  var _generateMipMaps: js.Any = js.native
  var _recreate: js.Any = js.native
  /**
    * Clears the texture
    */
  def clear(): scala.Unit = js.native
  /**
    * Draws text onto the texture
    * @param text defines the text to be drawn
    * @param x defines the placement of the text from the left
    * @param y defines the placement of the text from the top when invertY is true and from the bottom when false
    * @param font defines the font to be used with font-style, font-size, font-name
    * @param color defines the color used for the text
    * @param clearColor defines the color for the canvas, use null to not overwrite canvas
    * @param invertY defines the direction for the Y axis (default is true - y increases downwards)
    * @param update defines whether texture is immediately update (default is true)
    */
  def drawText(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    color: java.lang.String,
    clearColor: java.lang.String
  ): scala.Unit = js.native
  def drawText(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    color: java.lang.String,
    clearColor: java.lang.String,
    invertY: scala.Boolean
  ): scala.Unit = js.native
  def drawText(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    color: java.lang.String,
    clearColor: java.lang.String,
    invertY: scala.Boolean,
    update: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Gets the context of the canvas used by the texture
    * @returns the canvas context of the dynamic texture
    */
  def getContext(): babylonjsLib.CanvasRenderingContext2D = js.native
  /**
    * Resizes the texture
    * @param width the new width
    * @param height the new height
    */
  def scaleTo(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Updates the texture
    * @param invertY defines the direction for the Y axis (default is true - y increases downwards)
    * @param premulAlpha defines if alpha is stored as premultiplied (default is false)
    */
  def update(): scala.Unit = js.native
  def update(invertY: scala.Boolean): scala.Unit = js.native
  def update(invertY: scala.Boolean, premulAlpha: scala.Boolean): scala.Unit = js.native
}

