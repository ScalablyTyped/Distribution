package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleLastUsed extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format that the role was last used. This field is null if the role has not been used within the IAM tracking period. For more information about the tracking period, see Regions Where Data Is Tracked in the IAM User Guide. 
    */
  var LastUsedDate: js.UndefOr[dateType] = js.native
  /**
    * The name of the AWS Region in which the role was last used.
    */
  var Region: js.UndefOr[stringType] = js.native
}

object RoleLastUsed {
  @scala.inline
  def apply(LastUsedDate: dateType = null, Region: stringType = null): RoleLastUsed = {
    val __obj = js.Dynamic.literal()
    if (LastUsedDate != null) __obj.updateDynamic("LastUsedDate")(LastUsedDate.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleLastUsed]
  }
}

