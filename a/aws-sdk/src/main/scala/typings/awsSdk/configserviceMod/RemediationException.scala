package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationException extends js.Object {
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * The time when the remediation exception will be deleted.
    */
  var ExpirationTime: js.UndefOr[Date] = js.native
  /**
    * An explanation of an remediation exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: StringWithCharLimit1024 = js.native
  /**
    * The type of a resource.
    */
  var ResourceType: StringWithCharLimit256 = js.native
}

object RemediationException {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    ResourceId: StringWithCharLimit1024,
    ResourceType: StringWithCharLimit256,
    ExpirationTime: Date = null,
    Message: StringWithCharLimit1024 = null
  ): RemediationException = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationException]
  }
}

