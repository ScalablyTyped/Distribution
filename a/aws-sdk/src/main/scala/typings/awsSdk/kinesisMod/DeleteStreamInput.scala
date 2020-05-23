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
  def apply(StreamName: StreamName, EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    if (!js.isUndefined(EnforceConsumerDeletion)) __obj.updateDynamic("EnforceConsumerDeletion")(EnforceConsumerDeletion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
}

