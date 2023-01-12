package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.UnionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  var `type`: UnionTypeAnnotation
}
object `221` {
  
  inline def apply(): `221` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[`221`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `221`] (val x: Self) extends AnyVal {
    
    inline def setType(value: UnionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
