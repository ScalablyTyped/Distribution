package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoveredResourcesResult extends js.Object {
  /**
    * Returned list of discovered resources associated with the given MigrationTask.
    */
  var DiscoveredResourceList: js.UndefOr[typings.awsSdk.migrationhubMod.DiscoveredResourceList] = js.native
  /**
    * If there are more discovered resources than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListDiscoveredResourcesResult {
  @scala.inline
  def apply(): ListDiscoveredResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResult]
  }
  @scala.inline
  implicit class ListDiscoveredResourcesResultOps[Self <: ListDiscoveredResourcesResult] (val x: Self) extends AnyVal {
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
    def setDiscoveredResourceListVarargs(value: DiscoveredResource*): Self = this.set("DiscoveredResourceList", js.Array(value :_*))
    @scala.inline
    def setDiscoveredResourceList(value: DiscoveredResourceList): Self = this.set("DiscoveredResourceList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscoveredResourceList: Self = this.set("DiscoveredResourceList", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

