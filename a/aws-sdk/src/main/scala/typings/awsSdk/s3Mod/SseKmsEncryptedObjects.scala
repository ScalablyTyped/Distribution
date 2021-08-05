package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SseKmsEncryptedObjects extends StObject {
  
  /**
    * Specifies whether Amazon S3 replicates objects created with server-side encryption using a customer master key (CMK) stored in AWS Key Management Service.
    */
  var Status: SseKmsEncryptedObjectsStatus
}
object SseKmsEncryptedObjects {
  
  inline def apply(Status: SseKmsEncryptedObjectsStatus): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
  
  extension [Self <: SseKmsEncryptedObjects](x: Self) {
    
    inline def setStatus(value: SseKmsEncryptedObjectsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
