package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Object extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * S3 object key name.
    */
  var Name: js.UndefOr[S3ObjectName] = js.native
  /**
    * If the bucket is versioning enabled, you can specify the object version. 
    */
  var Version: js.UndefOr[S3ObjectVersion] = js.native
}

object S3Object {
  @scala.inline
  def apply(): S3Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Object]
  }
  @scala.inline
  implicit class S3ObjectOps[Self <: S3Object] (val x: Self) extends AnyVal {
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
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setName(value: S3ObjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setVersion(value: S3ObjectVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

