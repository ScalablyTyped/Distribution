package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsWithCollection extends QueryOptions {
  var collection: java.lang.String
}

object QueryOptionsWithCollection {
  @scala.inline
  def apply(
    collection: java.lang.String,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): QueryOptionsWithCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithCollection]
  }
}

