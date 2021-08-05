package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  var left: typings.baseui.baseuiNumbers.`0`
  
  var top: typings.baseui.baseuiNumbers.`0`
}
object Left {
  
  inline def apply(): Left = {
    val __obj = js.Dynamic.literal(left = 0, top = 0)
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setLeft(value: typings.baseui.baseuiNumbers.`0`): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: typings.baseui.baseuiNumbers.`0`): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
