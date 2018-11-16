package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Display a 360 degree video on an approximately spherical surface, useful for VR applications or skyboxes.
     * As a subclass of TransformNode, this allow parenting to the camera or multiple videos with different locations in the scene.
     * This class achieves its effect with a VideoTexture and a correctly configured BackgroundMaterial on an inverted sphere.
     * Potential additions to this helper include zoom and and non-infinite distance rendering effects.
     */
@JSGlobal("BABYLON.VideoDome")
@js.native
class VideoDome protected () extends TransformNode {
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, VideoTexture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOrVideo defines the url(s) or the video element to use
           * @param options An object containing optional or exposed sub element properties
           */
  def this(name: java.lang.String, urlsOrVideo: babylonjsLib.HTMLVideoElement, options: babylonjsLib.Anon_Loop, scene: Scene) = this()
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, VideoTexture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOrVideo defines the url(s) or the video element to use
           * @param options An object containing optional or exposed sub element properties
           */
  def this(name: java.lang.String, urlsOrVideo: java.lang.String, options: babylonjsLib.Anon_Loop, scene: Scene) = this()
  /**
           * Create an instance of this class and pass through the parameters to the relevant classes, VideoTexture, StandardMaterial, and Mesh.
           * @param name Element's name, child elements will append suffixes for their own names.
           * @param urlsOrVideo defines the url(s) or the video element to use
           * @param options An object containing optional or exposed sub element properties
           */
  def this(name: java.lang.String, urlsOrVideo: js.Array[java.lang.String], options: babylonjsLib.Anon_Loop, scene: Scene) = this()
  /**
           * The skybox material
           */
  var _material: BackgroundMaterial = js.native
  /**
           * The surface used for the skybox
           */
  var _mesh: Mesh = js.native
  var _useDirectMapping: js.Any = js.native
  /**
           * The video texture being displayed on the sphere
           */
  var _videoTexture: VideoTexture = js.native
  /**
           * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
           * Also see the options.resolution property.
           */
  var fovMultiplier: scala.Double = js.native
  /**
           * Gets the video texture being displayed on the sphere
           */
  val videoTexture: VideoTexture = js.native
}

