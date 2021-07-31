package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSCallSignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var `type`: TSCallSignatureDeclaration
}
object `146` {
  
  @scala.inline
  def apply(): `146` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit class `146MutableBuilder`[Self <: `146`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSCallSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
