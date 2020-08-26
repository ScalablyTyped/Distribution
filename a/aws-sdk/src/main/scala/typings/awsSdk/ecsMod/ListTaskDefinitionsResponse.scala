package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskDefinitionsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListTaskDefinitions request. When the results of a ListTaskDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of task definition Amazon Resource Name (ARN) entries for the ListTaskDefinitions request.
    */
  var taskDefinitionArns: js.UndefOr[StringList] = js.native
}

object ListTaskDefinitionsResponse {
  @scala.inline
  def apply(): ListTaskDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskDefinitionsResponse]
  }
  @scala.inline
  implicit class ListTaskDefinitionsResponseOps[Self <: ListTaskDefinitionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTaskDefinitionArnsVarargs(value: String*): Self = this.set("taskDefinitionArns", js.Array(value :_*))
    @scala.inline
    def setTaskDefinitionArns(value: StringList): Self = this.set("taskDefinitionArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskDefinitionArns: Self = this.set("taskDefinitionArns", js.undefined)
  }
  
}

