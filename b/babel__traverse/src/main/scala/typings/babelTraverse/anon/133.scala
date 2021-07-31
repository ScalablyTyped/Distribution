package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  var `type`: FunctionDeclaration
}
object `133` {
  
  @scala.inline
  def apply(): `133` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[`133`]
  }
  
  @scala.inline
  implicit class `133MutableBuilder`[Self <: `133`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
