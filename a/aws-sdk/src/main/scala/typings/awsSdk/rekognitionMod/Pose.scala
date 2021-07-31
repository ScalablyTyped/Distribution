package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pose extends StObject {
  
  /**
    * Value representing the face rotation on the pitch axis.
    */
  var Pitch: js.UndefOr[Degree] = js.undefined
  
  /**
    * Value representing the face rotation on the roll axis.
    */
  var Roll: js.UndefOr[Degree] = js.undefined
  
  /**
    * Value representing the face rotation on the yaw axis.
    */
  var Yaw: js.UndefOr[Degree] = js.undefined
}
object Pose {
  
  @scala.inline
  def apply(): Pose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose]
  }
  
  @scala.inline
  implicit class PoseMutableBuilder[Self <: Pose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPitch(value: Degree): Self = StObject.set(x, "Pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "Pitch", js.undefined)
    
    @scala.inline
    def setRoll(value: Degree): Self = StObject.set(x, "Roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollUndefined: Self = StObject.set(x, "Roll", js.undefined)
    
    @scala.inline
    def setYaw(value: Degree): Self = StObject.set(x, "Yaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawUndefined: Self = StObject.set(x, "Yaw", js.undefined)
  }
}
