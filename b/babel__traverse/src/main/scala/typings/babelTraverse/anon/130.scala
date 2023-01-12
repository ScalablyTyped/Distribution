package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  var `type`: VariableDeclarator
}
object `130` {
  
  inline def apply(): `130` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[`130`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `130`] (val x: Self) extends AnyVal {
    
    inline def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
