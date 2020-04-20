package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchInferenceJobInput extends js.Object {
  /**
    * The URI of the Amazon S3 location that contains your input data. The Amazon S3 bucket must be in the same region as the API endpoint you are calling.
    */
  var s3DataSource: S3DataConfig = js.native
}

object BatchInferenceJobInput {
  @scala.inline
  def apply(s3DataSource: S3DataConfig): BatchInferenceJobInput = {
    val __obj = js.Dynamic.literal(s3DataSource = s3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobInput]
  }
}

