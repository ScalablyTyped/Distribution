package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInstanceSummary extends StObject {
  
  /**
    * The ARN of the system instance.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The date when the system instance was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.native
  
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  
  /**
    * The version of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.native
  
  /**
    * The ID of the system instance.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The status of the system instance.
    */
  var status: js.UndefOr[SystemInstanceDeploymentStatus] = js.native
  
  /**
    * The target of the system instance.
    */
  var target: js.UndefOr[DeploymentTarget] = js.native
  
  /**
    *  The date and time when the system instance was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}
object SystemInstanceSummary {
  
  @scala.inline
  def apply(): SystemInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceSummary]
  }
  
  @scala.inline
  implicit class SystemInstanceSummaryMutableBuilder[Self <: SystemInstanceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setGreengrassGroupId(value: GreengrassGroupId): Self = StObject.set(x, "greengrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupIdUndefined: Self = StObject.set(x, "greengrassGroupId", js.undefined)
    
    @scala.inline
    def setGreengrassGroupName(value: GroupName): Self = StObject.set(x, "greengrassGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupNameUndefined: Self = StObject.set(x, "greengrassGroupName", js.undefined)
    
    @scala.inline
    def setGreengrassGroupVersionId(value: GreengrassGroupVersionId): Self = StObject.set(x, "greengrassGroupVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupVersionIdUndefined: Self = StObject.set(x, "greengrassGroupVersionId", js.undefined)
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setStatus(value: SystemInstanceDeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTarget(value: DeploymentTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
