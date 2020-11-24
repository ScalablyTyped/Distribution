package typings.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod

import typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.UnmarshalledSseKmsEncryptedObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class UnmarshalledSourceSelectionCriteriaOps[Self <: UnmarshalledSourceSelectionCriteria] (val x: Self) extends AnyVal {
    
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
    def setSseKmsEncryptedObjects(value: UnmarshalledSseKmsEncryptedObjects): Self = this.set("SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseKmsEncryptedObjects: Self = this.set("SseKmsEncryptedObjects", js.undefined)
  }
}
