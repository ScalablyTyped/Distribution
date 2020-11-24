package typings.awsSdkClientS3Browser.typesSourceSelectionCriteriaMod

import typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSelectionCriteria extends js.Object {
  
  /**
    * <p> Container for filter information of selection of KMS Encrypted S3 objects. The element is required if you include <code>SourceSelectionCriteria</code> in the replication configuration. </p>
    */
  var SseKmsEncryptedObjects: js.UndefOr[
    typings.awsSdkClientS3Browser.typesSseKmsEncryptedObjectsMod.SseKmsEncryptedObjects
  ] = js.native
}
object SourceSelectionCriteria {
  
  @scala.inline
  def apply(): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
  
  @scala.inline
  implicit class SourceSelectionCriteriaOps[Self <: SourceSelectionCriteria] (val x: Self) extends AnyVal {
    
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
    def setSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = this.set("SseKmsEncryptedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseKmsEncryptedObjects: Self = this.set("SseKmsEncryptedObjects", js.undefined)
  }
}
