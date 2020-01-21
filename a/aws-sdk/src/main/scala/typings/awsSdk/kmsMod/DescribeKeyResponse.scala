package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyResponse extends js.Object {
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[typings.awsSdk.kmsMod.KeyMetadata] = js.native
}

object DescribeKeyResponse {
  @scala.inline
  def apply(KeyMetadata: KeyMetadata = null): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyResponse]
  }
}

