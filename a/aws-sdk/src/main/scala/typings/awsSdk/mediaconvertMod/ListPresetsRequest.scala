package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsRequest extends js.Object {
  /**
    * Optionally, specify a preset category to limit responses to only presets from that category.
    */
  var Category: js.UndefOr[string] = js.native
  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  var ListBy: js.UndefOr[PresetListBy] = js.native
  /**
    * Optional. Number of presets, up to twenty, that will be returned at one time
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.native
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsSdk.mediaconvertMod.Order] = js.native
}

object ListPresetsRequest {
  @scala.inline
  def apply(
    Category: string = null,
    ListBy: PresetListBy = null,
    MaxResults: js.UndefOr[integerMin1Max20] = js.undefined,
    NextToken: string = null,
    Order: Order = null
  ): ListPresetsRequest = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (ListBy != null) __obj.updateDynamic("ListBy")(ListBy.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPresetsRequest]
  }
}

