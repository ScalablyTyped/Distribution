package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosBasicCredentials extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object AxiosBasicCredentials {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): AxiosBasicCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[AxiosBasicCredentials]
  }
}

