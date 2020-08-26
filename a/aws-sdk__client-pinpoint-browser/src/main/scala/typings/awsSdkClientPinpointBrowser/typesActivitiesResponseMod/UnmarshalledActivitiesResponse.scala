package typings.awsSdkClientPinpointBrowser.typesActivitiesResponseMod

import typings.awsSdkClientPinpointBrowser.typesActivityResponseMod.UnmarshalledActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledActivitiesResponse extends ActivitiesResponse {
  /**
    * List of campaign activities
    */
  @JSName("Item")
  var Item_UnmarshalledActivitiesResponse: js.UndefOr[js.Array[UnmarshalledActivityResponse]] = js.native
}

object UnmarshalledActivitiesResponse {
  @scala.inline
  def apply(): UnmarshalledActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledActivitiesResponse]
  }
  @scala.inline
  implicit class UnmarshalledActivitiesResponseOps[Self <: UnmarshalledActivitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemVarargs(value: UnmarshalledActivityResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[UnmarshalledActivityResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

