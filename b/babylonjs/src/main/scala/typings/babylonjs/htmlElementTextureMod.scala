package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlElementTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/htmlElementTexture", "HtmlElementTexture")
  @js.native
  open class HtmlElementTexture protected () extends BaseTexture {
    def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
    /**
      * Instantiates a HtmlElementTexture from the following parameters.
      *
      * @param name Defines the name of the texture
      * @param element Defines the video or canvas the texture is filled with
      * @param options Defines the other none mandatory texture creation options
      */
    def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
    
    /* private */ var _createInternalTexture: Any = js.native
    
    /* private */ var _generateMipMaps: Any = js.native
    
    /* private */ var _isVideo: Any = js.native
    
    /* private */ var _samplingMode: Any = js.native
    
    /* private */ var _textureMatrix: Any = js.native
    
    /**
      * The texture URL.
      */
    var element: HTMLVideoElement | HTMLCanvasElement = js.native
    
    /**
      * Observable triggered once the texture has been loaded.
      */
    var onLoadObservable: Observable[HtmlElementTexture] = js.native
    
    /**
      * Updates the content of the texture.
      * @param invertY Defines whether the texture should be inverted on Y (false by default on video and true on canvas)
      */
    def update(): Unit = js.native
    def update(invertY: Nullable[Boolean]): Unit = js.native
  }
  /* static members */
  object HtmlElementTexture {
    
    @JSImport("babylonjs/Materials/Textures/htmlElementTexture", "HtmlElementTexture._DefaultOptions")
    @js.native
    val _DefaultOptions: Any = js.native
  }
  
  trait IHtmlElementTextureOptions extends StObject {
    
    /**
      * Defines the engine instance to use the texture with. It is not mandatory if you define a scene.
      */
    var engine: Nullable[ThinEngine]
    
    /**
      * Defines whether mip maps should be created or not.
      */
    var generateMipMaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the sampling mode of the texture.
      */
    var samplingMode: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the scene the texture belongs to. It is not mandatory if you define an engine.
      */
    var scene: Nullable[Scene]
  }
  object IHtmlElementTextureOptions {
    
    inline def apply(): IHtmlElementTextureOptions = {
      val __obj = js.Dynamic.literal(engine = null, scene = null)
      __obj.asInstanceOf[IHtmlElementTextureOptions]
    }
    
    extension [Self <: IHtmlElementTextureOptions](x: Self) {
      
      inline def setEngine(value: Nullable[ThinEngine]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineNull: Self = StObject.set(x, "engine", null)
      
      inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
      
      inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
      
      inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
      
      inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
      
      inline def setScene(value: Nullable[Scene]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setSceneNull: Self = StObject.set(x, "scene", null)
    }
  }
}
