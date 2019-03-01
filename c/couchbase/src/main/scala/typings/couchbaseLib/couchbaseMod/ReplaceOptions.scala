package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOptions extends AppendOptions {
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[scala.Double] = js.undefined
}

object ReplaceOptions {
  @scala.inline
  def apply(
    cas: couchbaseLib.couchbaseMod.BucketNs.CAS = null,
    expiry: scala.Int | scala.Double = null,
    persist_to: scala.Int | scala.Double = null,
    replicate_to: scala.Int | scala.Double = null
  ): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    if (cas != null) __obj.updateDynamic("cas")(cas)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOptions]
  }
}

