package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceProperties extends StObject {
  
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeTypeName: js.UndefOr[Compute] = js.undefined
  
  /**
    * The protocol. For more information, see  Protocols for Amazon WorkSpaces.    Only available for WorkSpaces created with PCoIP bundles.   The Protocols property is case sensitive. Ensure you use PCOIP or WSP.   Unavailable for Windows 7 WorkSpaces and WorkSpaces using GPU-based bundles (Graphics, GraphicsPro, Graphics.g4dn, and GraphicsPro.g4dn).   
    */
  var Protocols: js.UndefOr[ProtocolList] = js.undefined
  
  /**
    * The size of the root volume. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var RootVolumeSizeGib: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.RootVolumeSizeGib] = js.undefined
  
  /**
    * The running mode. For more information, see Manage the WorkSpace Running Mode.  The MANUAL value is only supported by Amazon WorkSpaces Core. Contact your account team to be allow-listed to use this value. For more information, see Amazon WorkSpaces Core. 
    */
  var RunningMode: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.RunningMode] = js.undefined
  
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.RunningModeAutoStopTimeoutInMinutes] = js.undefined
  
  /**
    * The size of the user storage. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var UserVolumeSizeGib: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.UserVolumeSizeGib] = js.undefined
}
object WorkspaceProperties {
  
  inline def apply(): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProperties]
  }
  
  extension [Self <: WorkspaceProperties](x: Self) {
    
    inline def setComputeTypeName(value: Compute): Self = StObject.set(x, "ComputeTypeName", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeNameUndefined: Self = StObject.set(x, "ComputeTypeName", js.undefined)
    
    inline def setProtocols(value: ProtocolList): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setRootVolumeSizeGib(value: RootVolumeSizeGib): Self = StObject.set(x, "RootVolumeSizeGib", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeSizeGibUndefined: Self = StObject.set(x, "RootVolumeSizeGib", js.undefined)
    
    inline def setRunningMode(value: RunningMode): Self = StObject.set(x, "RunningMode", value.asInstanceOf[js.Any])
    
    inline def setRunningModeAutoStopTimeoutInMinutes(value: RunningModeAutoStopTimeoutInMinutes): Self = StObject.set(x, "RunningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setRunningModeAutoStopTimeoutInMinutesUndefined: Self = StObject.set(x, "RunningModeAutoStopTimeoutInMinutes", js.undefined)
    
    inline def setRunningModeUndefined: Self = StObject.set(x, "RunningMode", js.undefined)
    
    inline def setUserVolumeSizeGib(value: UserVolumeSizeGib): Self = StObject.set(x, "UserVolumeSizeGib", value.asInstanceOf[js.Any])
    
    inline def setUserVolumeSizeGibUndefined: Self = StObject.set(x, "UserVolumeSizeGib", js.undefined)
  }
}
