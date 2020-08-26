package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStreamInput extends js.Object {
  /**
    * If this parameter is unset (null) or if you set it to false, and the stream has registered consumers, the call to DeleteStream fails with a ResourceInUseException. 
    */
  var EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.native
  /**
    * The name of the stream to delete.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object DeleteStreamInput {
  @scala.inline
  def apply(StreamName: StreamName): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
  @scala.inline
  implicit class DeleteStreamInputOps[Self <: DeleteStreamInput] (val x: Self) extends AnyVal {
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
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnforceConsumerDeletion(value: BooleanObject): Self = this.set("EnforceConsumerDeletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceConsumerDeletion: Self = this.set("EnforceConsumerDeletion", js.undefined)
  }
  
}

