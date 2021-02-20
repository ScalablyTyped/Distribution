package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticlesUniform extends StObject {
  
  var columns: Double = js.native
  
  var rows: Double = js.native
  
  /** The index into the uniforms array that this uniform begins. */
  var slot: Double = js.native
}
object ParticlesUniform {
  
  @scala.inline
  def apply(columns: Double, rows: Double, slot: Double): ParticlesUniform = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticlesUniform]
  }
  
  @scala.inline
  implicit class ParticlesUniformMutableBuilder[Self <: ParticlesUniform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
  }
}
