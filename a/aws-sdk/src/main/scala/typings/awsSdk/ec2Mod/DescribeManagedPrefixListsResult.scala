package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeManagedPrefixListsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  /**
    * Information about the prefix lists.
    */
  var PrefixLists: js.UndefOr[ManagedPrefixListSet] = js.native
}

object DescribeManagedPrefixListsResult {
  @scala.inline
  def apply(): DescribeManagedPrefixListsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedPrefixListsResult]
  }
  @scala.inline
  implicit class DescribeManagedPrefixListsResultOps[Self <: DescribeManagedPrefixListsResult] (val x: Self) extends AnyVal {
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
    def setPrefixListsVarargs(value: ManagedPrefixList*): Self = this.set("PrefixLists", js.Array(value :_*))
    @scala.inline
    def setPrefixLists(value: ManagedPrefixListSet): Self = this.set("PrefixLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixLists: Self = this.set("PrefixLists", js.undefined)
  }
  
}

