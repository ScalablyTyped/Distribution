package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectivityInfoRequest extends js.Object {
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}

object GetConnectivityInfoRequest {
  @scala.inline
  def apply(ThingName: string): GetConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectivityInfoRequest]
  }
}

