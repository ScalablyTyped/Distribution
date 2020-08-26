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
  def apply(Cidr: String): AddPrefixListEntry = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPrefixListEntry]
  }
  @scala.inline
  implicit class AddPrefixListEntryOps[Self <: AddPrefixListEntry] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

