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
}

