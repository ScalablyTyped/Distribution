package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeQueryDefinitionsRequest extends js.Object {
  var maxResults: js.UndefOr[QueryListMaxResults] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
  var queryDefinitionNamePrefix: js.UndefOr[QueryDefinitionName] = js.native
}

object DescribeQueryDefinitionsRequest {
  @scala.inline
  def apply(): DescribeQueryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueryDefinitionsRequest]
  }
  @scala.inline
  implicit class DescribeQueryDefinitionsRequestOps[Self <: DescribeQueryDefinitionsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: QueryListMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setQueryDefinitionNamePrefix(value: QueryDefinitionName): Self = this.set("queryDefinitionNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryDefinitionNamePrefix: Self = this.set("queryDefinitionNamePrefix", js.undefined)
  }
  
}

