package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditSubsetParams
  extends StObject
     with IEditSessionOperationParams {
  
  var rowCount: Double
  
  var rowStartIndex: Double
}
object EditSubsetParams {
  
  @scala.inline
  def apply(ownerUri: String, rowCount: Double, rowStartIndex: Double): EditSubsetParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSubsetParams]
  }
  
  @scala.inline
  implicit class EditSubsetParamsMutableBuilder[Self <: EditSubsetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
  }
}
