package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorGradingTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/colorGradingTexture", "ColorGradingTexture")
  @js.native
  open class ColorGradingTexture protected () extends BaseTexture {
    /**
      * Instantiates a ColorGradingTexture from the following parameters.
      *
      * @param url The location of the color grading data (currently only supporting 3dl)
      * @param sceneOrEngine The scene or engine the texture will be used in
      * @param onLoad defines a callback triggered when the texture has been loaded
      */
    def this(url: String, sceneOrEngine: Scene) = this()
    def this(url: String, sceneOrEngine: ThinEngine) = this()
    def this(url: String, sceneOrEngine: Scene, onLoad: Nullable[js.Function0[Unit]]) = this()
    def this(url: String, sceneOrEngine: ThinEngine, onLoad: Nullable[js.Function0[Unit]]) = this()
    
    /**
      * Occurs when the file being loaded is a .3dl LUT file.
      */
    /* private */ var _load3dlTexture: Any = js.native
    
    /**
      * Starts the loading process of the texture.
      */
    /* private */ var _loadTexture: Any = js.native
    
    /* private */ var _onLoad: Any = js.native
    
    /* private */ var _textureMatrix: Any = js.native
    
    /**
      * Fires the onload event from the constructor if requested.
      */
    /* private */ var _triggerOnLoad: Any = js.native
    
    /**
      * The texture URL.
      */
    var url: String = js.native
  }
  /* static members */
  object ColorGradingTexture {
    
    @JSImport("babylonjs/Materials/Textures/colorGradingTexture", "ColorGradingTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a color grading texture serialized by Babylon.
      * @param parsedTexture The texture information being parsedTexture
      * @param scene The scene to load the texture in
      * @returns A color grading texture
      */
    inline def Parse(parsedTexture: Any, scene: Scene): Nullable[ColorGradingTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[ColorGradingTexture]]
    
    /**
      * Empty line regex stored for GC.
      */
    @JSImport("babylonjs/Materials/Textures/colorGradingTexture", "ColorGradingTexture._NoneEmptyLineRegex")
    @js.native
    def _NoneEmptyLineRegex: Any = js.native
    inline def _NoneEmptyLineRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NoneEmptyLineRegex")(x.asInstanceOf[js.Any])
  }
}
