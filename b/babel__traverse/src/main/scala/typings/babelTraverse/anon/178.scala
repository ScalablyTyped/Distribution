package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  var `type`: BooleanTypeAnnotation
}
object `178` {
  
  inline def apply(): `178` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[`178`]
  }
  
  extension [Self <: `178`](x: Self) {
    
    inline def setType(value: BooleanTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
