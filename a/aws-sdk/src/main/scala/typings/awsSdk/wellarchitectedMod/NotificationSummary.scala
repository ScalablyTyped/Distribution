package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSummary extends StObject {
  
  /**
    * Summary of lens upgrade.
    */
  var LensUpgradeSummary: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensUpgradeSummary] = js.undefined
  
  /**
    * The type of notification.
    */
  var Type: js.UndefOr[NotificationType] = js.undefined
}
object NotificationSummary {
  
  inline def apply(): NotificationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSummary]
  }
  
  extension [Self <: NotificationSummary](x: Self) {
    
    inline def setLensUpgradeSummary(value: LensUpgradeSummary): Self = StObject.set(x, "LensUpgradeSummary", value.asInstanceOf[js.Any])
    
    inline def setLensUpgradeSummaryUndefined: Self = StObject.set(x, "LensUpgradeSummary", js.undefined)
    
    inline def setType(value: NotificationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
