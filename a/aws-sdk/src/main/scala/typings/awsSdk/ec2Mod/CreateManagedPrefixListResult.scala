package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateManagedPrefixListResult extends js.Object {
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.native
}

object CreateManagedPrefixListResult {
  @scala.inline
  def apply(PrefixList: ManagedPrefixList = null): CreateManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    if (PrefixList != null) __obj.updateDynamic("PrefixList")(PrefixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManagedPrefixListResult]
  }
}

