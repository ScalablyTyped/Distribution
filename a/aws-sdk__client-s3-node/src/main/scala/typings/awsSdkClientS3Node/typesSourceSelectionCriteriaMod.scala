package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects
import typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod.UnmarshalledSseKmsEncryptedObjects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceSelectionCriteriaMod {
  
  @js.native
  trait SourceSelectionCriteria extends StObject {
    
    /**
      * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
      */
    var SseKmsEncryptedObjects: js.UndefOr[typings.awsSdkClientS3Node.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects] = js.native
  }
  object SourceSelectionCriteria {
    
    @scala.inline
    def apply(): SourceSelectionCriteria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceSelectionCriteria]
    }
    
    @scala.inline
    implicit class SourceSelectionCriteriaMutableBuilder[Self <: SourceSelectionCriteria] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSourceSelectionCriteria extends SourceSelectionCriteria {
    
    /**
      * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
      */
    @JSName("SseKmsEncryptedObjects")
    var SseKmsEncryptedObjects_UnmarshalledSourceSelectionCriteria: js.UndefOr[UnmarshalledSseKmsEncryptedObjects] = js.native
  }
  object UnmarshalledSourceSelectionCriteria {
    
    @scala.inline
    def apply(): UnmarshalledSourceSelectionCriteria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSourceSelectionCriteria]
    }
    
    @scala.inline
    implicit class UnmarshalledSourceSelectionCriteriaMutableBuilder[Self <: UnmarshalledSourceSelectionCriteria] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSseKmsEncryptedObjects(value: UnmarshalledSseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
    }
  }
}
