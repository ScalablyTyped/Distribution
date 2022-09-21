package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneDetails extends StObject {
  
  var ScheduledAutoTuneDetails: js.UndefOr[typings.awsSdk.opensearchMod.ScheduledAutoTuneDetails] = js.undefined
}
object AutoTuneDetails {
  
  inline def apply(): AutoTuneDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneDetails]
  }
  
  extension [Self <: AutoTuneDetails](x: Self) {
    
    inline def setScheduledAutoTuneDetails(value: ScheduledAutoTuneDetails): Self = StObject.set(x, "ScheduledAutoTuneDetails", value.asInstanceOf[js.Any])
    
    inline def setScheduledAutoTuneDetailsUndefined: Self = StObject.set(x, "ScheduledAutoTuneDetails", js.undefined)
  }
}
