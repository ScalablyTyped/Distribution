package typings.babylonjs

import typings.babylonjs.mathsMathDotplaneMod.Plane
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cullingBoundingSphereMod {
  
  @JSImport("babylonjs/Culling/boundingSphere", "BoundingSphere")
  @js.native
  open class BoundingSphere protected () extends StObject {
    /**
      * Creates a new bounding sphere
      * @param min defines the minimum vector (in local space)
      * @param max defines the maximum vector (in local space)
      * @param worldMatrix defines the new world matrix
      */
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]) = this()
    def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]) = this()
    
    /**
      * @internal
      */
    def _update(worldMatrix: DeepImmutable[Matrix]): Unit = js.native
    
    /* private */ var _worldMatrix: Any = js.native
    
    /**
      * Gets the center of the bounding sphere in local space
      */
    val center: Vector3 = js.native
    
    /**
      * Gets the center of the bounding sphere in world space
      */
    val centerWorld: Vector3 = js.native
    
    /**
      * Gets the world matrix of the bounding box
      * @returns a matrix
      */
    def getWorldMatrix(): DeepImmutable[Matrix] = js.native
    
    /**
      * Tests if a point is inside the bounding sphere
      * @param point defines the point to test
      * @returns true if the point is inside the bounding sphere
      */
    def intersectsPoint(point: DeepImmutable[Vector3]): Boolean = js.native
    
    /**
      * Tests if the bounding sphere center is in between the frustum planes.
      * Used for optimistic fast inclusion.
      * @param frustumPlanes defines the frustum planes to test
      * @returns true if the sphere center is in between the frustum planes
      */
    def isCenterInFrustum(frustumPlanes: js.Array[DeepImmutable[Plane]]): Boolean = js.native
    
    /**
      * Tests if the bounding sphere is intersecting the frustum planes
      * @param frustumPlanes defines the frustum planes to test
      * @returns true if there is an intersection
      */
    def isInFrustum(frustumPlanes: js.Array[DeepImmutable[Plane]]): Boolean = js.native
    
    /**
      * Gets the maximum vector in local space
      */
    val maximum: Vector3 = js.native
    
    /**
      * Gets the minimum vector in local space
      */
    val minimum: Vector3 = js.native
    
    /**
      * Radius of the bounding sphere in local space
      */
    var radius: Double = js.native
    
    /**
      * Radius of the bounding sphere in world space
      */
    var radiusWorld: Double = js.native
    
    /**
      * Recreates the entire bounding sphere from scratch as if we call the constructor in place
      * @param min defines the new minimum vector (in local space)
      * @param max defines the new maximum vector (in local space)
      * @param worldMatrix defines the new world matrix
      */
    def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Unit = js.native
    def reConstruct(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]): Unit = js.native
    
    /**
      * Scale the current bounding sphere by applying a scale factor
      * @param factor defines the scale factor to apply
      * @returns the current bounding box
      */
    def scale(factor: Double): BoundingSphere = js.native
  }
  /* static members */
  object BoundingSphere {
    
    @JSImport("babylonjs/Culling/boundingSphere", "BoundingSphere")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a sphere from a center and a radius
      * @param center The center
      * @param radius radius
      * @param matrix Optional worldMatrix
      * @returns The sphere
      */
    inline def CreateFromCenterAndRadius(center: DeepImmutable[Vector3], radius: Double): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
    inline def CreateFromCenterAndRadius(center: DeepImmutable[Vector3], radius: Double, matrix: DeepImmutable[Matrix]): BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[BoundingSphere]
    
    /**
      * Checks if two sphere intersect
      * @param sphere0 sphere 0
      * @param sphere1 sphere 1
      * @returns true if the spheres intersect
      */
    inline def Intersects(sphere0: DeepImmutable[BoundingSphere], sphere1: DeepImmutable[BoundingSphere]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(sphere0.asInstanceOf[js.Any], sphere1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("babylonjs/Culling/boundingSphere", "BoundingSphere._TmpVector3")
    @js.native
    val _TmpVector3: Any = js.native
  }
}
