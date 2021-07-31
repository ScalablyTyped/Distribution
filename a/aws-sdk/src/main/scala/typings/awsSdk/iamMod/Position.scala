package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  /**
    * The column in the line containing the specified position in the document.
    */
  var Column: js.UndefOr[ColumnNumber] = js.undefined
  
  /**
    * The line containing the specified position in the document.
    */
  var Line: js.UndefOr[LineNumber] = js.undefined
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ColumnNumber): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "Column", js.undefined)
    
    @scala.inline
    def setLine(value: LineNumber): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "Line", js.undefined)
  }
}
