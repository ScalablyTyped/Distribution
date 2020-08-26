package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Destination extends js.Object {
  /**
    * The S3 bucket that contains the updated firmware.
    */
  var bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The S3 prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3Destination {
  @scala.inline
  def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  @scala.inline
  implicit class S3DestinationOps[Self <: S3Destination] (val x: Self) extends AnyVal {
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
    def setBucket(value: S3Bucket): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

