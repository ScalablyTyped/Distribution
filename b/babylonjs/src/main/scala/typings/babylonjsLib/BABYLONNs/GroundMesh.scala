package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Mesh representing the gorund
     */
@JSGlobal("BABYLON.GroundMesh")
@js.native
class GroundMesh protected () extends Mesh {
  def this(name: java.lang.String, scene: Scene) = this()
  var _computeHeightQuads: js.Any = js.native
  var _getFacetAt: js.Any = js.native
  /** @hidden */
  var _height: scala.Double = js.native
  var _heightQuads: js.Any = js.native
  var _initHeightQuads: js.Any = js.native
  /** @hidden */
  var _maxX: scala.Double = js.native
  /** @hidden */
  var _maxZ: scala.Double = js.native
  /** @hidden */
  var _minX: scala.Double = js.native
  /** @hidden */
  var _minZ: scala.Double = js.native
  /** @hidden */
  var _subdivisionsX: scala.Double = js.native
  /** @hidden */
  var _subdivisionsY: scala.Double = js.native
  /** @hidden */
  var _width: scala.Double = js.native
  /** If octree should be generated */
  var generateOctree: scala.Boolean = js.native
  /**
           * The minimum of x and y subdivisions
           */
  val subdivisions: scala.Double = js.native
  /**
           * X subdivisions
           */
  val subdivisionsX: scala.Double = js.native
  /**
           * Y subdivisions
           */
  val subdivisionsY: scala.Double = js.native
  /**
           * Returns a height (y) value in the Worl system :
           * the ground altitude at the coordinates (x, z) expressed in the World system.
           * @param x x coordinate
           * @param z z coordinate
           * @returns the ground y position if (x, z) are outside the ground surface.
           */
  def getHeightAtCoordinates(x: scala.Double, z: scala.Double): scala.Double = js.native
  /**
           * Returns a normalized vector (Vector3) orthogonal to the ground
           * at the ground coordinates (x, z) expressed in the World system.
           * @param x x coordinate
           * @param z z coordinate
           * @returns Vector3(0.0, 1.0, 0.0) if (x, z) are outside the ground surface.
           */
  def getNormalAtCoordinates(x: scala.Double, z: scala.Double): Vector3 = js.native
  /**
           * Updates the Vector3 passed a reference with a normalized vector orthogonal to the ground
           * at the ground coordinates (x, z) expressed in the World system.
           * Doesn't uptade the reference Vector3 if (x, z) are outside the ground surface.
           * @param x x coordinate
           * @param z z coordinate
           * @param ref vector to store the result
           * @returns the GroundMesh.
           */
  def getNormalAtCoordinatesToRef(x: scala.Double, z: scala.Double, ref: Vector3): GroundMesh = js.native
  /**
           * This function will update an octree to help to select the right submeshes for rendering, picking and collision computations.
           * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
           * @param chunksCount the number of subdivisions for x and y
           * @param octreeBlocksSize (Default: 32)
           */
  def optimize(chunksCount: scala.Double): scala.Unit = js.native
  /**
           * This function will update an octree to help to select the right submeshes for rendering, picking and collision computations.
           * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
           * @param chunksCount the number of subdivisions for x and y
           * @param octreeBlocksSize (Default: 32)
           */
  def optimize(chunksCount: scala.Double, octreeBlocksSize: scala.Double): scala.Unit = js.native
  /**
          * Force the heights to be recomputed for getHeightAtCoordinates() or getNormalAtCoordinates()
          * if the ground has been updated.
          * This can be used in the render loop.
          * @returns the GroundMesh.
          */
  def updateCoordinateHeights(): GroundMesh = js.native
}

/**
     * Mesh representing the gorund
     */
@JSGlobal("BABYLON.GroundMesh")
@js.native
object GroundMesh extends js.Object {
  /**
           * Parses a serialized ground mesh
           * @param parsedMesh the serialized mesh
           * @param scene the scene to create the ground mesh in
           * @returns the created ground mesh
           */
  def Parse(parsedMesh: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.GroundMesh = js.native
}

