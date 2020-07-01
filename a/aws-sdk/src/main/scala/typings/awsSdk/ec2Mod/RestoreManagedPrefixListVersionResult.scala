package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreManagedPrefixListVersionResult extends js.Object {
  /**
    * Information about the prefix list.
    */
  var PrefixList: js.UndefOr[ManagedPrefixList] = js.native
}

object RestoreManagedPrefixListVersionResult {
  @scala.inline
  def apply(PrefixList: ManagedPrefixList = null): RestoreManagedPrefixListVersionResult = {
    val __obj = js.Dynamic.literal()
    if (PrefixList != null) __obj.updateDynamic("PrefixList")(PrefixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreManagedPrefixListVersionResult]
  }
}

