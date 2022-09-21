package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fromitem extends StObject {
  
  var fromitem: Any
  
  var target: Any
  
  var toitem: Any
  
  var `type`: String
}
object Fromitem {
  
  inline def apply(fromitem: Any, target: Any, toitem: Any, `type`: String): Fromitem = {
    val __obj = js.Dynamic.literal(fromitem = fromitem.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], toitem = toitem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fromitem]
  }
  
  extension [Self <: Fromitem](x: Self) {
    
    inline def setFromitem(value: Any): Self = StObject.set(x, "fromitem", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setToitem(value: Any): Self = StObject.set(x, "toitem", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
