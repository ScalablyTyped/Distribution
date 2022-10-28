package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumNumberMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `205` extends StObject {
  
  var `type`: EnumNumberMember
}
object `205` {
  
  inline def apply(): `205` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[`205`]
  }
  
  extension [Self <: `205`](x: Self) {
    
    inline def setType(value: EnumNumberMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
