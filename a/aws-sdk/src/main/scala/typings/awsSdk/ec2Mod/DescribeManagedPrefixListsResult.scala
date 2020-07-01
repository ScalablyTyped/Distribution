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
  def apply(NextToken: NextToken = null, PrefixLists: ManagedPrefixListSet = null): DescribeManagedPrefixListsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PrefixLists != null) __obj.updateDynamic("PrefixLists")(PrefixLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeManagedPrefixListsResult]
  }
}

