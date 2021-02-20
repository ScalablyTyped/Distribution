package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeterUsageResult extends StObject {
  
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
  implicit class MeterUsageResultMutableBuilder[Self <: MeterUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeteringRecordId(value: String): Self = StObject.set(x, "MeteringRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteringRecordIdUndefined: Self = StObject.set(x, "MeteringRecordId", js.undefined)
  }
}
