package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeterUsageResult extends js.Object {
  
  /**
    * Metering record id.
    */
  var MeteringRecordId: js.UndefOr[String] = js.native
}
object MeterUsageResult {
  
  @scala.inline
  def apply(): MeterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterUsageResult]
  }
  
  @scala.inline
  implicit class MeterUsageResultOps[Self <: MeterUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeteringRecordId(value: String): Self = this.set("MeteringRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeteringRecordId: Self = this.set("MeteringRecordId", js.undefined)
  }
}
