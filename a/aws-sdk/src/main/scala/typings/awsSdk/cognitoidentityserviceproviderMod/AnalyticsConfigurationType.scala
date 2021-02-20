package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Pinpoint project. You can use the Amazon Pinpoint project for Pinpoint integration with the chosen User Pool Client. Amazon Cognito publishes events to the pinpoint project declared by the app ARN.
    */
  var ApplicationArn: js.UndefOr[ArnType] = js.native
  
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var ApplicationId: js.UndefOr[HexStringType] = js.native
  
  /**
    * The external ID.
    */
  var ExternalId: js.UndefOr[StringType] = js.native
  
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var RoleArn: js.UndefOr[ArnType] = js.native
  
  /**
    * If UserDataShared is true, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var UserDataShared: js.UndefOr[BooleanType] = js.native
}
object AnalyticsConfigurationType {
  
  @scala.inline
  def apply(): AnalyticsConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsConfigurationType]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationTypeMutableBuilder[Self <: AnalyticsConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationArn(value: ArnType): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    @scala.inline
    def setApplicationId(value: HexStringType): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setExternalId(value: StringType): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ArnType): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setUserDataShared(value: BooleanType): Self = StObject.set(x, "UserDataShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataSharedUndefined: Self = StObject.set(x, "UserDataShared", js.undefined)
  }
}
