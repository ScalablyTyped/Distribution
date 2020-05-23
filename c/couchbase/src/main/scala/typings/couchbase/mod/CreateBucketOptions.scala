package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketOptions extends js.Object {
  var authType: js.UndefOr[String] = js.undefined
  var bucketType: js.UndefOr[String] = js.undefined
  /**
    * The bucket name
    */
  var name: js.UndefOr[String] = js.undefined
  var ramQuotaMB: js.UndefOr[Double] = js.undefined
  var replicaNumber: js.UndefOr[Double] = js.undefined
}

object CreateBucketOptions {
  @scala.inline
  def apply(
    authType: String = null,
    bucketType: String = null,
    name: String = null,
    ramQuotaMB: js.UndefOr[Double] = js.undefined,
    replicaNumber: js.UndefOr[Double] = js.undefined
  ): CreateBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (bucketType != null) __obj.updateDynamic("bucketType")(bucketType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(ramQuotaMB)) __obj.updateDynamic("ramQuotaMB")(ramQuotaMB.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replicaNumber)) __obj.updateDynamic("replicaNumber")(replicaNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOptions]
  }
}

