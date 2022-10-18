package typings.babylonjs

import typings.babylonjs.anon.AutoPlay
import typings.babylonjs.helpersTextureDomeMod.TextureDome
import typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersVideoDomeMod {
  
  @JSImport("babylonjs/Helpers/videoDome", "VideoDome")
  @js.native
  open class VideoDome protected () extends TextureDome[VideoTexture] {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
      * @param options An object containing optional or exposed sub element properties
      * @param options.resolution
      * @param options.clickToPlay
      * @param options.autoPlay
      * @param options.loop
      * @param options.size
      * @param options.poster
      * @param options.faceForward
      * @param options.useDirectMapping
      * @param options.halfDomeMode
      * @param options.crossEyeMode
      * @param options.generateMipMaps
      * @param options.mesh
      * @param scene
      * @param onError
      */
    def this(name: String, textureUrlOrElement: String, options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: js.Array[String], options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: HTMLVideoElement, options: AutoPlay, scene: Scene) = this()
    def this(
      name: String,
      textureUrlOrElement: String,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: js.Array[String],
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: HTMLVideoElement,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    
    /* protected */ def _initTexture(urlsOrElement: HTMLVideoElement, scene: Scene, options: Any): VideoTexture = js.native
    
    /* private */ var _pointerObserver: Any = js.native
    
    /* private */ var _textureObserver: Any = js.native
    
    /**
      * Get the video mode of this dome
      */
    def videoMode: Double = js.native
    /**
      * Set the video mode of this dome.
      * @see textureMode
      */
    def videoMode_=(value: Double): Unit = js.native
    
    /**
      * Get the video texture associated with this video dome
      */
    def videoTexture: VideoTexture = js.native
  }
  /* static members */
  object VideoDome {
    
    /**
      * Define the video source as a Monoscopic panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/videoDome", "VideoDome.MODE_MONOSCOPIC")
    @js.native
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/videoDome", "VideoDome.MODE_SIDEBYSIDE")
    @js.native
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/videoDome", "VideoDome.MODE_TOPBOTTOM")
    @js.native
    val MODE_TOPBOTTOM: Double = js.native
  }
}
