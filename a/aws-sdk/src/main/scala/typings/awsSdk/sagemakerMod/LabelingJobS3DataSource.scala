package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobS3DataSource extends js.Object {
  /**
    * The Amazon S3 location of the manifest file that describes the input data objects.
    */
  var ManifestS3Uri: S3Uri = js.native
}

object LabelingJobS3DataSource {
  @scala.inline
  def apply(ManifestS3Uri: S3Uri): LabelingJobS3DataSource = {
    val __obj = js.Dynamic.literal(ManifestS3Uri = ManifestS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobS3DataSource]
  }
}

