package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixListEntry extends js.Object {
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.native
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.native
}

object PrefixListEntry {
  @scala.inline
  def apply(Cidr: String = null, Description: String = null): PrefixListEntry = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixListEntry]
  }
}

