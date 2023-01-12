package typings.baseui.anon

import typings.baseui.baseuiStrings.cell
import typings.baseui.baseuiStrings.module
import typings.baseui.baseuiStrings.section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  val cell: typings.baseui.baseuiStrings.cell
  
  val module: typings.baseui.baseuiStrings.module
  
  val section: typings.baseui.baseuiStrings.section
}
object Cell {
  
  inline def apply(): Cell = {
    val __obj = js.Dynamic.literal(cell = "cell", module = "module", section = "section")
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    inline def setCell(value: cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setModule(value: module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setSection(value: section): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
