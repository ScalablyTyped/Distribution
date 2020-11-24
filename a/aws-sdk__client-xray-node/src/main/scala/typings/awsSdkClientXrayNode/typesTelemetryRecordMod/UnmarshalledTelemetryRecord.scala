package typings.awsSdkClientXrayNode.typesTelemetryRecordMod

import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.UnmarshalledBackendConnectionErrors
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledTelemetryRecord extends TelemetryRecord {
  
  /**
    * <p/>
    */
  @JSName("BackendConnectionErrors")
  var BackendConnectionErrors_UnmarshalledTelemetryRecord: js.UndefOr[UnmarshalledBackendConnectionErrors] = js.native
  
  /**
    * <p/>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledTelemetryRecord: Date = js.native
}
object UnmarshalledTelemetryRecord {
  
  @scala.inline
  def apply(Timestamp: Date): UnmarshalledTelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTelemetryRecord]
  }
  
  @scala.inline
  implicit class UnmarshalledTelemetryRecordOps[Self <: UnmarshalledTelemetryRecord] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendConnectionErrors(value: UnmarshalledBackendConnectionErrors): Self = this.set("BackendConnectionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendConnectionErrors: Self = this.set("BackendConnectionErrors", js.undefined)
  }
}
