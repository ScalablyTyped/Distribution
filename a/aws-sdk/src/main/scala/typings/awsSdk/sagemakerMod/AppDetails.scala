package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppDetails extends StObject {
  
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
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.native
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.native
}
object AppDetails {
  
  @scala.inline
  def apply(): AppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetails]
  }
  
  @scala.inline
  implicit class AppDetailsMutableBuilder[Self <: AppDetails] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: AppStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
