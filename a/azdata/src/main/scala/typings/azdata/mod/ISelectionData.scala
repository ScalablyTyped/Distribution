package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISelectionData extends StObject {
  
  var endColumn: Double
  
  var endLine: Double
  
  var startColumn: Double
  
  var startLine: Double
}
object ISelectionData {
  
  @scala.inline
  def apply(endColumn: Double, endLine: Double, startColumn: Double, startLine: Double): ISelectionData = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionData]
  }
  
  @scala.inline
  implicit class ISelectionDataMutableBuilder[Self <: ISelectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
  }
}
