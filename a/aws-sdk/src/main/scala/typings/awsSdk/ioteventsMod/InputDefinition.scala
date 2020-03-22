package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDefinition extends js.Object {
  /**
    * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using BatchPutMessage. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the condition expressions used by detectors that monitor this input. 
    */
  var attributes: Attributes = js.native
}

object InputDefinition {
  @scala.inline
  def apply(attributes: Attributes): InputDefinition = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputDefinition]
  }
}

