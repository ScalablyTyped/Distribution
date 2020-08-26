package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeQueriesResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of queries that match the request.
    */
  var queries: js.UndefOr[QueryInfoList] = js.native
}

object DescribeQueriesResponse {
  @scala.inline
  def apply(): DescribeQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueriesResponse]
  }
  @scala.inline
  implicit class DescribeQueriesResponseOps[Self <: DescribeQueriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setQueriesVarargs(value: QueryInfo*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: QueryInfoList): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
  
}

