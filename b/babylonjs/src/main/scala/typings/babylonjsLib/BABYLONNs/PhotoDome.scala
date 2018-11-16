package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Display a 360 degree photo on an approximately spherical surface, useful for VR applications or skyboxes.
     * As a subclass of TransformNode, this allow parenting to the camera with different locations in the scene.
     * This class achieves its effect with a Texture and a correctly configured BackgroundMaterial on an inverted sphere.
     * Potential additions to this helper include zoom and and non-infinite distance rendering effects.
     */
@JSGlobal("BABYLON.PhotoDome")
@js.native
class PhotoDome protected () extends TransformNode {
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOfPhoto defines the url of the photo to display
           * @param options defines an object containing optional or exposed sub element properties
           * @param onError defines a callback called when an error occured while loading the texture
           */
  def this(name: java.lang.String, urlOfPhoto: java.lang.String, options: babylonjsLib.Anon_Resolution, scene: Scene) = this()
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOfPhoto defines the url of the photo to display
           * @param options defines an object containing optional or exposed sub element properties
           * @param onError defines a callback called when an error occured while loading the texture
           */
  def this(name: java.lang.String, urlOfPhoto: java.lang.String, options: babylonjsLib.Anon_Resolution, scene: Scene, onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]) = this()
  /**
           * The skybox material
           */
  var _material: BackgroundMaterial = js.native
  /**
           * The surface used for the skybox
           */
  var _mesh: Mesh = js.native
  /**
           * The texture being displayed on the sphere
           */
  var _photoTexture: Texture = js.native
  var _useDirectMapping: js.Any = js.native
  /**
           * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
           * Also see the options.resolution property.
           */
  var fovMultiplier: scala.Double = js.native
  /**
           * Observable raised when an error occured while loading the 360 image
           */
  var onLoadErrorObservable: Observable[java.lang.String] = js.native
  /**
           * Gets or sets the texture being displayed on the sphere
           */
  var photoTexture: Texture = js.native
}

