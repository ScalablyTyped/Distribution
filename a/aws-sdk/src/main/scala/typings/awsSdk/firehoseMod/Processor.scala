package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processor extends js.Object {
  /**
    * The processor parameters.
    */
  var Parameters: js.UndefOr[ProcessorParameterList] = js.native
  /**
    * The type of processor.
    */
  var Type: ProcessorType = js.native
}

object Processor {
  @scala.inline
  def apply(Type: ProcessorType, Parameters: ProcessorParameterList = null): Processor = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor]
  }
}

