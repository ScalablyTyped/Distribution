package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumStringBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var `type`: EnumStringBody
}
object `163` {
  
  inline def apply(): `163` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[`163`]
  }
  
  extension [Self <: `163`](x: Self) {
    
    inline def setType(value: EnumStringBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
