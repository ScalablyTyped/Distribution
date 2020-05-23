package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPublicAccess extends js.Object {
  /**
    * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
    */
  var blockPublicAcls: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
    */
  var blockPublicPolicy: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
    */
  var ignorePublicAcls: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
    */
  var restrictPublicBuckets: js.UndefOr[boolean] = js.native
}

object BlockPublicAccess {
  @scala.inline
  def apply(
    blockPublicAcls: js.UndefOr[boolean] = js.undefined,
    blockPublicPolicy: js.UndefOr[boolean] = js.undefined,
    ignorePublicAcls: js.UndefOr[boolean] = js.undefined,
    restrictPublicBuckets: js.UndefOr[boolean] = js.undefined
  ): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockPublicAcls)) __obj.updateDynamic("blockPublicAcls")(blockPublicAcls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockPublicPolicy)) __obj.updateDynamic("blockPublicPolicy")(blockPublicPolicy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePublicAcls)) __obj.updateDynamic("ignorePublicAcls")(ignorePublicAcls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictPublicBuckets)) __obj.updateDynamic("restrictPublicBuckets")(restrictPublicBuckets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPublicAccess]
  }
}

