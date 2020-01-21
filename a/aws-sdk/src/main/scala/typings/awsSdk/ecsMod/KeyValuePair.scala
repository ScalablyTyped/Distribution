package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValuePair extends js.Object {
  /**
    * The name of the key-value pair. For environment variables, this is the name of the environment variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the key-value pair. For environment variables, this is the value of the environment variable.
    */
  var value: js.UndefOr[String] = js.native
}

object KeyValuePair {
  @scala.inline
  def apply(name: String = null, value: String = null): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair]
  }
}

