package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassImplements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `211` extends StObject {
  
  var `type`: ClassImplements
}
object `211` {
  
  inline def apply(): `211` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[`211`]
  }
  
  extension [Self <: `211`](x: Self) {
    
    inline def setType(value: ClassImplements): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
