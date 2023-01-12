package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var `type`: ClassDeclaration
}
object `109` {
  
  inline def apply(): `109` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `109`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
