package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePrefixListEntry extends js.Object {
  /**
    * The CIDR block.
    */
  var Cidr: String = js.native
}

object RemovePrefixListEntry {
  @scala.inline
  def apply(Cidr: String): RemovePrefixListEntry = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePrefixListEntry]
  }
}

