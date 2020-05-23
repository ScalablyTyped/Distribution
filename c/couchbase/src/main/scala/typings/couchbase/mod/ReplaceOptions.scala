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
    expiry: js.UndefOr[Double] = js.undefined,
    persist_to: js.UndefOr[Double] = js.undefined,
    replicate_to: js.UndefOr[Double] = js.undefined
  ): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    if (cas != null) __obj.updateDynamic("cas")(cas.asInstanceOf[js.Any])
    if (!js.isUndefined(expiry)) __obj.updateDynamic("expiry")(expiry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persist_to)) __obj.updateDynamic("persist_to")(persist_to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replicate_to)) __obj.updateDynamic("replicate_to")(replicate_to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOptions]
  }
}

