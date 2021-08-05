package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticlesUniform extends StObject {
  
  var columns: Double
  
  var rows: Double
  
  /** The index into the uniforms array that this uniform begins. */
  var slot: Double
}
object ParticlesUniform {
  
  inline def apply(columns: Double, rows: Double, slot: Double): ParticlesUniform = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticlesUniform]
  }
  
  extension [Self <: ParticlesUniform](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
  }
}
