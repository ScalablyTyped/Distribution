package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PBRMetallicRoughnessMaterial")
@js.native
class PBRMetallicRoughnessMaterial protected ()
  extends typings.babylonjs.legacyMod.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "PBRMetallicRoughnessMaterial")
@js.native
object PBRMetallicRoughnessMaterial extends js.Object {
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.pbrMetallicRoughnessMaterialMod.PBRMetallicRoughnessMaterial = js.native
}

