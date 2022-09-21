package typings.babylonjs

import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csgMod {
  
  @JSImport("babylonjs/Meshes/csg", "CSG")
  @js.native
  open class CSG () extends StObject {
    
    /* private */ var _polygons: Any = js.native
    
    /**
      * Build Raw mesh from CSG
      * Coordinates here are in world space
      * @param name The name of the mesh geometry
      * @param scene The Scene
      * @param keepSubMeshes Specifies if the submeshes should be kept
      * @returns A new Mesh
      */
    def buildMeshGeometry(name: String): Mesh = js.native
    def buildMeshGeometry(name: String, scene: Unit, keepSubMeshes: Boolean): Mesh = js.native
    def buildMeshGeometry(name: String, scene: Scene): Mesh = js.native
    def buildMeshGeometry(name: String, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
    
    /**
      * This is used to keep meshes transformations so they can be restored
      * when we build back a Babylon Mesh
      * NB : All CSG operations are performed in world coordinates
      * @param csg The CSG to copy the transform attributes from
      * @returns This CSG
      */
    def copyTransformAttributes(csg: CSG): CSG = js.native
    
    /**
      * Intersect this CSG with another CSG
      * @param csg The CSG to intersect against this CSG
      * @returns A new CSG
      */
    def intersect(csg: CSG): CSG = js.native
    
    /**
      * Intersects this CSG with another CSG in place
      * @param csg The CSG to intersect against this CSG
      */
    def intersectInPlace(csg: CSG): Unit = js.native
    
    /**
      * Return a new CSG solid with solid and empty space switched. This solid is
      * not modified.
      * @returns A new CSG solid with solid and empty space switched
      */
    def inverse(): CSG = js.native
    
    /**
      * Inverses the CSG in place
      */
    def inverseInPlace(): Unit = js.native
    
    /**
      * The world matrix
      */
    var matrix: Matrix = js.native
    
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
      * Subtracts this CSG with another CSG
      * @param csg The CSG to subtract against this CSG
      * @returns A new CSG
      */
    def subtract(csg: CSG): CSG = js.native
    
    /**
      * Subtracts this CSG with another CSG in place
      * @param csg The CSG to subtract against this CSG
      */
    def subtractInPlace(csg: CSG): Unit = js.native
    
    /**
      * Build Mesh from CSG taking material and transforms into account
      * @param name The name of the Mesh
      * @param material The material of the Mesh
      * @param scene The Scene
      * @param keepSubMeshes Specifies if submeshes should be kept
      * @returns The new Mesh
      */
    def toMesh(name: String): Mesh = js.native
    def toMesh(name: String, material: Unit, scene: Unit, keepSubMeshes: Boolean): Mesh = js.native
    def toMesh(name: String, material: Unit, scene: Scene): Mesh = js.native
    def toMesh(name: String, material: Unit, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
    def toMesh(name: String, material: Nullable[Material]): Mesh = js.native
    def toMesh(name: String, material: Nullable[Material], scene: Unit, keepSubMeshes: Boolean): Mesh = js.native
    def toMesh(name: String, material: Nullable[Material], scene: Scene): Mesh = js.native
    def toMesh(name: String, material: Nullable[Material], scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
    
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
    def unionInPlace(csg: CSG): Unit = js.native
  }
  /* static members */
  object CSG {
    
    @JSImport("babylonjs/Meshes/csg", "CSG")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the Mesh to CSG
      * @param mesh The Mesh to convert to CSG
      * @param absolute If true, the final (local) matrix transformation is set to the identity and not to that of `mesh`. It can help when dealing with right-handed meshes (default: false)
      * @returns A new CSG from the Mesh
      */
    inline def FromMesh(mesh: Mesh): CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[CSG]
    inline def FromMesh(mesh: Mesh, absolute: Boolean): CSG = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[CSG]
    
    /**
      * Construct a CSG solid from a list of `CSG.Polygon` instances.
      * @param polygons Polygons used to construct a CSG solid
      */
    @JSImport("babylonjs/Meshes/csg", "CSG._FromPolygons")
    @js.native
    def _FromPolygons: Any = js.native
    inline def _FromPolygons_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromPolygons")(x.asInstanceOf[js.Any])
  }
}
