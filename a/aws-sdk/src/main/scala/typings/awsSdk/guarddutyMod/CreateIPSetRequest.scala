package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetRequest extends js.Object {
  /**
    * A Boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
    */
  var Activate: Boolean = js.native
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.guarddutyMod.ClientToken] = js.native
  /**
    * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  /**
    * The URI of the file that contains the IPSet. For example: .
    */
  var Location: typings.awsSdk.guarddutyMod.Location = js.native
  /**
    * The user-friendly name to identify the IPSet.  Allowed characters are alphanumerics, spaces, hyphens (-), and underscores (_).
    */
  var Name: typings.awsSdk.guarddutyMod.Name = js.native
  /**
    * The tags to be added to a new IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateIPSetRequest {
  @scala.inline
  def apply(
    Activate: Boolean,
    DetectorId: DetectorId,
    Format: IpSetFormat,
    Location: Location,
    Name: Name,
    ClientToken: ClientToken = null,
    Tags: TagMap = null
  ): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(Activate = Activate.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetRequest]
  }
}

