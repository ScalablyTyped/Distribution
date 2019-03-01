package typings
package camoLib.camoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends js.Object {
  /**
  		 * Limits the number of documents returned.
  		 *
  		 * @type {number}
  		 */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Find all or no references.
  		 * Pass an array of field names to only populate the specified references.
  		 *
  		 * @type {(boolean | string[])}
  		 */
  var populate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
  		 * Skips the given number of documents and returns the rest.
  		 *
  		 * @type {number}
  		 */
  var skip: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Sort the documents by the given field(s).
  		 *
  		 * @type {TypeOrArrayOfType<string>}
  		 */
  var sort: js.UndefOr[TypeOrArrayOfType[java.lang.String]] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    populate: scala.Boolean | js.Array[java.lang.String] = null,
    skip: scala.Int | scala.Double = null,
    sort: TypeOrArrayOfType[java.lang.String] = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOptions]
  }
}

