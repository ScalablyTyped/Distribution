package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixList extends js.Object {
  /**
    * The IP address range of the AWS service.
    */
  var Cidrs: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.native
  /**
    * The name of the prefix.
    */
  var PrefixListName: js.UndefOr[String] = js.native
}

object PrefixList {
  @scala.inline
  def apply(Cidrs: ValueStringList = null, PrefixListId: String = null, PrefixListName: String = null): PrefixList = {
    val __obj = js.Dynamic.literal()
    if (Cidrs != null) __obj.updateDynamic("Cidrs")(Cidrs.asInstanceOf[js.Any])
    if (PrefixListId != null) __obj.updateDynamic("PrefixListId")(PrefixListId.asInstanceOf[js.Any])
    if (PrefixListName != null) __obj.updateDynamic("PrefixListName")(PrefixListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixList]
  }
}

