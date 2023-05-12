package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsShapeParameters extends StObject {
  
  /**
    * Shape center position
    */
  var center: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Dimesion extention for the box
    */
  var extents: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Use children hierarchy
    */
  var includeChildMeshes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mesh used for Mesh shape or convex hull. It can be different than the mesh the body is attached to.
    */
  var mesh: js.UndefOr[Mesh] = js.undefined
  
  /**
    * First point position that defines the cylinder or capsule
    */
  var pointA: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Second point position that defines the cylinder or capsule
    */
  var pointB: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Radius for cylinder, shape and capsule
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * Shape orientation
    */
  var rotation: js.UndefOr[Quaternion] = js.undefined
}
object PhysicsShapeParameters {
  
  inline def apply(): PhysicsShapeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsShapeParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsShapeParameters] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Vector3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setExtents(value: Vector3): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
    
    inline def setExtentsUndefined: Self = StObject.set(x, "extents", js.undefined)
    
    inline def setIncludeChildMeshes(value: Boolean): Self = StObject.set(x, "includeChildMeshes", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildMeshesUndefined: Self = StObject.set(x, "includeChildMeshes", js.undefined)
    
    inline def setMesh(value: Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    inline def setPointA(value: Vector3): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
    
    inline def setPointAUndefined: Self = StObject.set(x, "pointA", js.undefined)
    
    inline def setPointB(value: Vector3): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
    
    inline def setPointBUndefined: Self = StObject.set(x, "pointB", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRotation(value: Quaternion): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
