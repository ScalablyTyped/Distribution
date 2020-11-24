package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationType extends js.Object {
  
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
  implicit class AnalyticsConfigurationTypeOps[Self <: AnalyticsConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationArn(value: ArnType): Self = this.set("ApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationArn: Self = this.set("ApplicationArn", js.undefined)
    
    @scala.inline
    def setApplicationId(value: HexStringType): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setExternalId(value: StringType): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ArnType): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setUserDataShared(value: BooleanType): Self = this.set("UserDataShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataShared: Self = this.set("UserDataShared", js.undefined)
  }
}
