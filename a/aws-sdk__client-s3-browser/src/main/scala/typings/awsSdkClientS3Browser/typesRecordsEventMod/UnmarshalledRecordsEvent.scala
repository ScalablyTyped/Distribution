package typings.awsSdkClientS3Browser.typesRecordsEventMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledRecordsEvent extends RecordsEvent {
  
  /**
    * <p>The byte array of partial, one or more result records.</p>
    */
  @JSName("Payload")
  var Payload_UnmarshalledRecordsEvent: js.UndefOr[Uint8Array] = js.native
}
object UnmarshalledRecordsEvent {
  
  @scala.inline
  def apply(): UnmarshalledRecordsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledRecordsEvent]
  }
  
  @scala.inline
  implicit class UnmarshalledRecordsEventOps[Self <: UnmarshalledRecordsEvent] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: Uint8Array): Self = this.set("Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
  }
}
