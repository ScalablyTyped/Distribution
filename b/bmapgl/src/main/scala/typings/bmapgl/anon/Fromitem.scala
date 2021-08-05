package typings.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fromitem extends StObject {
  
  var fromitem: js.Any
  
  var target: js.Any
  
  var toitem: js.Any
  
  var `type`: String
}
object Fromitem {
  
  inline def apply(fromitem: js.Any, target: js.Any, toitem: js.Any, `type`: String): Fromitem = {
    val __obj = js.Dynamic.literal(fromitem = fromitem.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], toitem = toitem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fromitem]
  }
  
  extension [Self <: Fromitem](x: Self) {
    
    inline def setFromitem(value: js.Any): Self = StObject.set(x, "fromitem", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setToitem(value: js.Any): Self = StObject.set(x, "toitem", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
