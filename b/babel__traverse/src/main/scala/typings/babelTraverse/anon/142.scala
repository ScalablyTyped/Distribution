package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EmptyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  var `type`: EmptyTypeAnnotation
}
object `142` {
  
  inline def apply(): `142` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[`142`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `142`] (val x: Self) extends AnyVal {
    
    inline def setType(value: EmptyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
