package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Physically based material base class of BJS.
  *
  * This offers the main features of a standard PBR material.
  * For more information, please refer to the documentation :
  * http://doc.babylonjs.com/extensions/Physically_Based_Rendering
  */
@JSImport("babylonjs", "PBRBaseMaterial")
@js.native
abstract class PBRBaseMaterial protected ()
  extends babylonjsLib.BABYLONNs.PBRBaseMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
  * The Physically based material base class of BJS.
  *
  * This offers the main features of a standard PBR material.
  * For more information, please refer to the documentation :
  * http://doc.babylonjs.com/extensions/Physically_Based_Rendering
  */
@JSImport("babylonjs", "PBRBaseMaterial")
@js.native
object PBRBaseMaterial extends js.Object {
  /**
    * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  val LIGHTFALLOFF_GLTF: scala.Double = js.native
  /**
    * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
    */
  val LIGHTFALLOFF_PHYSICAL: scala.Double = js.native
  /**
    * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  val LIGHTFALLOFF_STANDARD: scala.Double = js.native
  /**
    * Stores the reflectivity values based on metallic roughness workflow.
    */
  var _scaledReflectivity: js.Any = js.native
}

