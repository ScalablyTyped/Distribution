package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkSLUniform extends StObject {
  
  var columns: Double
  
  var isInteger: Boolean
  
  var rows: Double
  
  /** The index into the uniforms array that this uniform begins. */
  var slot: Double
}
object SkSLUniform {
  
  inline def apply(columns: Double, isInteger: Boolean, rows: Double, slot: Double): SkSLUniform = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isInteger = isInteger.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkSLUniform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkSLUniform] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setIsInteger(value: Boolean): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
  }
}
