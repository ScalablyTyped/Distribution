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
  @scala.inline
  implicit class RemovePrefixListEntryOps[Self <: RemovePrefixListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCidr(value: String): Self = this.set("Cidr", value.asInstanceOf[js.Any])
  }
  
}

