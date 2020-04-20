package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  /**
    * The HTTP codes. For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). For Network Load Balancers, this is 200–399.
    */
  var HttpCode: typings.awsSdk.elbv2Mod.HttpCode = js.native
}

object Matcher {
  @scala.inline
  def apply(HttpCode: HttpCode): Matcher = {
    val __obj = js.Dynamic.literal(HttpCode = HttpCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher]
  }
}

