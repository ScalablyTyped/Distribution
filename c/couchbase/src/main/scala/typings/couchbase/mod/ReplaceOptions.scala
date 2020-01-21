package typings.couchbase.mod

import typings.couchbase.mod.Bucket.CAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOptions extends AppendOptions {
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.undefined
}

object ReplaceOptions {
  @scala.inline
  def apply(
    cas: CAS = null,
    expiry: Int | Double = null,
    persist_to: Int | Double = null,
    replicate_to: Int | Double = null
  ): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    if (cas != null) __obj.updateDynamic("cas")(cas.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOptions]
  }
}

