package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  var `type`: FunctionDeclaration
}
object `136` {
  
  inline def apply(): `136` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `136`] (val x: Self) extends AnyVal {
    
    inline def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
