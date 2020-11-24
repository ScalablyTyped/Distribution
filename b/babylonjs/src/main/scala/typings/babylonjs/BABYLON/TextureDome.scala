package typings.babylonjs.BABYLON

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureDome[T /* <: Texture */] extends TransformNode {
  
  /* protected */ def _changeTextureMode(value: Double): Unit = js.native
  
  var _crossEye: js.Any = js.native
  
  var _halfDome: js.Any = js.native
  
  /**
    * A mesh that will be used to mask the back of the dome in case it is a 180 degree movie.
    */
  var _halfDomeMask: js.Any = js.native
  
  /* protected */ def _initTexture(urlsOrElement: String, scene: Scene, options: js.Any): T = js.native
  /* protected */ def _initTexture(urlsOrElement: js.Array[String], scene: Scene, options: js.Any): T = js.native
  /* protected */ def _initTexture(urlsOrElement: HTMLElement, scene: Scene, options: js.Any): T = js.native
  
  /**
    * The skybox material
    */
  var _material: BackgroundMaterial = js.native
  
  /**
    * The surface used for the dome
    */
  var _mesh: Mesh = js.native
  
  /**
    * Oberserver used in Stereoscopic VR Mode.
    */
  var _onBeforeCameraRenderObserver: js.Any = js.native
  
  /**
    * The texture being displayed on the sphere
    */
  var _texture: T = js.native
  
  var _textureMode: Double = js.native
  
  var _useDirectMapping: Boolean = js.native
  
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
  
  var onError: Nullable[
    js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
  ] = js.native
  
  /**
    * Observable raised when an error occured while loading the 360 image
    */
  var onLoadErrorObservable: Observable[String] = js.native
  
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
