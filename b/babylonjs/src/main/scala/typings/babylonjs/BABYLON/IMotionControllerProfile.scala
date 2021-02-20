package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMotionControllerProfile extends StObject {
  
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
  implicit class IMotionControllerProfileMutableBuilder[Self <: IMotionControllerProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackProfileIds(value: js.Array[String]): Self = StObject.set(x, "fallbackProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackProfileIdsVarargs(value: String*): Self = StObject.set(x, "fallbackProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setLayouts(value: IMotionControllerLayoutMap): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
  }
}
