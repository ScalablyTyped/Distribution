package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "MultiMaterial")
@js.native
open class MultiMaterial protected ()
  extends typings.babylonjs.materialsIndexMod.MultiMaterial {
  /**
    * Instantiates a new Multi Material
    * A multi-material is used to apply different materials to different parts of the same object without the need of
    * separate meshes. This can be use to improve performances.
    * @see https://doc.babylonjs.com/how_to/multi_materials
    * @param name Define the name in the scene
    * @param scene Define the scene the material belongs to
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object MultiMaterial {
  
  @JSImport("babylonjs/index", "MultiMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MultiMaterial from parsed MultiMaterial data.
    * @param parsedMultiMaterial defines parsed MultiMaterial data.
    * @param scene defines the hosting scene
    * @returns a new MultiMaterial
    */
  inline def ParseMultiMaterial(parsedMultiMaterial: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.multiMaterialMod.MultiMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseMultiMaterial")(parsedMultiMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.multiMaterialMod.MultiMaterial]
}
