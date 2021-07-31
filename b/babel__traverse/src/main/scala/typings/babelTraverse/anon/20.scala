package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var `type`: TSTypeParameterDeclaration
}
object `20` {
  
  @scala.inline
  def apply(): `20` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
