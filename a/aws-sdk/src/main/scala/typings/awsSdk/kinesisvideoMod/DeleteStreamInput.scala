package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStreamInput extends js.Object {
  /**
    * Optional: The version of the stream that you want to delete.  Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream version, use the DescribeStream API. If not specified, only the CreationTime is checked before deleting the stream.
    */
  var CurrentVersion: js.UndefOr[Version] = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to delete. 
    */
  var StreamARN: ResourceARN = js.native
}

object DeleteStreamInput {
  @scala.inline
  def apply(StreamARN: ResourceARN, CurrentVersion: Version = null): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStreamInput]
  }
}

