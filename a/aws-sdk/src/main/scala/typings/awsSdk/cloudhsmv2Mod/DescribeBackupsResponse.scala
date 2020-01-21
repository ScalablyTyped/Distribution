package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsResponse extends js.Object {
  /**
    * A list of backups.
    */
  var Backups: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Backups] = js.native
  /**
    * An opaque string that indicates that the response contains only a subset of backups. Use this value in a subsequent DescribeBackups request to get more backups.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.native
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

