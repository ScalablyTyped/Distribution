package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectTorrentOutput extends js.Object {
  /**
    * A Bencoded dictionary as defined by the BitTorrent specification
    */
  var Body: js.UndefOr[typings.awsSdk.s3Mod.Body] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
}

object GetObjectTorrentOutput {
  @scala.inline
  def apply(Body: Body = null, RequestCharged: RequestCharged = null): GetObjectTorrentOutput = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentOutput]
  }
}

