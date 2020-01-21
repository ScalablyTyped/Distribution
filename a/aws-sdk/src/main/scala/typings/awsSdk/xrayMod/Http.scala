package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http extends js.Object {
  /**
    * The IP address of the requestor.
    */
  var ClientIp: js.UndefOr[String] = js.native
  /**
    * The request method.
    */
  var HttpMethod: js.UndefOr[String] = js.native
  /**
    * The response status.
    */
  var HttpStatus: js.UndefOr[NullableInteger] = js.native
  /**
    * The request URL.
    */
  var HttpURL: js.UndefOr[String] = js.native
  /**
    * The request's user agent string.
    */
  var UserAgent: js.UndefOr[String] = js.native
}

object Http {
  @scala.inline
  def apply(
    ClientIp: String = null,
    HttpMethod: String = null,
    HttpStatus: Int | scala.Double = null,
    HttpURL: String = null,
    UserAgent: String = null
  ): Http = {
    val __obj = js.Dynamic.literal()
    if (ClientIp != null) __obj.updateDynamic("ClientIp")(ClientIp.asInstanceOf[js.Any])
    if (HttpMethod != null) __obj.updateDynamic("HttpMethod")(HttpMethod.asInstanceOf[js.Any])
    if (HttpStatus != null) __obj.updateDynamic("HttpStatus")(HttpStatus.asInstanceOf[js.Any])
    if (HttpURL != null) __obj.updateDynamic("HttpURL")(HttpURL.asInstanceOf[js.Any])
    if (UserAgent != null) __obj.updateDynamic("UserAgent")(UserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

