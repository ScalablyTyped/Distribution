package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumStringBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var `type`: EnumStringBody
}
object `158` {
  
  inline def apply(): `158` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setType(value: EnumStringBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
