package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of resources associated with the project. 
    */
  var resources: js.UndefOr[ResourcesResult] = js.native
}

object ListResourcesResult {
  @scala.inline
  def apply(): ListResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesResult]
  }
  @scala.inline
  implicit class ListResourcesResultOps[Self <: ListResourcesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: ResourcesResult): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

