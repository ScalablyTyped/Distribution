package typings.awsSdkClientXrayNode.typesTelemetryRecordMod

import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryRecord extends js.Object {
  
  /**
    * <p/>
    */
  var BackendConnectionErrors: js.UndefOr[
    typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
  ] = js.native
  
  /**
    * <p/>
    */
  var SegmentsReceivedCount: js.UndefOr[Double] = js.native
  
  /**
    * <p/>
    */
  var SegmentsRejectedCount: js.UndefOr[Double] = js.native
  
  /**
    * <p/>
    */
  var SegmentsSentCount: js.UndefOr[Double] = js.native
  
  /**
    * <p/>
    */
  var SegmentsSpilloverCount: js.UndefOr[Double] = js.native
  
  /**
    * <p/>
    */
  var Timestamp: Date | String | Double = js.native
}
object TelemetryRecord {
  
  @scala.inline
  def apply(Timestamp: Date | String | Double): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
  
  @scala.inline
  implicit class TelemetryRecordOps[Self <: TelemetryRecord] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: Date | String | Double): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendConnectionErrors(value: BackendConnectionErrors): Self = this.set("BackendConnectionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendConnectionErrors: Self = this.set("BackendConnectionErrors", js.undefined)
    
    @scala.inline
    def setSegmentsReceivedCount(value: Double): Self = this.set("SegmentsReceivedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentsReceivedCount: Self = this.set("SegmentsReceivedCount", js.undefined)
    
    @scala.inline
    def setSegmentsRejectedCount(value: Double): Self = this.set("SegmentsRejectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentsRejectedCount: Self = this.set("SegmentsRejectedCount", js.undefined)
    
    @scala.inline
    def setSegmentsSentCount(value: Double): Self = this.set("SegmentsSentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentsSentCount: Self = this.set("SegmentsSentCount", js.undefined)
    
    @scala.inline
    def setSegmentsSpilloverCount(value: Double): Self = this.set("SegmentsSpilloverCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentsSpilloverCount: Self = this.set("SegmentsSpilloverCount", js.undefined)
  }
}
