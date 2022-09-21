package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowLabel
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var antecedents: js.UndefOr[Array[FlowNode]] = js.undefined
}
object FlowLabel {
  
  inline def apply(flags: FlowFlags): FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLabel]
  }
  
  extension [Self <: FlowLabel](x: Self) {
    
    inline def setAntecedents(value: Array[FlowNode]): Self = StObject.set(x, "antecedents", value.asInstanceOf[js.Any])
    
    inline def setAntecedentsUndefined: Self = StObject.set(x, "antecedents", js.undefined)
  }
}
