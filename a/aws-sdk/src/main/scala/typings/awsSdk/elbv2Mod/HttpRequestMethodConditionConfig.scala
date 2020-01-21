package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequestMethodConditionConfig extends js.Object {
  /**
    * The name of the request method. The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the method name must be an exact match. If you specify multiple strings, the condition is satisfied if one of the strings matches the HTTP request method. We recommend that you route GET and HEAD requests in the same way, because the response to a HEAD request may be cached.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}

object HttpRequestMethodConditionConfig {
  @scala.inline
  def apply(Values: ListOfString = null): HttpRequestMethodConditionConfig = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestMethodConditionConfig]
  }
}

