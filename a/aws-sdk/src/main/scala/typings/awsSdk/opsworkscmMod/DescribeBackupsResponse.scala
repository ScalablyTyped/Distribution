package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupsResponse extends js.Object {
  /**
    * Contains the response to a DescribeBackups request. 
    */
  var Backups: js.UndefOr[typings.awsSdk.opsworkscmMod.Backups] = js.native
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[String] = js.native
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

