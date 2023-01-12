package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var `type`: MixedTypeAnnotation
}
object `57` {
  
  inline def apply(): `57` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `57`] (val x: Self) extends AnyVal {
    
    inline def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
