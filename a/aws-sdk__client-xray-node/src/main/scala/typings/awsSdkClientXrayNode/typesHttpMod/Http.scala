package typings.awsSdkClientXrayNode.typesHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http extends js.Object {
  /**
    * <p>The IP address of the requestor.</p>
    */
  var ClientIp: js.UndefOr[String] = js.undefined
  /**
    * <p>The request method.</p>
    */
  var HttpMethod: js.UndefOr[String] = js.undefined
  /**
    * <p>The response status.</p>
    */
  var HttpStatus: js.UndefOr[Double] = js.undefined
  /**
    * <p>The request URL.</p>
    */
  var HttpURL: js.UndefOr[String] = js.undefined
  /**
    * <p>The request's user agent string.</p>
    */
  var UserAgent: js.UndefOr[String] = js.undefined
}

object Http {
  @scala.inline
  def apply(
    ClientIp: String = null,
    HttpMethod: String = null,
    HttpStatus: js.UndefOr[Double] = js.undefined,
    HttpURL: String = null,
    UserAgent: String = null
  ): Http = {
    val __obj = js.Dynamic.literal()
    if (ClientIp != null) __obj.updateDynamic("ClientIp")(ClientIp.asInstanceOf[js.Any])
    if (HttpMethod != null) __obj.updateDynamic("HttpMethod")(HttpMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(HttpStatus)) __obj.updateDynamic("HttpStatus")(HttpStatus.get.asInstanceOf[js.Any])
    if (HttpURL != null) __obj.updateDynamic("HttpURL")(HttpURL.asInstanceOf[js.Any])
    if (UserAgent != null) __obj.updateDynamic("UserAgent")(UserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

