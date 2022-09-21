package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colliderMod {
  
  @JSImport("babylonjs/Collisions/collider", "Collider")
  @js.native
  open class Collider () extends StObject {
    
    /* private */ var _basePoint: Any = js.native
    
    /** @hidden */
    var _basePointWorld: Vector3 = js.native
    
    /* private */ var _baseToVertex: Any = js.native
    
    /**
      * @param sphereCenter
      * @param sphereRadius
      * @param vecMin
      * @param vecMax
      * @hidden
      */
    def _canDoCollision(sphereCenter: Vector3, sphereRadius: Double, vecMin: Vector3, vecMax: Vector3): Boolean = js.native
    
    /**
      * @param point
      * @param pa
      * @param pb
      * @param pc
      * @param n
      * @hidden
      */
    def _checkPointInTriangle(point: Vector3, pa: Vector3, pb: Vector3, pc: Vector3, n: Vector3): Boolean = js.native
    
    /**
      * @param trianglePlaneArray
      * @param pts
      * @param indices
      * @param indexStart
      * @param indexEnd
      * @param decal
      * @param hasMaterial
      * @param hostMesh
      * @param invertTriangles
      * @param triangleStrip
      * @hidden
      */
    def _collide(
      trianglePlaneArray: js.Array[Plane],
      pts: js.Array[Vector3],
      indices: IndicesArray,
      indexStart: Double,
      indexEnd: Double,
      decal: Double,
      hasMaterial: Boolean,
      hostMesh: AbstractMesh
    ): Unit = js.native
    def _collide(
      trianglePlaneArray: js.Array[Plane],
      pts: js.Array[Vector3],
      indices: IndicesArray,
      indexStart: Double,
      indexEnd: Double,
      decal: Double,
      hasMaterial: Boolean,
      hostMesh: AbstractMesh,
      invertTriangles: Boolean
    ): Unit = js.native
    def _collide(
      trianglePlaneArray: js.Array[Plane],
      pts: js.Array[Vector3],
      indices: IndicesArray,
      indexStart: Double,
      indexEnd: Double,
      decal: Double,
      hasMaterial: Boolean,
      hostMesh: AbstractMesh,
      invertTriangles: Boolean,
      triangleStrip: Boolean
    ): Unit = js.native
    def _collide(
      trianglePlaneArray: js.Array[Plane],
      pts: js.Array[Vector3],
      indices: IndicesArray,
      indexStart: Double,
      indexEnd: Double,
      decal: Double,
      hasMaterial: Boolean,
      hostMesh: AbstractMesh,
      invertTriangles: Unit,
      triangleStrip: Boolean
    ): Unit = js.native
    
    /* private */ var _collisionMask: Any = js.native
    
    /* private */ var _collisionPoint: Any = js.native
    
    /* private */ var _destinationPoint: Any = js.native
    
    /* private */ var _displacementVector: Any = js.native
    
    /* private */ var _edge: Any = js.native
    
    /* private */ var _epsilon: Any = js.native
    
    /**
      * @param pos
      * @param vel
      * @hidden
      */
    def _getResponse(pos: Vector3, vel: Vector3): Unit = js.native
    
    /** @hidden */
    var _initialPosition: Vector3 = js.native
    
    /** @hidden */
    var _initialVelocity: Vector3 = js.native
    
    /**
      * @param source
      * @param dir
      * @param e
      * @hidden
      */
    def _initialize(source: Vector3, dir: Vector3, e: Double): Unit = js.native
    
    /* private */ var _nearestDistance: Any = js.native
    
    /* private */ var _nearestDistanceSquared: Any = js.native
    
    /* private */ var _normalizedVelocity: Any = js.native
    
    /* private */ var _planeIntersectionPoint: Any = js.native
    
    /** @hidden */
    var _radius: Vector3 = js.native
    
    /** @hidden */
    var _retry: Double = js.native
    
    /* private */ var _slidePlaneNormal: Any = js.native
    
    /* private */ var _tempVector: Any = js.native
    
    /* private */ var _tempVector2: Any = js.native
    
    /* private */ var _tempVector3: Any = js.native
    
    /* private */ var _tempVector4: Any = js.native
    
    /**
      * @param faceIndex
      * @param trianglePlaneArray
      * @param p1
      * @param p2
      * @param p3
      * @param hasMaterial
      * @param hostMesh
      * @hidden
      */
    def _testTriangle(
      faceIndex: Double,
      trianglePlaneArray: js.Array[Plane],
      p1: Vector3,
      p2: Vector3,
      p3: Vector3,
      hasMaterial: Boolean,
      hostMesh: AbstractMesh
    ): Unit = js.native
    
    /* private */ var _velocity: Any = js.native
    
    /* private */ var _velocitySquaredLength: Any = js.native
    
    /* private */ var _velocityWorld: Any = js.native
    
    /** @hidden */
    var _velocityWorldLength: Double = js.native
    
    /**
      * Define last collided mesh
      */
    var collidedMesh: Nullable[AbstractMesh] = js.native
    
    /** Define if a collision was found */
    var collisionFound: Boolean = js.native
    
    def collisionMask: Double = js.native
    def collisionMask_=(mask: Double): Unit = js.native
    
    /**
      * Define last intersection point in local space
      */
    var intersectionPoint: Vector3 = js.native
    
    /**
      * Gets the plane normal used to compute the sliding response (in local space)
      */
    def slidePlaneNormal: Vector3 = js.native
  }
  /* static members */
  object Collider {
    
    @JSImport("babylonjs/Collisions/collider", "Collider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * If true, it check for double sided faces and only returns 1 collision instead of 2
      */
    @JSImport("babylonjs/Collisions/collider", "Collider.DoubleSidedCheck")
    @js.native
    def DoubleSidedCheck: Boolean = js.native
    inline def DoubleSidedCheck_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleSidedCheck")(x.asInstanceOf[js.Any])
  }
}
