package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store a cell in an octree
  * @see http://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
  */
@JSGlobal("BABYLON.OctreeBlock")
@js.native
class OctreeBlock[T] protected () extends js.Object {
  /**
    * Creates a new block
    * @param minPoint defines the minimum vector (in world space) of the block's bounding box
    * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
    * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
    * @param depth defines the current depth of this block in the octree
    * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
    * @param creationFunc defines a callback to call when an element is added to the block
    */
  def this(minPoint: Vector3, maxPoint: Vector3, capacity: scala.Double, depth: scala.Double, maxDepth: scala.Double, creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], scala.Unit]) = this()
  var _boundingVectors: js.Any = js.native
  var _capacity: js.Any = js.native
  var _creationFunc: js.Any = js.native
  var _depth: js.Any = js.native
  var _maxDepth: js.Any = js.native
  var _maxPoint: js.Any = js.native
  var _minPoint: js.Any = js.native
  /**
    * Gets the list of block children
    */
  var blocks: js.Array[OctreeBlock[T]] = js.native
  /**
    * Gets the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
    */
  val capacity: scala.Double = js.native
  /**
    * Gets the content of the current block
    */
  var entries: js.Array[T] = js.native
  /**
    * Gets the maximum vector (in world space) of the block's bounding box
    */
  val maxPoint: Vector3 = js.native
  /**
    * Gets the minimum vector (in world space) of the block's bounding box
    */
  val minPoint: Vector3 = js.native
  /**
    * Add an array of elements to this block
    * @param entries defines the array of elements to add
    */
  def addEntries(entries: js.Array[T]): scala.Unit = js.native
  /**
    * Add a new element to this block
    * @param entry defines the element to add
    */
  def addEntry(entry: T): scala.Unit = js.native
  /**
    * Subdivide the content into child blocks (this block will then be empty)
    */
  def createInnerBlocks(): scala.Unit = js.native
  /**
    * Test if the current block intersect with the given bounding sphere and if yes, then add its content to the selection array
    * @param sphereCenter defines the bounding sphere center
    * @param sphereRadius defines the bounding sphere radius
    * @param selection defines the array to store current content if selection is positive
    * @param allowDuplicate defines if the selection array can contains duplicated entries
    */
  def intersects(sphereCenter: Vector3, sphereRadius: scala.Double, selection: SmartArrayNoDuplicate[T]): scala.Unit = js.native
  def intersects(
    sphereCenter: Vector3,
    sphereRadius: scala.Double,
    selection: SmartArrayNoDuplicate[T],
    allowDuplicate: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Test if the current block intersect with the given ray and if yes, then add its content to the selection array
    * @param ray defines the ray to test with
    * @param selection defines the array to store current content if selection is positive
    */
  def intersectsRay(ray: Ray, selection: SmartArrayNoDuplicate[T]): scala.Unit = js.native
  /**
    * Test if the current block intersects the furstum planes and if yes, then add its content to the selection array
    * @param frustumPlanes defines the frustum planes to test
    * @param selection defines the array to store current content if selection is positive
    * @param allowDuplicate defines if the selection array can contains duplicated entries
    */
  def select(frustumPlanes: js.Array[Plane], selection: SmartArrayNoDuplicate[T]): scala.Unit = js.native
  def select(frustumPlanes: js.Array[Plane], selection: SmartArrayNoDuplicate[T], allowDuplicate: scala.Boolean): scala.Unit = js.native
}

