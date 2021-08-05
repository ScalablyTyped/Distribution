package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  var `type`: EnumDefaultedMember
}
object `186` {
  
  inline def apply(): `186` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[`186`]
  }
  
  extension [Self <: `186`](x: Self) {
    
    inline def setType(value: EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
