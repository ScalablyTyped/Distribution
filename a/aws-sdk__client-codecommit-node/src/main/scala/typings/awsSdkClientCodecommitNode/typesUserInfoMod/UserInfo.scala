package typings.awsSdkClientCodecommitNode.typesUserInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /**
    * <p>The date when the specified commit was commited, in timestamp format with GMT offset.</p>
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * <p>The email address associated with the user who made the commit, if any.</p>
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the user who made the specified commit.</p>
    */
  var name: js.UndefOr[String] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(date: String = null, email: String = null, name: String = null): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

