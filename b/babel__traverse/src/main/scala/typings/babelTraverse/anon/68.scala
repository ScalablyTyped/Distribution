package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  var `type`: VariableDeclaration
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `68`] (val x: Self) extends AnyVal {
    
    inline def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
