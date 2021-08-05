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
  
  inline def apply(): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
  
  extension [Self <: SourceSelectionCriteria](x: Self) {
    
    inline def setSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = StObject.set(x, "SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    inline def setSseKmsEncryptedObjectsUndefined: Self = StObject.set(x, "SseKmsEncryptedObjects", js.undefined)
  }
}
