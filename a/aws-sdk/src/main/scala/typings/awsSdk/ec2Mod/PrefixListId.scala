package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixListId extends js.Object {
  /**
    * A description for the security group rule that references this prefix list ID. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.native
}

object PrefixListId {
  @scala.inline
  def apply(): PrefixListId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListId]
  }
  @scala.inline
  implicit class PrefixListIdOps[Self <: PrefixListId] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setPrefixListId(value: String): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListId: Self = this.set("PrefixListId", js.undefined)
  }
  
}

