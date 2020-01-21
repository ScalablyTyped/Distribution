package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * URL of endpoint
    */
  var Url: js.UndefOr[string] = js.native
}

object Endpoint {
  @scala.inline
  def apply(Url: string = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

