package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSoftwareUpdateJobRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  var S3UrlSignerRole: typings.awsSdk.greengrassMod.S3UrlSignerRole
  
  var SoftwareToUpdate: typings.awsSdk.greengrassMod.SoftwareToUpdate
  
  var UpdateAgentLogLevel: js.UndefOr[typings.awsSdk.greengrassMod.UpdateAgentLogLevel] = js.undefined
  
  var UpdateTargets: typings.awsSdk.greengrassMod.UpdateTargets
  
  var UpdateTargetsArchitecture: typings.awsSdk.greengrassMod.UpdateTargetsArchitecture
  
  var UpdateTargetsOperatingSystem: typings.awsSdk.greengrassMod.UpdateTargetsOperatingSystem
}
object CreateSoftwareUpdateJobRequest {
  
  @scala.inline
  def apply(
    S3UrlSignerRole: S3UrlSignerRole,
    SoftwareToUpdate: SoftwareToUpdate,
    UpdateTargets: UpdateTargets,
    UpdateTargetsArchitecture: UpdateTargetsArchitecture,
    UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
  ): CreateSoftwareUpdateJobRequest = {
    val __obj = js.Dynamic.literal(S3UrlSignerRole = S3UrlSignerRole.asInstanceOf[js.Any], SoftwareToUpdate = SoftwareToUpdate.asInstanceOf[js.Any], UpdateTargets = UpdateTargets.asInstanceOf[js.Any], UpdateTargetsArchitecture = UpdateTargetsArchitecture.asInstanceOf[js.Any], UpdateTargetsOperatingSystem = UpdateTargetsOperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
  }
  
  @scala.inline
  implicit class CreateSoftwareUpdateJobRequestMutableBuilder[Self <: CreateSoftwareUpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setS3UrlSignerRole(value: S3UrlSignerRole): Self = StObject.set(x, "S3UrlSignerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareToUpdate(value: SoftwareToUpdate): Self = StObject.set(x, "SoftwareToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAgentLogLevel(value: UpdateAgentLogLevel): Self = StObject.set(x, "UpdateAgentLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAgentLogLevelUndefined: Self = StObject.set(x, "UpdateAgentLogLevel", js.undefined)
    
    @scala.inline
    def setUpdateTargets(value: UpdateTargets): Self = StObject.set(x, "UpdateTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsArchitecture(value: UpdateTargetsArchitecture): Self = StObject.set(x, "UpdateTargetsArchitecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsOperatingSystem(value: UpdateTargetsOperatingSystem): Self = StObject.set(x, "UpdateTargetsOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsVarargs(value: string*): Self = StObject.set(x, "UpdateTargets", js.Array(value :_*))
  }
}
