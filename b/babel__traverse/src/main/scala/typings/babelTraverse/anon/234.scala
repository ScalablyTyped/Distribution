package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassPrivateMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  var `type`: ClassPrivateMethod
}
object `234` {
  
  inline def apply(): `234` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[`234`]
  }
  
  extension [Self <: `234`](x: Self) {
    
    inline def setType(value: ClassPrivateMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
