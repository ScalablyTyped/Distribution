package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  /**
    * True to defer building of the index until buildDeferredIndexes is called (or a direct call to the corresponding query service API).
    */
  var deferred: js.UndefOr[Boolean] = js.undefined
  /**
    * If a secondary index already exists, an error will be thrown unless this is set to true.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
}

object CreateIndexOptions {
  @scala.inline
  def apply(deferred: js.UndefOr[Boolean] = js.undefined, ignoreIfExists: js.UndefOr[Boolean] = js.undefined): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

