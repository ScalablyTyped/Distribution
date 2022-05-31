package typings.babylonjs

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRFrameData extends StObject {
  
  val leftProjectionMatrix: Float32Array
  
  val leftViewMatrix: Float32Array
  
  val pose: VRPose
  
  val rightProjectionMatrix: Float32Array
  
  val rightViewMatrix: Float32Array
  
  val timestamp: Double
}
object VRFrameData {
  
  inline def apply(
    leftProjectionMatrix: Float32Array,
    leftViewMatrix: Float32Array,
    pose: VRPose,
    rightProjectionMatrix: Float32Array,
    rightViewMatrix: Float32Array,
    timestamp: Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix.asInstanceOf[js.Any], leftViewMatrix = leftViewMatrix.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any], rightProjectionMatrix = rightProjectionMatrix.asInstanceOf[js.Any], rightViewMatrix = rightViewMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFrameData]
  }
  
  extension [Self <: VRFrameData](x: Self) {
    
    inline def setLeftProjectionMatrix(value: Float32Array): Self = StObject.set(x, "leftProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setLeftViewMatrix(value: Float32Array): Self = StObject.set(x, "leftViewMatrix", value.asInstanceOf[js.Any])
    
    inline def setPose(value: VRPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    inline def setRightProjectionMatrix(value: Float32Array): Self = StObject.set(x, "rightProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setRightViewMatrix(value: Float32Array): Self = StObject.set(x, "rightViewMatrix", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
