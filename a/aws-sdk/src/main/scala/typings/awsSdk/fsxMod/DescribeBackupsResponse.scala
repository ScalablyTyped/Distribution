package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsResponse extends js.Object {
  /**
    * Any array of backups.
    */
  var Backups: js.UndefOr[typings.awsSdk.fsxMod.Backups] = js.native
  /**
    * This is present if there are more backups than returned in the response (String). You can use the NextToken value in the later request to fetch the backups. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeBackupsResponse {
  @scala.inline
  def apply(Backups: Backups = null, NextToken: NextToken = null): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Backups != null) __obj.updateDynamic("Backups")(Backups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
}

