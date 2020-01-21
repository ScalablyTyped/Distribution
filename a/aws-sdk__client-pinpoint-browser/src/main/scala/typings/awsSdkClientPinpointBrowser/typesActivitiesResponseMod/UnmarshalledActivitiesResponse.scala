package typings.awsSdkClientPinpointBrowser.typesActivitiesResponseMod

import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.UnmarshalledActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledActivitiesResponse extends ActivitiesResponse {
  /**
    * List of campaign activities
    */
  @JSName("Item")
  var Item_UnmarshalledActivitiesResponse: js.UndefOr[js.Array[UnmarshalledActivityResponse]] = js.undefined
}

object UnmarshalledActivitiesResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledActivityResponse] = null, NextToken: String = null): UnmarshalledActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledActivitiesResponse]
  }
}

