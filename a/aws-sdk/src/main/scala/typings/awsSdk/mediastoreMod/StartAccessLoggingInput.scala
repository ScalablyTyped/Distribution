package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAccessLoggingInput extends js.Object {
  /**
    * The name of the container that you want to start access logging on.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object StartAccessLoggingInput {
  @scala.inline
  def apply(ContainerName: ContainerName): StartAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAccessLoggingInput]
  }
}

