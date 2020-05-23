package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCountBySharedAccessType extends js.Object {
  /**
    * Reserved for future use.
    */
  var external: js.UndefOr[long] = js.native
  /**
    * Reserved for future use.
    */
  var internal: js.UndefOr[long] = js.native
  /**
    * Reserved for future use.
    */
  var notShared: js.UndefOr[long] = js.native
}

object BucketCountBySharedAccessType {
  @scala.inline
  def apply(
    external: js.UndefOr[long] = js.undefined,
    internal: js.UndefOr[long] = js.undefined,
    notShared: js.UndefOr[long] = js.undefined
  ): BucketCountBySharedAccessType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.get.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notShared)) __obj.updateDynamic("notShared")(notShared.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCountBySharedAccessType]
  }
}

