package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationExportConfiguration extends js.Object {
  /**
    * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in that bucket.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.native
}

object ClassificationExportConfiguration {
  @scala.inline
  def apply(): ClassificationExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationExportConfiguration]
  }
  @scala.inline
  implicit class ClassificationExportConfigurationOps[Self <: ClassificationExportConfiguration] (val x: Self) extends AnyVal {
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
    def setS3Destination(value: S3Destination): Self = this.set("s3Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Destination: Self = this.set("s3Destination", js.undefined)
  }
  
}

