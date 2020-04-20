package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFileUriValue extends js.Object {
  /**
    * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
    */
  var fileName: OutputFileName = js.native
}

object OutputFileUriValue {
  @scala.inline
  def apply(fileName: OutputFileName): OutputFileUriValue = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFileUriValue]
  }
}

