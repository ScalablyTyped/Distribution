package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServersRequest extends js.Object {
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opsworkscmMod.MaxResults] = js.native
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opsworkscmMod.NextToken] = js.native
  /**
    * Describes the server with the specified ServerName.
    */
  var ServerName: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerName] = js.native
}

object DescribeServersRequest {
  @scala.inline
  def apply(): DescribeServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServersRequest]
  }
  @scala.inline
  implicit class DescribeServersRequestOps[Self <: DescribeServersRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
  }
  
}

