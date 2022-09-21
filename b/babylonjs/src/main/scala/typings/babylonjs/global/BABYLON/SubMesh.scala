package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubMesh")
@js.native
open class SubMesh protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SubMesh {
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
    * @param addToMesh defines a boolean indicating that the submesh must be added to the mesh.subMeshes array (true by default)
    */
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean,
    addToMesh: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Unit,
    addToMesh: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Boolean,
    addToMesh: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Unit,
    addToMesh: Boolean
  ) = this()
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this checks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
  
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[typings.babylonjs.BABYLON.Plane]): Boolean = js.native
}
/* static members */
object SubMesh {
  
  @JSGlobal("BABYLON.SubMesh")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Boolean
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  
  /**
    * Creates a new submesh from indices data
    * @param materialIndex the index of the main mesh material
    * @param startIndex the index where to start the copy in the mesh indices array
    * @param indexCount the number of indices to copy then from the startIndex
    * @param mesh the main mesh to create the submesh from
    * @param renderingMesh the optional rendering mesh
    * @param createBoundingBox defines if bounding box should be created for this submesh
    * @returns a new submesh
    */
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    renderingMesh: typings.babylonjs.BABYLON.Mesh,
    createBoundingBox: Boolean
  ): typings.babylonjs.BABYLON.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubMesh]
}
