package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAccessLoggingInput extends js.Object {
  /**
    * The name of the container that you want to stop access logging on.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object StopAccessLoggingInput {
  @scala.inline
  def apply(ContainerName: ContainerName): StopAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAccessLoggingInput]
  }
}

