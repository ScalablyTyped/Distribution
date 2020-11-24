package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchDetails extends js.Object {
  
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
  implicit class LaunchDetailsOps[Self <: LaunchDetails] (val x: Self) extends AnyVal {
    
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
    def setLatestLaunchTime(value: Timestamp): Self = this.set("latestLaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestLaunchTime: Self = this.set("latestLaunchTime", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = this.set("stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = this.set("stackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackName: Self = this.set("stackName", js.undefined)
  }
}
