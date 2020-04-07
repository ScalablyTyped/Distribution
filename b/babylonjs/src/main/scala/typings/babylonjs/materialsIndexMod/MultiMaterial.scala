package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "MultiMaterial")
@js.native
class MultiMaterial protected ()
  extends typings.babylonjs.multiMaterialMod.MultiMaterial {
  /**
    * Instantiates a new Multi Material
    * A multi-material is used to apply different materials to different parts of the same object without the need of
    * separate meshes. This can be use to improve performances.
    * @see http://doc.babylonjs.com/how_to/multi_materials
    * @param name Define the name in the scene
    * @param scene Define the scene the material belongs to
    */
  def this(name: String, scene: Scene) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "MultiMaterial")
@js.native
object MultiMaterial extends js.Object {
  /**
    * Creates a MultiMaterial from parsed MultiMaterial data.
    * @param parsedMultiMaterial defines parsed MultiMaterial data.
    * @param scene defines the hosting scene
    * @returns a new MultiMaterial
    */
  def ParseMultiMaterial(parsedMultiMaterial: js.Any, scene: Scene): typings.babylonjs.multiMaterialMod.MultiMaterial = js.native
}

