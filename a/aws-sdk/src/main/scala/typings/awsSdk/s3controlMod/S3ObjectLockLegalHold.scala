package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ObjectLockLegalHold extends StObject {
  
  /**
    * The Object Lock legal hold status to be applied to all objects in the Batch Operations job.
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
  implicit class S3ObjectLockLegalHoldMutableBuilder[Self <: S3ObjectLockLegalHold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: S3ObjectLockLegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
