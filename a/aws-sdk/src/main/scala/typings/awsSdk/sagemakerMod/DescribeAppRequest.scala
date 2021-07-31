package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppRequest extends StObject {
  
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
    * The user profile name.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName
}
object DescribeAppRequest {
  
  @scala.inline
  def apply(AppName: AppName, AppType: AppType, DomainId: DomainId, UserProfileName: UserProfileName): DescribeAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppRequest]
  }
  
  @scala.inline
  implicit class DescribeAppRequestMutableBuilder[Self <: DescribeAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
