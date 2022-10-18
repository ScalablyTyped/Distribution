package typings.babylonjs

import typings.babylonjs.anon.AutoPlay
import typings.babylonjs.materialsBackgroundBackgroundMaterialMod.BackgroundMaterial
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersTextureDomeMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Helpers/textureDome", "TextureDome")
  @js.native
  open class TextureDome[T /* <: Texture */] protected () extends TransformNode {
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
    
    /* protected */ def _changeTextureMode(value: Double): Unit = js.native
    
    /* private */ var _crossEye: Any = js.native
    
    /* private */ var _halfDome: Any = js.native
    
    /**
      * A mesh that will be used to mask the back of the dome in case it is a 180 degree movie.
      */
    /* private */ var _halfDomeMask: Any = js.native
    
    /* protected */ def _initTexture(urlsOrElement: String, scene: Scene, options: Any): T = js.native
    /* protected */ def _initTexture(urlsOrElement: js.Array[String], scene: Scene, options: Any): T = js.native
    /* protected */ def _initTexture(urlsOrElement: HTMLElement, scene: Scene, options: Any): T = js.native
    
    /**
      * The skybox material
      */
    /* protected */ var _material: BackgroundMaterial = js.native
    
    /**
      * The surface used for the dome
      */
    /* protected */ var _mesh: Mesh = js.native
    
    /**
      * Oberserver used in Stereoscopic VR Mode.
      */
    /* private */ var _onBeforeCameraRenderObserver: Any = js.native
    
    /**
      * The texture being displayed on the sphere
      */
    /* protected */ var _texture: T = js.native
    
    /* protected */ var _textureMode: Double = js.native
    
    /* protected */ var _useDirectMapping: Boolean = js.native
    
    /**
      * Is it a cross-eye texture?
      */
    def crossEye: Boolean = js.native
    /**
      * Set the cross-eye mode. If set, images that can be seen when crossing eyes will render correctly
      */
    def crossEye_=(enabled: Boolean): Unit = js.native
    
    /**
      * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
      * Also see the options.resolution property.
      */
    def fovMultiplier: Double = js.native
    def fovMultiplier_=(value: Double): Unit = js.native
    
    /**
      * Is it a 180 degrees dome (half dome) or 360 texture (full dome)
      */
    def halfDome: Boolean = js.native
    /**
      * Set the halfDome mode. If set, only the front (180 degrees) will be displayed and the back will be blacked out.
      */
    def halfDome_=(enabled: Boolean): Unit = js.native
    
    /**
      * The background material of this dome.
      */
    def material: BackgroundMaterial = js.native
    
    /**
      * Gets the mesh used for the dome.
      */
    def mesh: Mesh = js.native
    
    /* protected */ var onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ] = js.native
    
    /**
      * Observable raised when an error occurred while loading the texture
      */
    var onLoadErrorObservable: Observable[String] = js.native
    
    /**
      * Observable raised when the texture finished loading
      */
    var onLoadObservable: Observable[Unit] = js.native
    
    /**
      * Gets the texture being displayed on the sphere
      */
    def texture: T = js.native
    
    /**
      * Gets or set the current texture mode for the texture. It can be:
      * * TextureDome.MODE_MONOSCOPIC : Define the texture source as a Monoscopic panoramic 360.
      * * TextureDome.MODE_TOPBOTTOM  : Define the texture source as a Stereoscopic TopBottom/OverUnder panoramic 360.
      * * TextureDome.MODE_SIDEBYSIDE : Define the texture source as a Stereoscopic Side by Side panoramic 360.
      */
    def textureMode: Double = js.native
    /**
      * Sets the current texture mode for the texture. It can be:
      * * TextureDome.MODE_MONOSCOPIC : Define the texture source as a Monoscopic panoramic 360.
      * * TextureDome.MODE_TOPBOTTOM  : Define the texture source as a Stereoscopic TopBottom/OverUnder panoramic 360.
      * * TextureDome.MODE_SIDEBYSIDE : Define the texture source as a Stereoscopic Side by Side panoramic 360.
      */
    def textureMode_=(value: Double): Unit = js.native
    
    /**
      * Sets the texture being displayed on the sphere
      */
    def texture_=(newTexture: T): Unit = js.native
  }
  /* static members */
  object TextureDome {
    
    /**
      * Define the source as a Monoscopic panoramic 360/180.
      */
    @JSImport("babylonjs/Helpers/textureDome", "TextureDome.MODE_MONOSCOPIC")
    @js.native
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the source as a Stereoscopic Side by Side panoramic 360/180.
      */
    @JSImport("babylonjs/Helpers/textureDome", "TextureDome.MODE_SIDEBYSIDE")
    @js.native
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the source as a Stereoscopic TopBottom/OverUnder panoramic 360/180.
      */
    @JSImport("babylonjs/Helpers/textureDome", "TextureDome.MODE_TOPBOTTOM")
    @js.native
    val MODE_TOPBOTTOM: Double = js.native
  }
}
