package typings.babylonjs

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object goldbergMeshMod {
  
  @JSImport("babylonjs/Meshes/goldbergMesh", "GoldbergMesh")
  @js.native
  open class GoldbergMesh protected () extends Mesh {
    /**
      * @constructor
      * @param name The value used by scene.getMeshByName() to do a lookup.
      * @param scene The scene to add this mesh to.
      * @param parent The parent of this mesh, if it has one
      * @param source An optional Mesh from which geometry is shared, cloned.
      * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
      *                  When false, achieved by calling a clone(), also passing False.
      *                  This will make creation of children, recursive.
      * @param clonePhysicsImpostor When cloning, include cloning mesh physics impostor, default True.
      */
    def this(name: String) = this()
    def this(name: String, scene: Nullable[Scene]) = this()
    def this(name: String, scene: Unit, parent: Nullable[Node]) = this()
    def this(name: String, scene: Nullable[Scene], parent: Nullable[Node]) = this()
    def this(name: String, scene: Unit, parent: Unit, source: Nullable[Mesh]) = this()
    def this(name: String, scene: Unit, parent: Nullable[Node], source: Nullable[Mesh]) = this()
    def this(name: String, scene: Nullable[Scene], parent: Unit, source: Nullable[Mesh]) = this()
    def this(name: String, scene: Nullable[Scene], parent: Nullable[Node], source: Nullable[Mesh]) = this()
    def this(name: String, scene: Unit, parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
    def this(name: String, scene: Unit, parent: Unit, source: Nullable[Mesh], doNotCloneChildren: Boolean) = this()
    def this(name: String, scene: Unit, parent: Nullable[Node], source: Unit, doNotCloneChildren: Boolean) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean
    ) = this()
    def this(name: String, scene: Nullable[Scene], parent: Unit, source: Unit, doNotCloneChildren: Boolean) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Unit,
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Unit,
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Unit,
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Boolean,
      clonePhysicsImpostor: Boolean
    ) = this()
    def this(
      name: String,
      scene: Nullable[Scene],
      parent: Nullable[Node],
      source: Nullable[Mesh],
      doNotCloneChildren: Unit,
      clonePhysicsImpostor: Boolean
    ) = this()
    
    /* private */ var _changeGoldbergFaceColors: Any = js.native
    
    /* private */ var _changeGoldbergFaceUVs: Any = js.native
    
    /**
      * Defines the specific Goldberg data used in this mesh construction.
      */
    var goldbergData: GoldbergData = js.native
    
    /**
      * Places a mesh on a particular face of the goldberg polygon
      * @param mesh Defines the mesh to position
      * @param face Defines the face to position onto
      * @param position Defines the position relative to the face we are positioning the mesh onto
      */
    def placeOnGoldbergFaceAt(mesh: Mesh, face: Double, position: Vector3): Unit = js.native
    
    /**
      * Gets the related Goldberg face from pole infos
      * @param poleOrShared Defines the pole index or the shared face index if the fromPole parameter is passed in
      * @param fromPole Defines an optional pole index to find the related info from
      * @returns the goldberg face number
      */
    def relatedGoldbergFace(poleOrShared: Double): Double = js.native
    def relatedGoldbergFace(poleOrShared: Double, fromPole: Double): Double = js.native
    
    /**
      * Set new goldberg face colors
      * @param colorRange the new color to apply to the mesh
      */
    def setGoldbergFaceColors(colorRange: js.Array[js.Array[Double | Color4]]): Unit = js.native
    
    /**
      * set new goldberg face UVs
      * @param uvRange the new UVs to apply to the mesh
      */
    def setGoldbergFaceUVs(uvRange: js.Array[js.Array[Double | Vector2]]): Unit = js.native
    
    /**
      * Updates new goldberg face colors
      * @param colorRange the new color to apply to the mesh
      */
    def updateGoldbergFaceColors(colorRange: js.Array[js.Array[Double | Color4]]): Unit = js.native
    
    /**
      * Updates new goldberg face UVs
      * @param uvRange the new UVs to apply to the mesh
      */
    def updateGoldbergFaceUVs(uvRange: js.Array[js.Array[Double | Vector2]]): Unit = js.native
  }
  /* static members */
  object GoldbergMesh {
    
    @JSImport("babylonjs/Meshes/goldbergMesh", "GoldbergMesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a serialized goldberg mesh
      * @param parsedMesh the serialized mesh
      * @param scene the scene to create the goldberg mesh in
      * @returns the created goldberg mesh
      */
    inline def Parse(parsedMesh: Any, scene: Scene): GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GoldbergMesh]
  }
  
  trait GoldbergData extends StObject {
    
    /**
      * Defines the number of adjacent faces per goldberg faces
      */
    var adjacentFaces: js.Array[js.Array[Double]]
    
    /**
      * The list of Goldberg faces centers
      */
    var faceCenters: js.Array[Vector3]
    
    /**
      * The list of Goldberg faces colors
      */
    var faceColors: js.Array[Color4]
    
    /**
      * The list of Goldberg faces Y axis
      */
    var faceXaxis: js.Array[Vector3]
    
    /**
      * The list of Goldberg faces X axis
      */
    var faceYaxis: js.Array[Vector3]
    
    /**
      * The list of Goldberg faces Z axis
      */
    var faceZaxis: js.Array[Vector3]
    
    /**
      * Defines the total number of goldberg faces
      */
    var nbFaces: Double
    
    /**
      * Defines the number of goldberg faces at the pole
      */
    var nbFacesAtPole: Double
    
    /**
      * Defines the number of shared faces
      */
    var nbSharedFaces: Double
    
    /**
      * Defines the number of unshared faces
      */
    var nbUnsharedFaces: Double
  }
  object GoldbergData {
    
    inline def apply(
      adjacentFaces: js.Array[js.Array[Double]],
      faceCenters: js.Array[Vector3],
      faceColors: js.Array[Color4],
      faceXaxis: js.Array[Vector3],
      faceYaxis: js.Array[Vector3],
      faceZaxis: js.Array[Vector3],
      nbFaces: Double,
      nbFacesAtPole: Double,
      nbSharedFaces: Double,
      nbUnsharedFaces: Double
    ): GoldbergData = {
      val __obj = js.Dynamic.literal(adjacentFaces = adjacentFaces.asInstanceOf[js.Any], faceCenters = faceCenters.asInstanceOf[js.Any], faceColors = faceColors.asInstanceOf[js.Any], faceXaxis = faceXaxis.asInstanceOf[js.Any], faceYaxis = faceYaxis.asInstanceOf[js.Any], faceZaxis = faceZaxis.asInstanceOf[js.Any], nbFaces = nbFaces.asInstanceOf[js.Any], nbFacesAtPole = nbFacesAtPole.asInstanceOf[js.Any], nbSharedFaces = nbSharedFaces.asInstanceOf[js.Any], nbUnsharedFaces = nbUnsharedFaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoldbergData]
    }
    
    extension [Self <: GoldbergData](x: Self) {
      
      inline def setAdjacentFaces(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "adjacentFaces", value.asInstanceOf[js.Any])
      
      inline def setAdjacentFacesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "adjacentFaces", js.Array(value*))
      
      inline def setFaceCenters(value: js.Array[Vector3]): Self = StObject.set(x, "faceCenters", value.asInstanceOf[js.Any])
      
      inline def setFaceCentersVarargs(value: Vector3*): Self = StObject.set(x, "faceCenters", js.Array(value*))
      
      inline def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
      
      inline def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value*))
      
      inline def setFaceXaxis(value: js.Array[Vector3]): Self = StObject.set(x, "faceXaxis", value.asInstanceOf[js.Any])
      
      inline def setFaceXaxisVarargs(value: Vector3*): Self = StObject.set(x, "faceXaxis", js.Array(value*))
      
      inline def setFaceYaxis(value: js.Array[Vector3]): Self = StObject.set(x, "faceYaxis", value.asInstanceOf[js.Any])
      
      inline def setFaceYaxisVarargs(value: Vector3*): Self = StObject.set(x, "faceYaxis", js.Array(value*))
      
      inline def setFaceZaxis(value: js.Array[Vector3]): Self = StObject.set(x, "faceZaxis", value.asInstanceOf[js.Any])
      
      inline def setFaceZaxisVarargs(value: Vector3*): Self = StObject.set(x, "faceZaxis", js.Array(value*))
      
      inline def setNbFaces(value: Double): Self = StObject.set(x, "nbFaces", value.asInstanceOf[js.Any])
      
      inline def setNbFacesAtPole(value: Double): Self = StObject.set(x, "nbFacesAtPole", value.asInstanceOf[js.Any])
      
      inline def setNbSharedFaces(value: Double): Self = StObject.set(x, "nbSharedFaces", value.asInstanceOf[js.Any])
      
      inline def setNbUnsharedFaces(value: Double): Self = StObject.set(x, "nbUnsharedFaces", value.asInstanceOf[js.Any])
    }
  }
}
