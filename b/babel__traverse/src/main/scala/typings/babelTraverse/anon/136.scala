package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumBooleanBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  var `type`: EnumBooleanBody
}
object `136` {
  
  inline def apply(): `136` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[`136`]
  }
  
  extension [Self <: `136`](x: Self) {
    
    inline def setType(value: EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
