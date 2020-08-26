package typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledIdentityDescription extends IdentityDescription {
  /**
    * <p>Date on which the identity was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledIdentityDescription: js.UndefOr[Date] = js.native
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  @JSName("LastModifiedDate")
  var LastModifiedDate_UnmarshalledIdentityDescription: js.UndefOr[Date] = js.native
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  @JSName("Logins")
  var Logins_UnmarshalledIdentityDescription: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledIdentityDescription {
  @scala.inline
  def apply(): UnmarshalledIdentityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledIdentityDescription]
  }
  @scala.inline
  implicit class UnmarshalledIdentityDescriptionOps[Self <: UnmarshalledIdentityDescription] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setLoginsVarargs(value: String*): Self = this.set("Logins", js.Array(value :_*))
    @scala.inline
    def setLogins(value: js.Array[String]): Self = this.set("Logins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogins: Self = this.set("Logins", js.undefined)
  }
  
}

