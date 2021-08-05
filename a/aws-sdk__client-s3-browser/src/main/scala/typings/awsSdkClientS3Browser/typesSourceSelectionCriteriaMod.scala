package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects
import typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.UnmarshalledSseKmsEncryptedObjects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceSelectionCriteriaMod {
  
  trait SourceSelectionCriteria extends StObject {
    
    /**
      * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
      */
    var SseKmsEncryptedObjects: js.UndefOr[
        typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects
      ] = js.undefined
  }
  object SourceSelectionCriteria {
    
    inline def apply(): SourceSelectionCriteria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceSelectionCriteria]
    }
    
    extension [Self <: SourceSelectionCriteria](x: Self) {
      
      inline def setSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
      
      inline def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
    }
  }
  
  trait UnmarshalledSourceSelectionCriteria
    extends StObject
       with SourceSelectionCriteria {
    
    /**
      * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
      */
    @JSName("SseKmsEncryptedObjects")
    var SseKmsEncryptedObjects_UnmarshalledSourceSelectionCriteria: js.UndefOr[UnmarshalledSseKmsEncryptedObjects] = js.undefined
  }
  object UnmarshalledSourceSelectionCriteria {
    
    inline def apply(): UnmarshalledSourceSelectionCriteria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSourceSelectionCriteria]
    }
    
    extension [Self <: UnmarshalledSourceSelectionCriteria](x: Self) {
      
      inline def setSseKmsEncryptedObjects(value: UnmarshalledSseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
      
      inline def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
    }
  }
}
