package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowNodeBase extends StObject {
  
  var flags: FlowFlags
  
  var id: js.UndefOr[Double] = js.undefined
}
object FlowNodeBase {
  
  inline def apply(flags: FlowFlags): FlowNodeBase = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNodeBase]
  }
  
  extension [Self <: FlowNodeBase](x: Self) {
    
    inline def setFlags(value: FlowFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
