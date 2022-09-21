package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeScreenAutomationResult extends StObject {
  
  /**
    * The updated workbook cursor after performing the automation action.
    */
  var workbookCursor: WorkbookCursor
}
object InvokeScreenAutomationResult {
  
  inline def apply(workbookCursor: WorkbookCursor): InvokeScreenAutomationResult = {
    val __obj = js.Dynamic.literal(workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeScreenAutomationResult]
  }
  
  extension [Self <: InvokeScreenAutomationResult](x: Self) {
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
