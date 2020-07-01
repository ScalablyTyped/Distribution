package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDestination extends js.Object {
  /**
    * An object that describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations export file, and its associated metadata file.
    */
  var s3: js.UndefOr[S3Destination] = js.native
}

object ExportDestination {
  @scala.inline
  def apply(s3: S3Destination = null): ExportDestination = {
    val __obj = js.Dynamic.literal()
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDestination]
  }
}

