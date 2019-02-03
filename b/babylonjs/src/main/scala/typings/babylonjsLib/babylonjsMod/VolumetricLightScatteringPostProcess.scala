package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Inspired by http://http.developer.nvidia.com/GPUGems3/gpugems3_ch13.html
  */
@JSImport("babylonjs", "VolumetricLightScatteringPostProcess")
@js.native
class VolumetricLightScatteringPostProcess protected ()
  extends babylonjsLib.BABYLONNs.VolumetricLightScatteringPostProcess {
  /**
    * @constructor
    * @param name The post-process name
    * @param ratio The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param camera The camera that the post-process will be attached to
    * @param mesh The mesh used to create the light scattering
    * @param samples The post-process quality, default 100
    * @param samplingModeThe post-process filtering mode
    * @param engine The babylon engine
    * @param reusable If the post-process is reusable
    * @param scene The constructor needs a scene reference to initialize internal components. If "camera" is null a "scene" must be provided
    */
  def this(name: java.lang.String, ratio: js.Any, camera: babylonjsLib.BABYLONNs.Camera, mesh: js.UndefOr[babylonjsLib.BABYLONNs.Mesh], samples: js.UndefOr[scala.Double], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], reusable: js.UndefOr[scala.Boolean], scene: js.UndefOr[babylonjsLib.BABYLONNs.Scene]) = this()
}

/* static members */
@JSImport("babylonjs", "VolumetricLightScatteringPostProcess")
@js.native
object VolumetricLightScatteringPostProcess extends js.Object {
  /**
    * Creates a default mesh for the Volumeric Light Scattering post-process
    * @param name The mesh name
    * @param scene The scene where to create the mesh
    * @return the default mesh
    */
  def CreateDefaultMesh(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Mesh = js.native
}

