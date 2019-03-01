package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketOptions extends js.Object {
  var authType: js.UndefOr[java.lang.String] = js.undefined
  var bucketType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The bucket name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ramQuotaMB: js.UndefOr[scala.Double] = js.undefined
  var replicaNumber: js.UndefOr[scala.Double] = js.undefined
}

object CreateBucketOptions {
  @scala.inline
  def apply(
    authType: java.lang.String = null,
    bucketType: java.lang.String = null,
    name: java.lang.String = null,
    ramQuotaMB: scala.Int | scala.Double = null,
    replicaNumber: scala.Int | scala.Double = null
  ): CreateBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (bucketType != null) __obj.updateDynamic("bucketType")(bucketType)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ramQuotaMB != null) __obj.updateDynamic("ramQuotaMB")(ramQuotaMB.asInstanceOf[js.Any])
    if (replicaNumber != null) __obj.updateDynamic("replicaNumber")(replicaNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOptions]
  }
}

