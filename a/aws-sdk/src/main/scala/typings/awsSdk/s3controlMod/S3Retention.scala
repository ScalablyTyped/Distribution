package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Retention extends js.Object {
  /**
    * The Retention mode to be applied to all objects in the Batch Operations job.
    */
  var Mode: js.UndefOr[S3ObjectLockRetentionMode] = js.native
  /**
    * The date when the applied Object Retention will expire on all objects in the Batch Operations job.
    */
  var RetainUntilDate: js.UndefOr[TimeStamp] = js.native
}

object S3Retention {
  @scala.inline
  def apply(): S3Retention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Retention]
  }
  @scala.inline
  implicit class S3RetentionOps[Self <: S3Retention] (val x: Self) extends AnyVal {
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
    def setMode(value: S3ObjectLockRetentionMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    @scala.inline
    def setRetainUntilDate(value: TimeStamp): Self = this.set("RetainUntilDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainUntilDate: Self = this.set("RetainUntilDate", js.undefined)
  }
  
}

