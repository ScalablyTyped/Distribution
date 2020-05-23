package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCountByEffectivePermission extends js.Object {
  /**
    * Reserved for future use.
    */
  var publiclyAccessible: js.UndefOr[long] = js.native
  /**
    * Reserved for future use.
    */
  var publiclyReadable: js.UndefOr[long] = js.native
  /**
    * Reserved for future use.
    */
  var publiclyWritable: js.UndefOr[long] = js.native
}

object BucketCountByEffectivePermission {
  @scala.inline
  def apply(
    publiclyAccessible: js.UndefOr[long] = js.undefined,
    publiclyReadable: js.UndefOr[long] = js.undefined,
    publiclyWritable: js.UndefOr[long] = js.undefined
  ): BucketCountByEffectivePermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(publiclyAccessible)) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publiclyReadable)) __obj.updateDynamic("publiclyReadable")(publiclyReadable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publiclyWritable)) __obj.updateDynamic("publiclyWritable")(publiclyWritable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCountByEffectivePermission]
  }
}

