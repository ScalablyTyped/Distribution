package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ObjectLockLegalHold extends js.Object {
  /**
    * The Legal Hold status to be applied to all objects in the Batch Operations job.
    */
  var Status: S3ObjectLockLegalHoldStatus = js.native
}

object S3ObjectLockLegalHold {
  @scala.inline
  def apply(Status: S3ObjectLockLegalHoldStatus): S3ObjectLockLegalHold = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectLockLegalHold]
  }
  @scala.inline
  implicit class S3ObjectLockLegalHoldOps[Self <: S3ObjectLockLegalHold] (val x: Self) extends AnyVal {
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
    def setStatus(value: S3ObjectLockLegalHoldStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

