package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumberLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var `type`: NumberLiteralTypeAnnotation
}
object `157` {
  
  inline def apply(): `157` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `157`] (val x: Self) extends AnyVal {
    
    inline def setType(value: NumberLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
