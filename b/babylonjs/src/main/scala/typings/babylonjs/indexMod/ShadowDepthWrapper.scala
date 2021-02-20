package typings.babylonjs.indexMod

import typings.babylonjs.shadowDepthWrapperMod.IIOptionShadowDepthMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ShadowDepthWrapper")
@js.native
class ShadowDepthWrapper protected ()
  extends typings.babylonjs.materialsIndexMod.ShadowDepthWrapper {
  /**
    * Instantiate a new shadow depth wrapper.
    * It works by injecting some specific code in the vertex/fragment shaders of the base material and is used by a shadow generator to
    * generate the shadow depth map. For more information, please refer to the documentation:
    * https://doc.babylonjs.com/babylon101/shadows
    * @param baseMaterial Material to wrap
    * @param scene Define the scene the material belongs to
    * @param options Options used to create the wrapper
    */
  def this(baseMaterial: typings.babylonjs.materialMod.Material, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    baseMaterial: typings.babylonjs.materialMod.Material,
    scene: typings.babylonjs.sceneMod.Scene,
    options: IIOptionShadowDepthMaterial
  ) = this()
}
