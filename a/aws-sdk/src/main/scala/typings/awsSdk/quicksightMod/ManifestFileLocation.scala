package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestFileLocation extends js.Object {
  /**
    * Amazon S3 bucket.
    */
  var Bucket: S3Bucket = js.native
  /**
    * Amazon S3 key that identifies an object.
    */
  var Key: S3Key = js.native
}

object ManifestFileLocation {
  @scala.inline
  def apply(Bucket: S3Bucket, Key: S3Key): ManifestFileLocation = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestFileLocation]
  }
  @scala.inline
  implicit class ManifestFileLocationOps[Self <: ManifestFileLocation] (val x: Self) extends AnyVal {
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
    def setBucket(value: S3Bucket): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: S3Key): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
  
}

