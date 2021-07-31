package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSelectionCriteria extends StObject {
  
  /**
    *  A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If you include SourceSelectionCriteria in the replication configuration, this element is required. 
    */
  var SseKmsEncryptedObjects: js.UndefOr[typings.awsSdk.s3Mod.SseKmsEncryptedObjects] = js.undefined
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
