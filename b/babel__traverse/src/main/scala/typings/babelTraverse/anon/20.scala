package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends StObject {
  
  var `type`: TSTypeParameterDeclaration = js.native
}
object `20` {
  
  @scala.inline
  def apply(`type`: TSTypeParameterDeclaration): `20` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
