package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditSubsetParams extends IEditSessionOperationParams {
  
  var rowCount: Double = js.native
  
  var rowStartIndex: Double = js.native
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
