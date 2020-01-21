package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsInput extends js.Object {
  /**
    * The records associated with the request.
    */
  var Records: PutRecordsRequestEntryList = js.native
  /**
    * The stream name associated with the request.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object PutRecordsInput {
  @scala.inline
  def apply(Records: PutRecordsRequestEntryList, StreamName: StreamName): PutRecordsInput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRecordsInput]
  }
}

