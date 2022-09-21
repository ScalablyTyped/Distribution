package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineBreakTypeEnumValues
  extends StObject
     with EmbindEnum {
  
  var HardtLineBreak: LineBreakType
  
  var SoftLineBreak: LineBreakType
}
object LineBreakTypeEnumValues {
  
  inline def apply(HardtLineBreak: LineBreakType, SoftLineBreak: LineBreakType, values: js.Array[Double]): LineBreakTypeEnumValues = {
    val __obj = js.Dynamic.literal(HardtLineBreak = HardtLineBreak.asInstanceOf[js.Any], SoftLineBreak = SoftLineBreak.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakTypeEnumValues]
  }
  
  extension [Self <: LineBreakTypeEnumValues](x: Self) {
    
    inline def setHardtLineBreak(value: LineBreakType): Self = StObject.set(x, "HardtLineBreak", value.asInstanceOf[js.Any])
    
    inline def setSoftLineBreak(value: LineBreakType): Self = StObject.set(x, "SoftLineBreak", value.asInstanceOf[js.Any])
  }
}
