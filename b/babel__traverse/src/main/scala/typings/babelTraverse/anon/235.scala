package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassPrivateMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  var `type`: ClassPrivateMethod
}
object `235` {
  
  inline def apply(): `235` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[`235`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `235`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassPrivateMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
