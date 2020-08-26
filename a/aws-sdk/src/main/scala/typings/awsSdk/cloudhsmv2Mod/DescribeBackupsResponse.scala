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
  def apply(): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
  @scala.inline
  implicit class DescribeBackupsResponseOps[Self <: DescribeBackupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupsVarargs(value: Backup*): Self = this.set("Backups", js.Array(value :_*))
    @scala.inline
    def setBackups(value: Backups): Self = this.set("Backups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackups: Self = this.set("Backups", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

