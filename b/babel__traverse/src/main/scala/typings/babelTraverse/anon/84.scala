package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  var `type`: ObjectTypeAnnotation
}
object `84` {
  
  inline def apply(): `84` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[`84`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `84`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
