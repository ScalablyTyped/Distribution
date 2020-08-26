package typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod

import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityDescription extends js.Object {
  /**
    * <p>Date on which the identity was created.</p>
    */
  var CreationDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  var LastModifiedDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  var Logins: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
}

object IdentityDescription {
  @scala.inline
  def apply(): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityDescription]
  }
  @scala.inline
  implicit class IdentityDescriptionOps[Self <: IdentityDescription] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Date | String | Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setIdentityId(value: String): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date | String | Double): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setLoginsVarargs(value: String*): Self = this.set("Logins", js.Array(value :_*))
    @scala.inline
    def setLogins(value: js.Array[String] | Iterable[String]): Self = this.set("Logins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogins: Self = this.set("Logins", js.undefined)
  }
  
}

