package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactMethod extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the contact method.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination of the contact method, such as an email address or a mobile phone number.
    */
  var contactEndpoint: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the contact method was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the contact method.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The protocol of the contact method, such as email or SMS (text messaging).
    */
  var protocol: js.UndefOr[ContactProtocol] = js.native
  /**
    * The Lightsail resource type (e.g., ContactMethod).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The current status of the contact method. A contact method has the following possible status:    PendingVerification — The contact method has not yet been verified, and the verification has not yet expired.    Valid — The contact method has been verified.    InValid — An attempt was made to verify the contact method, but the verification has expired.  
    */
  var status: js.UndefOr[ContactMethodStatus] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail contact method. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
}

object ContactMethod {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    contactEndpoint: NonEmptyString = null,
    createdAt: IsoDate = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    protocol: ContactProtocol = null,
    resourceType: ResourceType = null,
    status: ContactMethodStatus = null,
    supportCode: String = null
  ): ContactMethod = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (contactEndpoint != null) __obj.updateDynamic("contactEndpoint")(contactEndpoint.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMethod]
  }
}

