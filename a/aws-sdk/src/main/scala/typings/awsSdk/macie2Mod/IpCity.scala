package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpCity extends js.Object {
  /**
    * Reserved for future use.
    */
  var name: js.UndefOr[string] = js.native
}

object IpCity {
  @scala.inline
  def apply(name: string = null): IpCity = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpCity]
  }
}

