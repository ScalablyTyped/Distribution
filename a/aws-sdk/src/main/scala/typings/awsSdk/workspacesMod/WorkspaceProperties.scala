package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceProperties extends StObject {
  
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeTypeName: js.UndefOr[Compute] = js.undefined
  
  /**
    * The size of the root volume. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var RootVolumeSizeGib: js.UndefOr[typings.awsSdk.workspacesMod.RootVolumeSizeGib] = js.undefined
  
  /**
    * The running mode. For more information, see Manage the WorkSpace Running Mode.
    */
  var RunningMode: js.UndefOr[typings.awsSdk.workspacesMod.RunningMode] = js.undefined
  
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[typings.awsSdk.workspacesMod.RunningModeAutoStopTimeoutInMinutes] = js.undefined
  
  /**
    * The size of the user storage. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var UserVolumeSizeGib: js.UndefOr[typings.awsSdk.workspacesMod.UserVolumeSizeGib] = js.undefined
}
object WorkspaceProperties {
  
  @scala.inline
  def apply(): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProperties]
  }
  
  @scala.inline
  implicit class WorkspacePropertiesMutableBuilder[Self <: WorkspaceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeTypeName(value: Compute): Self = StObject.set(x, "ComputeTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTypeNameUndefined: Self = StObject.set(x, "ComputeTypeName", js.undefined)
    
    @scala.inline
    def setRootVolumeSizeGib(value: RootVolumeSizeGib): Self = StObject.set(x, "RootVolumeSizeGib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootVolumeSizeGibUndefined: Self = StObject.set(x, "RootVolumeSizeGib", js.undefined)
    
    @scala.inline
    def setRunningMode(value: RunningMode): Self = StObject.set(x, "RunningMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningModeAutoStopTimeoutInMinutes(value: RunningModeAutoStopTimeoutInMinutes): Self = StObject.set(x, "RunningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningModeAutoStopTimeoutInMinutesUndefined: Self = StObject.set(x, "RunningModeAutoStopTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setRunningModeUndefined: Self = StObject.set(x, "RunningMode", js.undefined)
    
    @scala.inline
    def setUserVolumeSizeGib(value: UserVolumeSizeGib): Self = StObject.set(x, "UserVolumeSizeGib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVolumeSizeGibUndefined: Self = StObject.set(x, "UserVolumeSizeGib", js.undefined)
  }
}
