package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a subdivision inside a mesh
     */
@JSImport("babylonjs", "SubMesh")
@js.native
class SubMesh protected ()
  extends babylonjsLib.BABYLONNs.SubMesh {
  /**
           * Creates a new submesh
           * @param materialIndex defines the material index to use
           * @param verticesStart defines vertex index start
           * @param verticesCount defines vertices count
           * @param indexStart defines index start
           * @param indexCount defines indices count
           * @param mesh defines the parent mesh
           * @param renderingMesh defines an optional rendering mesh
           * @param createBoundingBox defines if bounding box should be created for this submesh
           */
  def this(/** the material index to use */
  materialIndex: scala.Double, /** vertex index start */
  verticesStart: scala.Double, /** vertices count */
  verticesCount: scala.Double, /** index start */
  indexStart: scala.Double, /** indices count */
  indexCount: scala.Double, mesh: babylonjsLib.BABYLONNs.AbstractMesh) = this()
  /**
           * Creates a new submesh
           * @param materialIndex defines the material index to use
           * @param verticesStart defines vertex index start
           * @param verticesCount defines vertices count
           * @param indexStart defines index start
           * @param indexCount defines indices count
           * @param mesh defines the parent mesh
           * @param renderingMesh defines an optional rendering mesh
           * @param createBoundingBox defines if bounding box should be created for this submesh
           */
  def this(/** the material index to use */
  materialIndex: scala.Double, /** vertex index start */
  verticesStart: scala.Double, /** vertices count */
  verticesCount: scala.Double, /** index start */
  indexStart: scala.Double, /** indices count */
  indexCount: scala.Double, mesh: babylonjsLib.BABYLONNs.AbstractMesh, renderingMesh: babylonjsLib.BABYLONNs.Mesh) = this()
  /**
           * Creates a new submesh
           * @param materialIndex defines the material index to use
           * @param verticesStart defines vertex index start
           * @param verticesCount defines vertices count
           * @param indexStart defines index start
           * @param indexCount defines indices count
           * @param mesh defines the parent mesh
           * @param renderingMesh defines an optional rendering mesh
           * @param createBoundingBox defines if bounding box should be created for this submesh
           */
  def this(/** the material index to use */
  materialIndex: scala.Double, /** vertex index start */
  verticesStart: scala.Double, /** vertices count */
  verticesCount: scala.Double, /** index start */
  indexStart: scala.Double, /** indices count */
  indexCount: scala.Double, mesh: babylonjsLib.BABYLONNs.AbstractMesh, renderingMesh: babylonjsLib.BABYLONNs.Mesh, createBoundingBox: scala.Boolean) = this()
}

/**
     * Defines a subdivision inside a mesh
     */
@JSImport("babylonjs", "SubMesh")
@js.native
object SubMesh extends js.Object {
  /**
           * Add a new submesh to a mesh
           * @param materialIndex defines the material index to use
           * @param verticesStart defines vertex index start
           * @param verticesCount defines vertices count
           * @param indexStart defines index start
           * @param indexCount defines indices count
           * @param mesh defines the parent mesh
           * @param renderingMesh defines an optional rendering mesh
           * @param createBoundingBox defines if bounding box should be created for this submesh
           * @returns the new submesh
           */
  def AddToMesh(
    materialIndex: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  /**
           * Add a new submesh to a mesh
           * @param materialIndex defines the material index to use
           * @param verticesStart defines vertex index start
           * @param verticesCount defines vertices count
           * @param indexStart defines index start
           * @param indexCount defines indices count
           * @param mesh defines the parent mesh
           * @param renderingMesh defines an optional rendering mesh
           * @param createBoundingBox defines if bounding box should be created for this submesh
           * @returns the new submesh
           */
  def AddToMesh(
    materialIndex: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    renderingMesh: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  /**
           * Add a new submesh to a mesh
           * @param materialIndex defines the material index to use
           * @param verticesStart defines vertex index start
           * @param verticesCount defines vertices count
           * @param indexStart defines index start
           * @param indexCount defines indices count
           * @param mesh defines the parent mesh
           * @param renderingMesh defines an optional rendering mesh
           * @param createBoundingBox defines if bounding box should be created for this submesh
           * @returns the new submesh
           */
  def AddToMesh(
    materialIndex: scala.Double,
    verticesStart: scala.Double,
    verticesCount: scala.Double,
    indexStart: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    renderingMesh: babylonjsLib.BABYLONNs.Mesh,
    createBoundingBox: scala.Boolean
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  /**
           * Creates a new submesh from indices data
           * @param materialIndex the index of the main mesh material
           * @param startIndex the index where to start the copy in the mesh indices array
           * @param indexCount the number of indices to copy then from the startIndex
           * @param mesh the main mesh to create the submesh from
           * @param renderingMesh the optional rendering mesh
           * @returns a new submesh
           */
  def CreateFromIndices(
    materialIndex: scala.Double,
    startIndex: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
  /**
           * Creates a new submesh from indices data
           * @param materialIndex the index of the main mesh material
           * @param startIndex the index where to start the copy in the mesh indices array
           * @param indexCount the number of indices to copy then from the startIndex
           * @param mesh the main mesh to create the submesh from
           * @param renderingMesh the optional rendering mesh
           * @returns a new submesh
           */
  def CreateFromIndices(
    materialIndex: scala.Double,
    startIndex: scala.Double,
    indexCount: scala.Double,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    renderingMesh: babylonjsLib.BABYLONNs.Mesh
  ): babylonjsLib.BABYLONNs.SubMesh = js.native
}

