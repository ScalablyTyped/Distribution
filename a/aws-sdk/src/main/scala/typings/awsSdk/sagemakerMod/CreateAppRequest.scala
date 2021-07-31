package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppRequest extends StObject {
  
  /**
    * The name of the app.
    */
  var AppName: typings.awsSdk.sagemakerMod.AppName
  
  /**
    * The type of app.
    */
  var AppType: typings.awsSdk.sagemakerMod.AppType
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId
  
  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var ResourceSpec: js.UndefOr[typings.awsSdk.sagemakerMod.ResourceSpec] = js.undefined
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName
}
object CreateAppRequest {
  
  @scala.inline
  def apply(AppName: AppName, AppType: AppType, DomainId: DomainId, UserProfileName: UserProfileName): CreateAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  @scala.inline
  implicit class CreateAppRequestMutableBuilder[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpec(value: ResourceSpec): Self = StObject.set(x, "ResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpecUndefined: Self = StObject.set(x, "ResourceSpec", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
