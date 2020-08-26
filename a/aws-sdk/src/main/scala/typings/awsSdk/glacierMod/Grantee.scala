package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[String] = js.native
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[String] = js.native
  /**
    * Type of grantee
    */
  var Type: typings.awsSdk.glacierMod.Type = js.native
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[String] = js.native
}

object Grantee {
  @scala.inline
  def apply(Type: Type): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  @scala.inline
  implicit class GranteeOps[Self <: Grantee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURI: Self = this.set("URI", js.undefined)
  }
  
}

