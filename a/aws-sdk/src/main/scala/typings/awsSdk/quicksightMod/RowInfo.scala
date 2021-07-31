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
  
  @scala.inline
  def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  
  @scala.inline
  implicit class RowInfoMutableBuilder[Self <: RowInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowsDropped(value: long): Self = StObject.set(x, "RowsDropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsDroppedUndefined: Self = StObject.set(x, "RowsDropped", js.undefined)
    
    @scala.inline
    def setRowsIngested(value: long): Self = StObject.set(x, "RowsIngested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsIngestedUndefined: Self = StObject.set(x, "RowsIngested", js.undefined)
  }
}
