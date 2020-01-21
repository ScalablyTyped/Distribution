package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationType extends js.Object {
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var ApplicationId: HexStringType = js.native
  /**
    * The external ID.
    */
  var ExternalId: StringType = js.native
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var RoleArn: ArnType = js.native
  /**
    * If UserDataShared is true, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var UserDataShared: js.UndefOr[BooleanType] = js.native
}

object AnalyticsConfigurationType {
  @scala.inline
  def apply(
    ApplicationId: HexStringType,
    ExternalId: StringType,
    RoleArn: ArnType,
    UserDataShared: js.UndefOr[Boolean] = js.undefined
  ): AnalyticsConfigurationType = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExternalId = ExternalId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(UserDataShared)) __obj.updateDynamic("UserDataShared")(UserDataShared.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationType]
  }
}

