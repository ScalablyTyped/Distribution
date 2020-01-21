package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProcessingConfiguration extends js.Object {
  /**
    * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
    */
  var InputLambdaProcessor: typings.awsSdk.kinesisanalyticsv2Mod.InputLambdaProcessor = js.native
}

object InputProcessingConfiguration {
  @scala.inline
  def apply(InputLambdaProcessor: InputLambdaProcessor): InputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(InputLambdaProcessor = InputLambdaProcessor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputProcessingConfiguration]
  }
}

