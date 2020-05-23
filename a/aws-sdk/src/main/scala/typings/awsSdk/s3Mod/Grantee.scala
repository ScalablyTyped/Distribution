package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.s3Mod.DisplayName] = js.native
  /**
    * Email address of the grantee.  Using email addresses to specify a grantee is only supported in the following AWS Regions:    US East (N. Virginia)   US West (N. California)    US West (Oregon)    Asia Pacific (Singapore)   Asia Pacific (Sydney)   Asia Pacific (Tokyo)   Europe (Ireland)   South America (São Paulo)   For a list of all the Amazon S3 supported Regions and endpoints, see Regions and Endpoints in the AWS General Reference. 
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.s3Mod.EmailAddress] = js.native
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.native
  /**
    * Type of grantee
    */
  var Type: typings.awsSdk.s3Mod.Type = js.native
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[typings.awsSdk.s3Mod.URI] = js.native
}

object Grantee {
  @scala.inline
  def apply(
    Type: Type,
    DisplayName: DisplayName = null,
    EmailAddress: EmailAddress = null,
    ID: ID = null,
    URI: URI = null
  ): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
}

