package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSConstructSignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  var `type`: TSConstructSignatureDeclaration
}
object `119` {
  
  @scala.inline
  def apply(): `119` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit class `119MutableBuilder`[Self <: `119`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSConstructSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
