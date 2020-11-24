package typings.awsSdkClientKmsNode.typesScheduleKeyDeletionOutputMod

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleKeyDeletionOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The date and time after which AWS KMS deletes the customer master key (CMK).</p>
    */
  var DeletionDate: js.UndefOr[Date] = js.native
  
  /**
    * <p>The unique identifier of the customer master key (CMK) for which deletion is scheduled.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
}
object ScheduleKeyDeletionOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ScheduleKeyDeletionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionOutput]
  }
  
  @scala.inline
  implicit class ScheduleKeyDeletionOutputOps[Self <: ScheduleKeyDeletionOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionDate(value: Date): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    
    @scala.inline
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
}
