package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventTrackerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group that receives the event data.
    */
  var datasetGroupArn: Arn = js.native
  /**
    * The name for the event tracker.
    */
  var name: Name = js.native
}

object CreateEventTrackerRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn, name: Name): CreateEventTrackerRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventTrackerRequest]
  }
  @scala.inline
  implicit class CreateEventTrackerRequestOps[Self <: CreateEventTrackerRequest] (val x: Self) extends AnyVal {
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
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

