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
  def apply(Description: String = null, PrefixListId: String = null): PrefixListId = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (PrefixListId != null) __obj.updateDynamic("PrefixListId")(PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixListId]
  }
}

