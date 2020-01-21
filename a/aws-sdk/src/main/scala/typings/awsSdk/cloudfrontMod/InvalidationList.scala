package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidationList extends js.Object {
  /**
    * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more invalidation batches in the list.
    */
  var IsTruncated: Boolean = js.native
  /**
    * A complex type that contains one InvalidationSummary element for each invalidation batch created by the current AWS account.
    */
  var Items: js.UndefOr[InvalidationSummaryList] = js.native
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: String = js.native
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: integer = js.native
  /**
    * If IsTruncated is true, this element is present and contains the value that you can use for the Marker request parameter to continue listing your invalidation batches where they left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The number of invalidation batches that were created by the current AWS account. 
    */
  var Quantity: integer = js.native
}

object InvalidationList {
  @scala.inline
  def apply(
    IsTruncated: Boolean,
    Marker: String,
    MaxItems: integer,
    Quantity: integer,
    Items: InvalidationSummaryList = null,
    NextMarker: String = null
  ): InvalidationList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationList]
  }
}

