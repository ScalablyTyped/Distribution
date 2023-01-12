package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  var `type`: BooleanLiteralTypeAnnotation
}
object `178` {
  
  inline def apply(): `178` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[`178`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `178`] (val x: Self) extends AnyVal {
    
    inline def setType(value: BooleanLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
