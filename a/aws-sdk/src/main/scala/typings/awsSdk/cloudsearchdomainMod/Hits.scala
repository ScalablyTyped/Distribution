package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hits extends js.Object {
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.native
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.native
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.native
}

object Hits {
  @scala.inline
  def apply(
    cursor: String = null,
    found: js.UndefOr[Long] = js.undefined,
    hit: HitList = null,
    start: js.UndefOr[Long] = js.undefined
  ): Hits = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(found)) __obj.updateDynamic("found")(found.get.asInstanceOf[js.Any])
    if (hit != null) __obj.updateDynamic("hit")(hit.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hits]
  }
}

