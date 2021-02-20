package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchDetails extends StObject {
  
  /**
    * The latest time that this application was launched successfully.
    */
  var latestLaunchTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the latest stack launched for this application.
    */
  var stackId: js.UndefOr[StackId] = js.native
  
  /**
    * The name of the latest stack launched for this application.
    */
  var stackName: js.UndefOr[StackName] = js.native
}
object LaunchDetails {
  
  @scala.inline
  def apply(): LaunchDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchDetails]
  }
  
  @scala.inline
  implicit class LaunchDetailsMutableBuilder[Self <: LaunchDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestLaunchTime(value: Timestamp): Self = StObject.set(x, "latestLaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestLaunchTimeUndefined: Self = StObject.set(x, "latestLaunchTime", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "stackName", js.undefined)
  }
}
