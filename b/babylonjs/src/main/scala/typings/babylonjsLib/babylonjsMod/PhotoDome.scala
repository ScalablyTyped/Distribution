package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Display a 360 degree photo on an approximately spherical surface, useful for VR applications or skyboxes.
     * As a subclass of TransformNode, this allow parenting to the camera with different locations in the scene.
     * This class achieves its effect with a Texture and a correctly configured BackgroundMaterial on an inverted sphere.
     * Potential additions to this helper include zoom and and non-infinite distance rendering effects.
     */
@JSImport("babylonjs", "PhotoDome")
@js.native
class PhotoDome protected ()
  extends babylonjsLib.BABYLONNs.PhotoDome {
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOfPhoto defines the url of the photo to display
           * @param options defines an object containing optional or exposed sub element properties
           * @param onError defines a callback called when an error occured while loading the texture
           */
  def this(name: java.lang.String, urlOfPhoto: java.lang.String, options: babylonjsLib.Anon_Resolution, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOfPhoto defines the url of the photo to display
           * @param options defines an object containing optional or exposed sub element properties
           * @param onError defines a callback called when an error occured while loading the texture
           */
  def this(name: java.lang.String, urlOfPhoto: java.lang.String, options: babylonjsLib.Anon_Resolution, scene: babylonjsLib.BABYLONNs.Scene, onError: babylonjsLib.BABYLONNs.Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]) = this()
}

