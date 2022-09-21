package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchProfileResponse extends StObject {
  
  /**
    * The launch profile.
    */
  var launchProfile: js.UndefOr[LaunchProfile] = js.undefined
}
object DeleteLaunchProfileResponse {
  
  inline def apply(): DeleteLaunchProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchProfileResponse]
  }
  
  extension [Self <: DeleteLaunchProfileResponse](x: Self) {
    
    inline def setLaunchProfile(value: LaunchProfile): Self = StObject.set(x, "launchProfile", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileUndefined: Self = StObject.set(x, "launchProfile", js.undefined)
  }
}
