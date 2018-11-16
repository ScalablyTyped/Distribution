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

