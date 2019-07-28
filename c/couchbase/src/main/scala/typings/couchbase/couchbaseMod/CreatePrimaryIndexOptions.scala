package typings.couchbase.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePrimaryIndexOptions extends js.Object {
  /**
    * True to defer building of the index until buildDeferredIndexes is called (or a direct call to the corresponding query service API).
    */
  var deferred: js.UndefOr[Boolean] = js.undefined
  /**
    * If a primary index already exists, an error will be thrown unless this is set to true.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[String] = js.undefined
}

object CreatePrimaryIndexOptions {
  @scala.inline
  def apply(
    deferred: js.UndefOr[Boolean] = js.undefined,
    ignoreIfExists: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): CreatePrimaryIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CreatePrimaryIndexOptions]
  }
}

