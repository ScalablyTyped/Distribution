package typings.babylonjs.webXRAbstractMotionControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMotionControllerProfile extends js.Object {
  
  /**
    * fallback profiles for this profileId
    */
  var fallbackProfileIds: js.Array[String] = js.native
  
  /**
    * The layout map, with handedness as key
    */
  var layouts: IMotionControllerLayoutMap = js.native
  
  /**
    * The id of this profile
    * correlates to the profile(s) in the xrInput.profiles array
    */
  var profileId: String = js.native
}
object IMotionControllerProfile {
  
  @scala.inline
  def apply(fallbackProfileIds: js.Array[String], layouts: IMotionControllerLayoutMap, profileId: String): IMotionControllerProfile = {
    val __obj = js.Dynamic.literal(fallbackProfileIds = fallbackProfileIds.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerProfile]
  }
  
  @scala.inline
  implicit class IMotionControllerProfileOps[Self <: IMotionControllerProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallbackProfileIdsVarargs(value: String*): Self = this.set("fallbackProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setFallbackProfileIds(value: js.Array[String]): Self = this.set("fallbackProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayouts(value: IMotionControllerLayoutMap): Self = this.set("layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
  }
}
