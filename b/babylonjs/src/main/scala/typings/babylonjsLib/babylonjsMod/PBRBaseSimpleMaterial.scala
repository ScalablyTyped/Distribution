package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Physically based simple base material of BJS.
  *
  * This enables better naming and convention enforcements on top of the pbrMaterial.
  * It is used as the base class for both the specGloss and metalRough conventions.
  */
@JSImport("babylonjs", "PBRBaseSimpleMaterial")
@js.native
abstract class PBRBaseSimpleMaterial protected ()
  extends babylonjsLib.BABYLONNs.PBRBaseSimpleMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

