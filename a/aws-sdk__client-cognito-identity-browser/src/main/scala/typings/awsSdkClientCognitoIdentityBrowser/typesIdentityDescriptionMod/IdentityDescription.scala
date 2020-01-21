package typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod

import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityDescription extends js.Object {
  /**
    * <p>Date on which the identity was created.</p>
    */
  var CreationDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  var LastModifiedDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  var Logins: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object IdentityDescription {
  @scala.inline
  def apply(
    CreationDate: Date | String | Double = null,
    IdentityId: String = null,
    LastModifiedDate: Date | String | Double = null,
    Logins: js.Array[String] | Iterable[String] = null
  ): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Logins != null) __obj.updateDynamic("Logins")(Logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDescription]
  }
}

