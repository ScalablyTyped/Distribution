package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PBR material of BJS following the metal roughness convention.
  *
  * This fits to the PBR convention in the GLTF definition:
  * https://github.com/KhronosGroup/glTF/tree/2.0/specification/2.0
  */
@JSImport("babylonjs", "PBRMetallicRoughnessMaterial")
@js.native
class PBRMetallicRoughnessMaterial protected ()
  extends babylonjsLib.BABYLONNs.PBRMetallicRoughnessMaterial {
  /**
    * Instantiates a new PBRMetalRoughnessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "PBRMetallicRoughnessMaterial")
@js.native
object PBRMetallicRoughnessMaterial extends js.Object {
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.PBRMetallicRoughnessMaterial = js.native
}

