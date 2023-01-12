package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSCallSignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  var `type`: TSCallSignatureDeclaration
}
object `151` {
  
  inline def apply(): `151` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `151`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSCallSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
