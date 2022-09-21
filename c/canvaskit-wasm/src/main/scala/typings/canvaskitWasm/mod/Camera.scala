package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  /** field of view in radians */
  var angle: AngleInRadians
  
  /** center of attention - the 3d point the camera is looking at. */
  var coa: Vector3
  
  /** a 3d point locating the camera. */
  var eye: Vector3
  
  /** far clipping plane distance */
  var far: Double
  
  /** near clipping plane distance */
  var near: Double
  
  /**
    * A unit vector pointing the cameras up direction. Note that using only eye and coa
    * would leave the roll of the camera unspecified.
    */
  var up: Vector3
}
object Camera {
  
  inline def apply(angle: AngleInRadians, coa: Vector3, eye: Vector3, far: Double, near: Double, up: Vector3): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], coa = coa.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setAngle(value: AngleInRadians): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCoa(value: Vector3): Self = StObject.set(x, "coa", value.asInstanceOf[js.Any])
    
    inline def setCoaVarargs(value: Double*): Self = StObject.set(x, "coa", js.Array(value*))
    
    inline def setEye(value: Vector3): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setEyeVarargs(value: Double*): Self = StObject.set(x, "eye", js.Array(value*))
    
    inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpVarargs(value: Double*): Self = StObject.set(x, "up", js.Array(value*))
  }
}
