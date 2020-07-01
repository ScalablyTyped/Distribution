package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPublicAccess extends js.Object {
  /**
    * Indicates if S3 Block Public Access is set to BlockPublicAcls.
    */
  var BlockPublicAcls: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if S3 Block Public Access is set to BlockPublicPolicy.
    */
  var BlockPublicPolicy: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if S3 Block Public Access is set to IgnorePublicAcls.
    */
  var IgnorePublicAcls: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if S3 Block Public Access is set to RestrictPublicBuckets.
    */
  var RestrictPublicBuckets: js.UndefOr[Boolean] = js.native
}

object BlockPublicAccess {
  @scala.inline
  def apply(
    BlockPublicAcls: js.UndefOr[Boolean] = js.undefined,
    BlockPublicPolicy: js.UndefOr[Boolean] = js.undefined,
    IgnorePublicAcls: js.UndefOr[Boolean] = js.undefined,
    RestrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
  ): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockPublicAcls)) __obj.updateDynamic("BlockPublicAcls")(BlockPublicAcls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BlockPublicPolicy)) __obj.updateDynamic("BlockPublicPolicy")(BlockPublicPolicy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IgnorePublicAcls)) __obj.updateDynamic("IgnorePublicAcls")(IgnorePublicAcls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RestrictPublicBuckets)) __obj.updateDynamic("RestrictPublicBuckets")(RestrictPublicBuckets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPublicAccess]
  }
}

