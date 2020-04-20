package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDataConfig extends js.Object {
  /**
    * The URI of the S3 folder that contains a translation job's output file. The folder must be in the same Region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.translateMod.S3Uri = js.native
}

object OutputDataConfig {
  @scala.inline
  def apply(S3Uri: S3Uri): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDataConfig]
  }
}

