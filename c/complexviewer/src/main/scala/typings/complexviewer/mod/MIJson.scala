package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIJson extends StObject {
  
  var data: js.Array[Participant]
}
object MIJson {
  
  inline def apply(data: js.Array[Participant]): MIJson = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIJson]
  }
  
  extension [Self <: MIJson](x: Self) {
    
    inline def setData(value: js.Array[Participant]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Participant*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
