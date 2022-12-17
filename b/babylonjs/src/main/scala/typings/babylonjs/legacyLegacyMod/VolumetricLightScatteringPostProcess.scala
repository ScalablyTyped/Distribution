package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VolumetricLightScatteringPostProcess")
@js.native
open class VolumetricLightScatteringPostProcess protected ()
  extends typings.babylonjs.indexMod.VolumetricLightScatteringPostProcess {
  /**
    * @constructor
    * @param name The post-process name
    * @param ratio The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param camera The camera that the post-process will be attached to
    * @param mesh The mesh used to create the light scattering
    * @param samples The post-process quality, default 100
    * @param samplingMode The post-process filtering mode
    * @param engine The babylon engine
    * @param reusable If the post-process is reusable
    * @param scene The constructor needs a scene reference to initialize internal components. If "camera" is null a "scene" must be provided
    */
  def this(
    name: String,
    ratio: Any,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    mesh: js.UndefOr[typings.babylonjs.meshesMeshMod.Mesh],
    samples: js.UndefOr[Double],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    scene: js.UndefOr[typings.babylonjs.sceneMod.Scene]
  ) = this()
}
/* static members */
object VolumetricLightScatteringPostProcess {
  
  @JSImport("babylonjs/Legacy/legacy", "VolumetricLightScatteringPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a default mesh for the Volumeric Light Scattering post-process
    * @param name The mesh name
    * @param scene The scene where to create the mesh
    * @returns the default mesh
    */
  inline def CreateDefaultMesh(name: String, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefaultMesh")(name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
}
