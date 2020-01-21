package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingInput extends js.Object {
  /**
    * The name of the inputs for the processing job.
    */
  var InputName: String = js.native
  /**
    * The S3 inputs for the processing job. 
    */
  var S3Input: ProcessingS3Input = js.native
}

object ProcessingInput {
  @scala.inline
  def apply(InputName: String, S3Input: ProcessingS3Input): ProcessingInput = {
    val __obj = js.Dynamic.literal(InputName = InputName.asInstanceOf[js.Any], S3Input = S3Input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessingInput]
  }
}

