package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  var `type`: NumberTypeAnnotation
}
object `164` {
  
  inline def apply(): `164` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `164`] (val x: Self) extends AnyVal {
    
    inline def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
