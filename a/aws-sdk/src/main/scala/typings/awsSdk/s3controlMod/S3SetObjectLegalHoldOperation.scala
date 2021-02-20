package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3SetObjectLegalHoldOperation extends StObject {
  
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
  implicit class S3SetObjectLegalHoldOperationMutableBuilder[Self <: S3SetObjectLegalHoldOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegalHold(value: S3ObjectLockLegalHold): Self = StObject.set(x, "LegalHold", value.asInstanceOf[js.Any])
  }
}
