package typings.babylonjs

import typings.babylonjs.backgroundMaterialMod.BackgroundMaterial
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Helpers/photoDome", JSImport.Namespace)
@js.native
object photoDomeMod extends js.Object {
  @js.native
  class PhotoDome protected () extends TransformNode {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param urlsOfPhoto defines the url of the photo to display
      * @param options defines an object containing optional or exposed sub element properties
      * @param onError defines a callback called when an error occured while loading the texture
      */
    def this(name: String, urlOfPhoto: String, options: AnonFaceForward, scene: Scene) = this()
    def this(
      name: String,
      urlOfPhoto: String,
      options: AnonFaceForward,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
    ) = this()
    var _changeImageMode: js.Any = js.native
    var _imageMode: js.Any = js.native
    /**
      * The skybox material
      */
    var _material: BackgroundMaterial = js.native
    /**
      * The surface used for the skybox
      */
    var _mesh: Mesh = js.native
    var _onBeforeCameraRenderObserver: js.Any = js.native
    /**
      * The texture being displayed on the sphere
      */
    var _photoTexture: Texture = js.native
    var _useDirectMapping: js.Any = js.native
    /**
      * Observable raised when an error occured while loading the 360 image
      */
    var onLoadErrorObservable: Observable[String] = js.native
    /**
      * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
      * Also see the options.resolution property.
      */
    def fovMultiplier(): Double = js.native
    def fovMultiplier(value: Double): js.Any = js.native
    /**
      * Gets or set the current video mode for the video. It can be:
      * * PhotoDome.MODE_MONOSCOPIC : Define the image as a Monoscopic panoramic 360 image.
      * * PhotoDome.MODE_TOPBOTTOM  : Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      * * PhotoDome.MODE_SIDEBYSIDE : Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    def imageMode(): Double = js.native
    def imageMode(value: Double): js.Any = js.native
    /**
      * Gets the mesh used for the skybox.
      */
    def mesh(): Mesh = js.native
    /**
      * Gets or sets the texture being displayed on the sphere
      */
    def photoTexture(): Texture = js.native
    def photoTexture(value: Texture): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PhotoDome extends js.Object {
    /**
      * Define the image as a Monoscopic panoramic 360 image.
      */
    val MODE_MONOSCOPIC: Double = js.native
    /**
      * Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    val MODE_SIDEBYSIDE: Double = js.native
    /**
      * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      */
    val MODE_TOPBOTTOM: Double = js.native
  }
  
}

