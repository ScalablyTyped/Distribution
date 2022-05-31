package typings.babylonjs.BABYLON

import typings.babylonjs.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicTexture
  extends StObject
     with Texture {
  
  /* private */ var _IsCanvasElement: js.Any = js.native
  
  /* private */ var _canvas: js.Any = js.native
  
  /* private */ var _context: js.Any = js.native
  
  /* private */ var _generateMipMaps: js.Any = js.native
  
  /* private */ var _recreate: js.Any = js.native
  
  /**
    * Clears the texture
    */
  def clear(): Unit = js.native
  
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
    text: String,
    x: js.UndefOr[Double | Null],
    y: js.UndefOr[Double | Null],
    font: String,
    color: String | Null,
    clearColor: String,
    invertY: js.UndefOr[Boolean],
    update: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /**
    * Gets the context of the canvas used by the texture
    * @returns the canvas context of the dynamic texture
    */
  def getContext(): CanvasRenderingContext2D = js.native
  
  /**
    * Resizes the texture
    * @param width the new width
    * @param height the new height
    */
  def scaleTo(width: Double, height: Double): Unit = js.native
  
  /**
    * Updates the texture
    * @param invertY defines the direction for the Y axis (default is true - y increases downwards)
    * @param premulAlpha defines if alpha is stored as premultiplied (default is false)
    */
  def update(): Unit = js.native
  def update(invertY: Boolean): Unit = js.native
  def update(invertY: Boolean, premulAlpha: Boolean): Unit = js.native
  def update(invertY: Unit, premulAlpha: Boolean): Unit = js.native
}
