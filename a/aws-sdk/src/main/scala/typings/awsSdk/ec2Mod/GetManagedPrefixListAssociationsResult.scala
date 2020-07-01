package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedPrefixListAssociationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the associations.
    */
  var PrefixListAssociations: js.UndefOr[PrefixListAssociationSet] = js.native
}

object GetManagedPrefixListAssociationsResult {
  @scala.inline
  def apply(NextToken: String = null, PrefixListAssociations: PrefixListAssociationSet = null): GetManagedPrefixListAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PrefixListAssociations != null) __obj.updateDynamic("PrefixListAssociations")(PrefixListAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedPrefixListAssociationsResult]
  }
}

