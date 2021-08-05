package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSseKmsEncryptedObjectsMod {
  
  trait SseKmsEncryptedObjects extends StObject {
    
    /**
      * <p>The replication for KMS encrypted S3 objects is disabled if status is not Enabled.</p>
      */
    var Status: Enabled | Disabled | String
  }
  object SseKmsEncryptedObjects {
    
    inline def apply(Status: Enabled | Disabled | String): SseKmsEncryptedObjects = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SseKmsEncryptedObjects]
    }
    
    extension [Self <: SseKmsEncryptedObjects](x: Self) {
      
      inline def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledSseKmsEncryptedObjects = SseKmsEncryptedObjects
}
