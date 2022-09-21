package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileInitializationResponse extends StObject {
  
  /**
    * The launch profile initialization.
    */
  var launchProfileInitialization: js.UndefOr[LaunchProfileInitialization] = js.undefined
}
object GetLaunchProfileInitializationResponse {
  
  inline def apply(): GetLaunchProfileInitializationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchProfileInitializationResponse]
  }
  
  extension [Self <: GetLaunchProfileInitializationResponse](x: Self) {
    
    inline def setLaunchProfileInitialization(value: LaunchProfileInitialization): Self = StObject.set(x, "launchProfileInitialization", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileInitializationUndefined: Self = StObject.set(x, "launchProfileInitialization", js.undefined)
  }
}
