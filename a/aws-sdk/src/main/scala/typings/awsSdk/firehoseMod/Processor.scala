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
  def apply(Type: ProcessorType): Processor = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor]
  }
  @scala.inline
  implicit class ProcessorOps[Self <: Processor] (val x: Self) extends AnyVal {
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
    def setType(value: ProcessorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: ProcessorParameter*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ProcessorParameterList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
  
}

