package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowInfo extends StObject {
  
  /**
    * The number of rows that were not ingested.
    */
  var RowsDropped: js.UndefOr[long] = js.undefined
  
  /**
    * The number of rows that were ingested.
    */
  var RowsIngested: js.UndefOr[long] = js.undefined
}
object RowInfo {
  
  inline def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  
  extension [Self <: RowInfo](x: Self) {
    
    inline def setRowsDropped(value: long): Self = StObject.set(x, "RowsDropped", value.asInstanceOf[js.Any])
    
    inline def setRowsDroppedUndefined: Self = StObject.set(x, "RowsDropped", js.undefined)
    
    inline def setRowsIngested(value: long): Self = StObject.set(x, "RowsIngested", value.asInstanceOf[js.Any])
    
    inline def setRowsIngestedUndefined: Self = StObject.set(x, "RowsIngested", js.undefined)
  }
}
