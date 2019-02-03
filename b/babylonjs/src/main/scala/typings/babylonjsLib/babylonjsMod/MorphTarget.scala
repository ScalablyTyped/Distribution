package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a target to use with MorphTargetManager
  * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
  */
@JSImport("babylonjs", "MorphTarget")
@js.native
class MorphTarget protected ()
  extends babylonjsLib.BABYLONNs.MorphTarget {
  /**
    * Creates a new MorphTarget
    * @param name defines the name of the target
    * @param influence defines the influence to use
    */
  def this(/** defines the name of the target */
  name: java.lang.String) = this()
  def this(/** defines the name of the target */
  name: java.lang.String, influence: scala.Double) = this()
  def this(/** defines the name of the target */
  name: java.lang.String, influence: scala.Double, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
}

/* static members */
@JSImport("babylonjs", "MorphTarget")
@js.native
object MorphTarget extends js.Object {
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  def FromMesh(mesh: babylonjsLib.BABYLONNs.AbstractMesh): babylonjsLib.BABYLONNs.MorphTarget = js.native
  def FromMesh(mesh: babylonjsLib.BABYLONNs.AbstractMesh, name: java.lang.String): babylonjsLib.BABYLONNs.MorphTarget = js.native
  def FromMesh(mesh: babylonjsLib.BABYLONNs.AbstractMesh, name: java.lang.String, influence: scala.Double): babylonjsLib.BABYLONNs.MorphTarget = js.native
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @returns a new MorphTarget
    */
  def Parse(serializationObject: js.Any): babylonjsLib.BABYLONNs.MorphTarget = js.native
}

