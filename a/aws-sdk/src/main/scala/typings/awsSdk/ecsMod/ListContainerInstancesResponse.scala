package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContainerInstancesResponse extends js.Object {
  /**
    * The list of container instances with full ARN entries for each container instance associated with the specified cluster.
    */
  var containerInstanceArns: js.UndefOr[StringList] = js.native
  /**
    * The nextToken value to include in a future ListContainerInstances request. When the results of a ListContainerInstances request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListContainerInstancesResponse {
  @scala.inline
  def apply(): ListContainerInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerInstancesResponse]
  }
  @scala.inline
  implicit class ListContainerInstancesResponseOps[Self <: ListContainerInstancesResponse] (val x: Self) extends AnyVal {
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
    def setContainerInstanceArnsVarargs(value: String*): Self = this.set("containerInstanceArns", js.Array(value :_*))
    @scala.inline
    def setContainerInstanceArns(value: StringList): Self = this.set("containerInstanceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerInstanceArns: Self = this.set("containerInstanceArns", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

