package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardVisualId extends StObject {
  
  /**
    * The ID of the dashboard that has the visual that you want to embed. The DashboardId can be found in the IDs for developers section of the Embed visual pane of the visual's on-visual menu of the Amazon QuickSight console. You can also get the DashboardId with a ListDashboards API operation.
    */
  var DashboardId: RestrictiveResourceId
  
  /**
    * The ID of the sheet that the has visual that you want to embed. The SheetId can be found in the IDs for developers section of the Embed visual pane of the visual's on-visual menu of the Amazon QuickSight console.
    */
  var SheetId: RestrictiveResourceId
  
  /**
    * The ID of the visual that you want to embed. The VisualID can be found in the IDs for developers section of the Embed visual pane of the visual's on-visual menu of the Amazon QuickSight console.
    */
  var VisualId: RestrictiveResourceId
}
object DashboardVisualId {
  
  inline def apply(
    DashboardId: RestrictiveResourceId,
    SheetId: RestrictiveResourceId,
    VisualId: RestrictiveResourceId
  ): DashboardVisualId = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId.asInstanceOf[js.Any], SheetId = SheetId.asInstanceOf[js.Any], VisualId = VisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardVisualId]
  }
  
  extension [Self <: DashboardVisualId](x: Self) {
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setSheetId(value: RestrictiveResourceId): Self = StObject.set(x, "SheetId", value.asInstanceOf[js.Any])
    
    inline def setVisualId(value: RestrictiveResourceId): Self = StObject.set(x, "VisualId", value.asInstanceOf[js.Any])
  }
}
