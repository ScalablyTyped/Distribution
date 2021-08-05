package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: typings.baidumapWebSdk.BMap.Size
  
  var target: js.Any
  
  var `type`: String
}
object Size {
  
  inline def apply(size: typings.baidumapWebSdk.BMap.Size, target: js.Any, `type`: String): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setSize(value: typings.baidumapWebSdk.BMap.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
