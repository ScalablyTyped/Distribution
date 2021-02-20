package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the app.
    */
  var AppArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppArn] = js.native
  
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typings.awsSdk.sagemakerMod.AppName] = js.native
  
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typings.awsSdk.sagemakerMod.AppType] = js.native
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The timestamp of the last health check.
    */
  var LastHealthCheckTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The timestamp of the last user's activity.
    */
  var LastUserActivityTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var ResourceSpec: js.UndefOr[typings.awsSdk.sagemakerMod.ResourceSpec] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.native
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.native
}
object DescribeAppResponse {
  
  @scala.inline
  def apply(): DescribeAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppResponse]
  }
  
  @scala.inline
  implicit class DescribeAppResponseMutableBuilder[Self <: DescribeAppResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppArn(value: AppArn): Self = StObject.set(x, "AppArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArnUndefined: Self = StObject.set(x, "AppArn", js.undefined)
    
    @scala.inline
    def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNameUndefined: Self = StObject.set(x, "AppName", js.undefined)
    
    @scala.inline
    def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTypeUndefined: Self = StObject.set(x, "AppType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastHealthCheckTimestamp(value: Timestamp): Self = StObject.set(x, "LastHealthCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastHealthCheckTimestampUndefined: Self = StObject.set(x, "LastHealthCheckTimestamp", js.undefined)
    
    @scala.inline
    def setLastUserActivityTimestamp(value: Timestamp): Self = StObject.set(x, "LastUserActivityTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUserActivityTimestampUndefined: Self = StObject.set(x, "LastUserActivityTimestamp", js.undefined)
    
    @scala.inline
    def setResourceSpec(value: ResourceSpec): Self = StObject.set(x, "ResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpecUndefined: Self = StObject.set(x, "ResourceSpec", js.undefined)
    
    @scala.inline
    def setStatus(value: AppStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
