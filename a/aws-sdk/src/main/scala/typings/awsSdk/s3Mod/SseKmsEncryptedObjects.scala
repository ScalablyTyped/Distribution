package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SseKmsEncryptedObjects extends StObject {
  
  /**
    * Specifies whether Amazon S3 replicates objects created with server-side encryption using a customer master key (CMK) stored in AWS Key Management Service.
    */
  var Status: SseKmsEncryptedObjectsStatus = js.native
}
object SseKmsEncryptedObjects {
  
  @scala.inline
  def apply(Status: SseKmsEncryptedObjectsStatus): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
  
  @scala.inline
  implicit class SseKmsEncryptedObjectsMutableBuilder[Self <: SseKmsEncryptedObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: SseKmsEncryptedObjectsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
