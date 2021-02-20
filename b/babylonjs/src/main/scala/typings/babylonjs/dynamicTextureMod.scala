package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/dynamicTexture", "DynamicTexture")
  @js.native
  class DynamicTexture protected () extends Texture {
    def this(name: String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: Boolean) = this()
    def this(name: String, options: js.Any, scene: Null, generateMipMaps: Boolean) = this()
    /**
      * Creates a DynamicTexture
      * @param name defines the name of the texture
      * @param options provides 3 alternatives for width and height of texture, a canvas, object with width and height properties, number for both width and height
      * @param scene defines the scene where you want the texture
      * @param generateMipMaps defines the use of MinMaps or not (default is false)
      * @param samplingMode defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      * @param format defines the texture format to use (default is Engine.TEXTUREFORMAT_RGBA)
      * @param invertY defines if the texture needs to be inverted on the y axis during loading
      */
    def this(name: String, options: js.Any, scene: Scene, generateMipMaps: Boolean) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: Double
    ) = this()
    def this(name: String, options: js.Any, scene: Null, generateMipMaps: Boolean, samplingMode: Double) = this()
    def this(name: String, options: js.Any, scene: Scene, generateMipMaps: Boolean, samplingMode: Double) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: Double
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: Double
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Null,
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: Double
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Null,
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: Double
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Scene,
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: Double
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Scene,
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: Double
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: Double,
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: Double,
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Null,
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Null,
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: Double,
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Null,
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Null,
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: Double,
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Scene,
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Scene,
      generateMipMaps: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      format: Double,
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Scene,
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: js.UndefOr[scala.Nothing],
      invertY: Boolean
    ) = this()
    def this(
      name: String,
      options: js.Any,
      scene: Scene,
      generateMipMaps: Boolean,
      samplingMode: Double,
      format: Double,
      invertY: Boolean
    ) = this()
    
    var _IsCanvasElement: js.Any = js.native
    
    var _canvas: js.Any = js.native
    
    var _context: js.Any = js.native
    
    var _generateMipMaps: js.Any = js.native
    
    var _recreate: js.Any = js.native
    
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
    def update(invertY: js.UndefOr[scala.Nothing], premulAlpha: Boolean): Unit = js.native
    def update(invertY: Boolean): Unit = js.native
    def update(invertY: Boolean, premulAlpha: Boolean): Unit = js.native
  }
}
