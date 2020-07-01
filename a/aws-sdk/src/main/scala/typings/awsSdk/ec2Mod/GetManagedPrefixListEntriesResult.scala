package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedPrefixListEntriesResult extends js.Object {
  /**
    * Information about the prefix list entries.
    */
  var Entries: js.UndefOr[PrefixListEntrySet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object GetManagedPrefixListEntriesResult {
  @scala.inline
  def apply(Entries: PrefixListEntrySet = null, NextToken: NextToken = null): GetManagedPrefixListEntriesResult = {
    val __obj = js.Dynamic.literal()
    if (Entries != null) __obj.updateDynamic("Entries")(Entries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedPrefixListEntriesResult]
  }
}

