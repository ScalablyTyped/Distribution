package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for building Constructive Solid Geometry
  */
@JSGlobal("BABYLON.CSG")
@js.native
class CSG () extends js.Object {
  /**
    * The world matrix
    */
  var matrix: Matrix = js.native
  var polygons: js.Any = js.native
  /**
    * Stores the position
    */
  var position: Vector3 = js.native
  /**
    * Stores the rotation
    */
  var rotation: Vector3 = js.native
  /**
    * Stores the rotation quaternion
    */
  var rotationQuaternion: Nullable[Quaternion] = js.native
  /**
    * Stores the scaling vector
    */
  var scaling: Vector3 = js.native
  /**
    * Build Raw mesh from CSG
    * Coordinates here are in world space
    * @param name The name of the mesh geometry
    * @param scene The BABYLON.Scene
    * @param keepSubMeshes Specifies if the submeshes should be kept
    * @returns A new BABYLON.Mesh
    */
  def buildMeshGeometry(name: java.lang.String, scene: Scene, keepSubMeshes: scala.Boolean): Mesh = js.native
  /**
    * This is used to keep meshes transformations so they can be restored
    * when we build back a Babylon Mesh
    * NB : All CSG operations are performed in world coordinates
    * @param csg The BABYLON.CSG to copy the transform attributes from
    * @returns This BABYLON.CSG
    */
  def copyTransformAttributes(csg: CSG): CSG = js.native
  /**
    * Intersect this CSG with another CSG
    * @param csg The CSG to intersect against this CSG
    * @returns A new BABYLON.CSG
    */
  def intersect(csg: CSG): CSG = js.native
  /**
    * Intersects this CSG with another CSG in place
    * @param csg The CSG to intersect against this CSG
    */
  def intersectInPlace(csg: CSG): scala.Unit = js.native
  /**
    * Return a new BABYLON.CSG solid with solid and empty space switched. This solid is
    * not modified.
    * @returns A new BABYLON.CSG solid with solid and empty space switched
    */
  def inverse(): CSG = js.native
  /**
    * Inverses the BABYLON.CSG in place
    */
  def inverseInPlace(): scala.Unit = js.native
  /**
    * Subtracts this CSG with another CSG
    * @param csg The CSG to subtract against this CSG
    * @returns A new BABYLON.CSG
    */
  def subtract(csg: CSG): CSG = js.native
  /**
    * Subtracts this CSG with another CSG in place
    * @param csg The CSG to subtact against this CSG
    */
  def subtractInPlace(csg: CSG): scala.Unit = js.native
  /**
    * Build Mesh from CSG taking material and transforms into account
    * @param name The name of the BABYLON.Mesh
    * @param material The material of the BABYLON.Mesh
    * @param scene The BABYLON.Scene
    * @param keepSubMeshes Specifies if submeshes should be kept
    * @returns The new BABYLON.Mesh
    */
  def toMesh(name: java.lang.String, material: Nullable[Material], scene: Scene, keepSubMeshes: scala.Boolean): Mesh = js.native
  /**
    * Unions this CSG with another CSG
    * @param csg The CSG to union against this CSG
    * @returns The unioned CSG
    */
  def union(csg: CSG): CSG = js.native
  /**
    * Unions this CSG with another CSG in place
    * @param csg The CSG to union against this CSG
    */
  def unionInPlace(csg: CSG): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.CSG")
@js.native
object CSG extends js.Object {
  /**
    * Construct a BABYLON.CSG solid from a list of `BABYLON.CSG.Polygon` instances.
    * @param polygons Polygons used to construct a BABYLON.CSG solid
    */
  var FromPolygons: js.Any = js.native
  /**
    * Convert the BABYLON.Mesh to BABYLON.CSG
    * @param mesh The BABYLON.Mesh to convert to BABYLON.CSG
    * @returns A new BABYLON.CSG from the BABYLON.Mesh
    */
  def FromMesh(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.CSG = js.native
}

