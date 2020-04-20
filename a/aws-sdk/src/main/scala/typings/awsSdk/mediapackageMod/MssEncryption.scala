package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssEncryption extends js.Object {
  var SpekeKeyProvider: typings.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object MssEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): MssEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssEncryption]
  }
}

