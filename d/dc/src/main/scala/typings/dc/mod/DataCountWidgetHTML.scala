package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCountWidgetHTML extends StObject {
  
  var all: String
  
  var some: String
}
object DataCountWidgetHTML {
  
  inline def apply(all: String, some: String): DataCountWidgetHTML = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCountWidgetHTML]
  }
  
  extension [Self <: DataCountWidgetHTML](x: Self) {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setSome(value: String): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
