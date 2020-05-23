package typings.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends js.Object {
  /**
    * Limits the number of documents returned.
    *
    * @type {number}
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Find all or no references.
    * Pass an array of field names to only populate the specified references.
    *
    * @type {(boolean | string[])}
    */
  var populate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Skips the given number of documents and returns the rest.
    *
    * @type {number}
    */
  var skip: js.UndefOr[Double] = js.undefined
  /**
    * Sort the documents by the given field(s).
    *
    * @type {TypeOrArrayOfType<string>}
    */
  var sort: js.UndefOr[TypeOrArrayOfType[String]] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    populate: Boolean | js.Array[String] = null,
    skip: js.UndefOr[Double] = js.undefined,
    sort: TypeOrArrayOfType[String] = null
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (populate != null) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOptions]
  }
}

