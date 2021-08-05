package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  var `type`: ClassMethod
}
object `184` {
  
  inline def apply(): `184` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[`184`]
  }
  
  extension [Self <: `184`](x: Self) {
    
    inline def setType(value: ClassMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
