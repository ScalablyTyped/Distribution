package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeQueryDefinitionsResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  var queryDefinitions: js.UndefOr[QueryDefinitionList] = js.native
}

object DescribeQueryDefinitionsResponse {
  @scala.inline
  def apply(): DescribeQueryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryDefinitionsResponse]
  }
  @scala.inline
  implicit class DescribeQueryDefinitionsResponseOps[Self <: DescribeQueryDefinitionsResponse] (val x: Self) extends AnyVal {
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
    def setQueryDefinitionsVarargs(value: QueryDefinition*): Self = this.set("queryDefinitions", js.Array(value :_*))
    @scala.inline
    def setQueryDefinitions(value: QueryDefinitionList): Self = this.set("queryDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryDefinitions: Self = this.set("queryDefinitions", js.undefined)
  }
  
}

