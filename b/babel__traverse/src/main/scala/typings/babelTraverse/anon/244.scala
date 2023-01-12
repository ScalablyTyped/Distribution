package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.GenericTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `244` extends StObject {
  
  var `type`: GenericTypeAnnotation
}
object `244` {
  
  inline def apply(): `244` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[`244`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `244`] (val x: Self) extends AnyVal {
    
    inline def setType(value: GenericTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
