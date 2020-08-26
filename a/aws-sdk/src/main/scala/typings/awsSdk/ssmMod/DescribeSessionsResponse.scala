package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSessionsResponse extends js.Object {
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * A list of sessions meeting the request parameters.
    */
  var Sessions: js.UndefOr[SessionList] = js.native
}

object DescribeSessionsResponse {
  @scala.inline
  def apply(): DescribeSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSessionsResponse]
  }
  @scala.inline
  implicit class DescribeSessionsResponseOps[Self <: DescribeSessionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = this.set("Sessions", js.Array(value :_*))
    @scala.inline
    def setSessions(value: SessionList): Self = this.set("Sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessions: Self = this.set("Sessions", js.undefined)
  }
  
}

