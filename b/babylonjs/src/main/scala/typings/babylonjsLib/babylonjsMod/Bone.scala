package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store bone information
  * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
  */
@JSImport("babylonjs", "Bone")
@js.native
class Bone protected ()
  extends babylonjsLib.BABYLONNs.Bone {
  /**
    * Create a new bone
    * @param name defines the bone name
    * @param skeleton defines the parent skeleton
    * @param parentBone defines the parent (can be null if the bone is the root)
    * @param localMatrix defines the local matrix
    * @param restPose defines the rest pose matrix
    * @param baseMatrix defines the base matrix
    * @param index defines index of the bone in the hiearchy
    */
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: babylonjsLib.BABYLONNs.Skeleton) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: babylonjsLib.BABYLONNs.Skeleton, parentBone: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Bone]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: babylonjsLib.BABYLONNs.Skeleton, parentBone: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Bone], localMatrix: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: babylonjsLib.BABYLONNs.Skeleton, parentBone: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Bone], localMatrix: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix], restPose: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: babylonjsLib.BABYLONNs.Skeleton, parentBone: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Bone], localMatrix: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix], restPose: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix], baseMatrix: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: babylonjsLib.BABYLONNs.Skeleton, parentBone: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Bone], localMatrix: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix], restPose: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix], baseMatrix: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Matrix], index: babylonjsLib.BABYLONNs.Nullable[scala.Double]) = this()
}

/**
  * Class used to store bone information
  * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
  */
@JSImport("babylonjs", "Bone")
@js.native
object Bone extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

