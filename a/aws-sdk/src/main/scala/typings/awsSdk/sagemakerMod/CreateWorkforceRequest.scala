package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkforceRequest extends js.Object {
  
  /**
    * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single  Amazon Cognito user pool. Do not use OidcConfig if you specify values for CognitoConfig.
    */
  var CognitoConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CognitoConfig] = js.native
  
  /**
    * Use this parameter to configure a private workforce using your own OIDC Identity Provider. Do not use CognitoConfig if you specify values for OidcConfig.
    */
  var OidcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.OidcConfig] = js.native
  
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the private workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}
object CreateWorkforceRequest {
  
  @scala.inline
  def apply(WorkforceName: WorkforceName): CreateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkforceRequest]
  }
  
  @scala.inline
  implicit class CreateWorkforceRequestOps[Self <: CreateWorkforceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = this.set("WorkforceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoConfig(value: CognitoConfig): Self = this.set("CognitoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoConfig: Self = this.set("CognitoConfig", js.undefined)
    
    @scala.inline
    def setOidcConfig(value: OidcConfig): Self = this.set("OidcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOidcConfig: Self = this.set("OidcConfig", js.undefined)
    
    @scala.inline
    def setSourceIpConfig(value: SourceIpConfig): Self = this.set("SourceIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIpConfig: Self = this.set("SourceIpConfig", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
