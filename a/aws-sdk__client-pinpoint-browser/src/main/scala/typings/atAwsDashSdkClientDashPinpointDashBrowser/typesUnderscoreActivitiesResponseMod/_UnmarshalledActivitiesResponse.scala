package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreActivitiesResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreActivityResponseMod._UnmarshalledActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledActivitiesResponse extends _ActivitiesResponse {
  /**
    * List of campaign activities
    */
  @JSName("Item")
  var Item__UnmarshalledActivitiesResponse: js.UndefOr[js.Array[_UnmarshalledActivityResponse]] = js.undefined
}

object _UnmarshalledActivitiesResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledActivityResponse] = null, NextToken: String = null): _UnmarshalledActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_UnmarshalledActivitiesResponse]
  }
}

