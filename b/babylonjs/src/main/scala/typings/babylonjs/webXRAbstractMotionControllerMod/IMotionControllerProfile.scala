package typings.babylonjs.webXRAbstractMotionControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMotionControllerProfile extends js.Object {
  /**
    * fallback profiles for this profileId
    */
  var fallbackProfileIds: js.Array[String]
  /**
    * The layout map, with handness as key
    */
  var layouts: IMotionControllerLayoutMap
  /**
    * The id of this profile
    * correlates to the profile(s) in the xrInput.profiles array
    */
  var profileId: String
}

object IMotionControllerProfile {
  @scala.inline
  def apply(fallbackProfileIds: js.Array[String], layouts: IMotionControllerLayoutMap, profileId: String): IMotionControllerProfile = {
    val __obj = js.Dynamic.literal(fallbackProfileIds = fallbackProfileIds.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerProfile]
  }
}

