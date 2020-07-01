package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyManagedPrefixListResult extends js.Object {
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.native
}

object ModifyManagedPrefixListResult {
  @scala.inline
  def apply(PrefixList: ManagedPrefixList = null): ModifyManagedPrefixListResult = {
    val __obj = js.Dynamic.literal()
    if (PrefixList != null) __obj.updateDynamic("PrefixList")(PrefixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyManagedPrefixListResult]
  }
}

