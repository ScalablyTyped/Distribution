package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingOutput extends js.Object {
  /**
    * The name for the processing job output.
    */
  var OutputName: String = js.native
  /**
    * Configuration for processing job outputs in Amazon S3.
    */
  var S3Output: ProcessingS3Output = js.native
}

object ProcessingOutput {
  @scala.inline
  def apply(OutputName: String, S3Output: ProcessingS3Output): ProcessingOutput = {
    val __obj = js.Dynamic.literal(OutputName = OutputName.asInstanceOf[js.Any], S3Output = S3Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOutput]
  }
  @scala.inline
  implicit class ProcessingOutputOps[Self <: ProcessingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOutputName(value: String): Self = this.set("OutputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Output(value: ProcessingS3Output): Self = this.set("S3Output", value.asInstanceOf[js.Any])
  }
  
}

