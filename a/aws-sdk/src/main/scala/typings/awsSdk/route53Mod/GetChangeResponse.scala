package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeResponse extends js.Object {
  /**
    * A complex type that contains information about the specified change batch.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}

object GetChangeResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): GetChangeResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetChangeResponse]
  }
}

