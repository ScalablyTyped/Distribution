package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.native
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[listOfString] = js.native
  /**
    * Required. The password of the ActiveMQ user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas.
    */
  var Password: js.UndefOr[string] = js.native
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[string] = js.native
}

object User {
  @scala.inline
  def apply(
    ConsoleAccess: js.UndefOr[boolean] = js.undefined,
    Groups: listOfString = null,
    Password: string = null,
    Username: string = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConsoleAccess)) __obj.updateDynamic("ConsoleAccess")(ConsoleAccess.get.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

