package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `15` extends StObject {
  
  var `type`: TSModuleDeclaration = js.native
}
object `15` {
  
  @scala.inline
  def apply(`type`: TSModuleDeclaration): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
