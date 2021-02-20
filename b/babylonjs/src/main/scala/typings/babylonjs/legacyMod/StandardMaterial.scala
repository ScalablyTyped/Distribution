package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "StandardMaterial")
@js.native
class StandardMaterial protected ()
  extends typings.babylonjs.indexMod.StandardMaterial {
  /**
    * Instantiates a new standard material.
    * This is the default material used in Babylon. It is the best trade off between quality
    * and performances.
    * @see https://doc.babylonjs.com/babylon101/materials
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belong to
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object StandardMaterial {
  
  /**
    * Creates a standard material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new standard material
    */
  @JSImport("babylonjs/Legacy/legacy", "StandardMaterial.Parse")
  @js.native
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.standardMaterialMod.StandardMaterial = js.native
}
