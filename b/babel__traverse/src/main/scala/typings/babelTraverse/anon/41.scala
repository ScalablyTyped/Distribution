package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var `type`: TSFunctionType
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setType(value: TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
