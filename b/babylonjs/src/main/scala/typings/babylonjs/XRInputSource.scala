package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSource extends StObject {
  
  val gamepad: js.UndefOr[Gamepad] = js.native
  
  val gripSpace: js.UndefOr[XRSpace] = js.native
  
  val hand: js.UndefOr[XRHand] = js.native
  
  val handedness: XRHandedness = js.native
  
  val profiles: js.Array[String] = js.native
  
  val targetRayMode: XRTargetRayMode = js.native
  
  val targetRaySpace: XRSpace = js.native
}
object XRInputSource {
  
  @scala.inline
  def apply(
    handedness: XRHandedness,
    profiles: js.Array[String],
    targetRayMode: XRTargetRayMode,
    targetRaySpace: XRSpace
  ): XRInputSource = {
    val __obj = js.Dynamic.literal(handedness = handedness.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], targetRayMode = targetRayMode.asInstanceOf[js.Any], targetRaySpace = targetRaySpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSource]
  }
  
  @scala.inline
  implicit class XRInputSourceMutableBuilder[Self <: XRInputSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGamepad(value: Gamepad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepadUndefined: Self = StObject.set(x, "gamepad", js.undefined)
    
    @scala.inline
    def setGripSpace(value: XRSpace): Self = StObject.set(x, "gripSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGripSpaceUndefined: Self = StObject.set(x, "gripSpace", js.undefined)
    
    @scala.inline
    def setHand(value: XRHand): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandUndefined: Self = StObject.set(x, "hand", js.undefined)
    
    @scala.inline
    def setHandedness(value: XRHandedness): Self = StObject.set(x, "handedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfiles(value: js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value :_*))
    
    @scala.inline
    def setTargetRayMode(value: XRTargetRayMode): Self = StObject.set(x, "targetRayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRaySpace(value: XRSpace): Self = StObject.set(x, "targetRaySpace", value.asInstanceOf[js.Any])
  }
}
