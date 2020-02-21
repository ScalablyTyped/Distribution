package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLDAPSSettingsRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * Specifies the number of items that should be displayed on one page.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * The type of next token used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * The type of LDAP security to enable. Currently only the value Client is supported.
    */
  var Type: js.UndefOr[LDAPSType] = js.native
}

object DescribeLDAPSSettingsRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    Limit: Int | Double = null,
    NextToken: NextToken = null,
    Type: LDAPSType = null
  ): DescribeLDAPSSettingsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLDAPSSettingsRequest]
  }
}

