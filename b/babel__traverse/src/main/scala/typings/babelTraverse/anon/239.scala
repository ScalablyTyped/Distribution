package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumNumberBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239` extends StObject {
  
  var `type`: EnumNumberBody
}
object `239` {
  
  inline def apply(): `239` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[`239`]
  }
  
  extension [Self <: `239`](x: Self) {
    
    inline def setType(value: EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
