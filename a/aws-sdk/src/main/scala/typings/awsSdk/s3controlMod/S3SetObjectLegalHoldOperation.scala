package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SetObjectLegalHoldOperation extends js.Object {
  /**
    * The Legal Hold contains the status to be applied to all objects in the Batch Operations job.
    */
  var LegalHold: S3ObjectLockLegalHold = js.native
}

object S3SetObjectLegalHoldOperation {
  @scala.inline
  def apply(LegalHold: S3ObjectLockLegalHold): S3SetObjectLegalHoldOperation = {
    val __obj = js.Dynamic.literal(LegalHold = LegalHold.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectLegalHoldOperation]
  }
}

