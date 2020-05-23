package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpCountry extends js.Object {
  /**
    * Reserved for future use.
    */
  var code: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var name: js.UndefOr[string] = js.native
}

object IpCountry {
  @scala.inline
  def apply(code: string = null, name: string = null): IpCountry = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpCountry]
  }
}

