package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadPipelineRequest extends js.Object {
  /**
    * The identifier of the pipeline to read.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
}

object ReadPipelineRequest {
  @scala.inline
  def apply(Id: Id): ReadPipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadPipelineRequest]
  }
}

