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
}

