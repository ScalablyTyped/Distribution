package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StringLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  var `type`: StringLiteralTypeAnnotation
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[`226`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `226`] (val x: Self) extends AnyVal {
    
    inline def setType(value: StringLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
