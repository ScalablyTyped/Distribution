package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used to deform meshes using morphing between different targets
  * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
  */
@JSImport("babylonjs", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends babylonjsLib.BABYLONNs.MorphTargetManager {
  def this(scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
}

/* static members */
@JSImport("babylonjs", "MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  def Parse(serializationObject: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.MorphTargetManager = js.native
}

