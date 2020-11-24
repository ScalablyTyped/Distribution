package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3SetObjectLegalHoldOperation extends js.Object {
  
  /**
    * Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
    */
  var LegalHold: S3ObjectLockLegalHold = js.native
}
object S3SetObjectLegalHoldOperation {
  
  @scala.inline
  def apply(LegalHold: S3ObjectLockLegalHold): S3SetObjectLegalHoldOperation = {
    val __obj = js.Dynamic.literal(LegalHold = LegalHold.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectLegalHoldOperation]
  }
  
  @scala.inline
  implicit class S3SetObjectLegalHoldOperationOps[Self <: S3SetObjectLegalHoldOperation] (val x: Self) extends AnyVal {
    
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
    def setLegalHold(value: S3ObjectLockLegalHold): Self = this.set("LegalHold", value.asInstanceOf[js.Any])
  }
}
