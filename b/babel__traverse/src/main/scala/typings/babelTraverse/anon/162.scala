package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumStringBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  var `type`: EnumStringBody
}
object `162` {
  
  inline def apply(): `162` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[`162`]
  }
  
  extension [Self <: `162`](x: Self) {
    
    inline def setType(value: EnumStringBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
