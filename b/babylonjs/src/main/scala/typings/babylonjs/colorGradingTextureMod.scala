package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/colorGradingTexture", JSImport.Namespace)
@js.native
object colorGradingTextureMod extends js.Object {
  
  @js.native
  class ColorGradingTexture protected () extends BaseTexture {
    /**
      * Instantiates a ColorGradingTexture from the following parameters.
      *
      * @param url The location of the color gradind data (currently only supporting 3dl)
      * @param sceneOrEngine The scene or engine the texture will be used in
      * @param onLoad defines a callback triggered when the texture has been loaded
      */
    def this(url: String, sceneOrEngine: Scene) = this()
    def this(url: String, sceneOrEngine: ThinEngine) = this()
    def this(url: String, sceneOrEngine: Scene, onLoad: Nullable[js.Function0[Unit]]) = this()
    def this(url: String, sceneOrEngine: ThinEngine, onLoad: Nullable[js.Function0[Unit]]) = this()
    
    var _onLoad: js.Any = js.native
    
    var _textureMatrix: js.Any = js.native
    
    /**
      * Fires the onload event from the constructor if requested.
      */
    var _triggerOnLoad: js.Any = js.native
    
    /**
      * Occurs when the file being loaded is a .3dl LUT file.
      */
    var load3dlTexture: js.Any = js.native
    
    /**
      * Starts the loading process of the texture.
      */
    var loadTexture: js.Any = js.native
    
    /**
      * The texture URL.
      */
    var url: String = js.native
  }
  /* static members */
  @js.native
  object ColorGradingTexture extends js.Object {
    
    /**
      * Parses a color grading texture serialized by Babylon.
      * @param parsedTexture The texture information being parsedTexture
      * @param scene The scene to load the texture in
      * @param rootUrl The root url of the data assets to load
      * @return A color gradind texture
      */
    def Parse(parsedTexture: js.Any, scene: Scene): Nullable[ColorGradingTexture] = js.native
    
    /**
      * Empty line regex stored for GC.
      */
    var _noneEmptyLineRegex: js.Any = js.native
  }
}
