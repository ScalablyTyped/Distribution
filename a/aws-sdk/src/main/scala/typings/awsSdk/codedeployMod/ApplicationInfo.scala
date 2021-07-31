package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInfo extends StObject {
  
  /**
    * The application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.undefined
  
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The destination platform type for deployment of the application (Lambda or Server).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    * The time at which the application was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name for a connection to a GitHub account.
    */
  var gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.undefined
  
  /**
    * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
    */
  var linkedToGitHub: js.UndefOr[Boolean] = js.undefined
}
object ApplicationInfo {
  
  @scala.inline
  def apply(): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInfo]
  }
  
  @scala.inline
  implicit class ApplicationInfoMutableBuilder[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setGitHubAccountName(value: GitHubAccountTokenName): Self = StObject.set(x, "gitHubAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitHubAccountNameUndefined: Self = StObject.set(x, "gitHubAccountName", js.undefined)
    
    @scala.inline
    def setLinkedToGitHub(value: Boolean): Self = StObject.set(x, "linkedToGitHub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedToGitHubUndefined: Self = StObject.set(x, "linkedToGitHub", js.undefined)
  }
}
