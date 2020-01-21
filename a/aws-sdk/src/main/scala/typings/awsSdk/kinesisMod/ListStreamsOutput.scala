package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsOutput extends js.Object {
  /**
    * If set to true, there are more streams available to list.
    */
  var HasMoreStreams: BooleanObject = js.native
  /**
    * The names of the streams that are associated with the AWS account making the ListStreams request.
    */
  var StreamNames: StreamNameList = js.native
}

object ListStreamsOutput {
  @scala.inline
  def apply(HasMoreStreams: BooleanObject, StreamNames: StreamNameList): ListStreamsOutput = {
    val __obj = js.Dynamic.literal(HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListStreamsOutput]
  }
}

