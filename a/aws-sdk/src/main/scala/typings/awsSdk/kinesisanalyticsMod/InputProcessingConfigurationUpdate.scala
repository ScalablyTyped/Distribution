package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProcessingConfigurationUpdate extends js.Object {
  /**
    * Provides update information for an InputLambdaProcessor.
    */
  var InputLambdaProcessorUpdate: typings.awsSdk.kinesisanalyticsMod.InputLambdaProcessorUpdate = js.native
}

object InputProcessingConfigurationUpdate {
  @scala.inline
  def apply(InputLambdaProcessorUpdate: InputLambdaProcessorUpdate): InputProcessingConfigurationUpdate = {
    val __obj = js.Dynamic.literal(InputLambdaProcessorUpdate = InputLambdaProcessorUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfigurationUpdate]
  }
  @scala.inline
  implicit class InputProcessingConfigurationUpdateOps[Self <: InputProcessingConfigurationUpdate] (val x: Self) extends AnyVal {
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
    def setInputLambdaProcessorUpdate(value: InputLambdaProcessorUpdate): Self = this.set("InputLambdaProcessorUpdate", value.asInstanceOf[js.Any])
  }
  
}

