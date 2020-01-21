package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePrefixListsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * All available prefix lists.
    */
  var PrefixLists: js.UndefOr[PrefixListSet] = js.native
}

object DescribePrefixListsResult {
  @scala.inline
  def apply(NextToken: String = null, PrefixLists: PrefixListSet = null): DescribePrefixListsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PrefixLists != null) __obj.updateDynamic("PrefixLists")(PrefixLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePrefixListsResult]
  }
}

