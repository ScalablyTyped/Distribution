package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkforceRequest extends StObject {
  
  /**
    * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single  Amazon Cognito user pool. Do not use OidcConfig if you specify values for CognitoConfig.
    */
  var CognitoConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CognitoConfig] = js.undefined
  
  /**
    * Use this parameter to configure a private workforce using your own OIDC Identity Provider. Do not use CognitoConfig if you specify values for OidcConfig.
    */
  var OidcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.OidcConfig] = js.undefined
  
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.undefined
  
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the private workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName
}
object CreateWorkforceRequest {
  
  @scala.inline
  def apply(WorkforceName: WorkforceName): CreateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkforceRequest]
  }
  
  @scala.inline
  implicit class CreateWorkforceRequestMutableBuilder[Self <: CreateWorkforceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCognitoConfig(value: CognitoConfig): Self = StObject.set(x, "CognitoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoConfigUndefined: Self = StObject.set(x, "CognitoConfig", js.undefined)
    
    @scala.inline
    def setOidcConfig(value: OidcConfig): Self = StObject.set(x, "OidcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcConfigUndefined: Self = StObject.set(x, "OidcConfig", js.undefined)
    
    @scala.inline
    def setSourceIpConfig(value: SourceIpConfig): Self = StObject.set(x, "SourceIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpConfigUndefined: Self = StObject.set(x, "SourceIpConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
  }
}
