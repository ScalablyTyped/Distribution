package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPrefixListEntry extends js.Object {
  /**
    * The CIDR block.
    */
  var Cidr: String = js.native
  /**
    * A description for the entry. Constraints: Up to 255 characters in length.
    */
  var Description: js.UndefOr[String] = js.native
}

object AddPrefixListEntry {
  @scala.inline
  def apply(Cidr: String, Description: String = null): AddPrefixListEntry = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPrefixListEntry]
  }
}

