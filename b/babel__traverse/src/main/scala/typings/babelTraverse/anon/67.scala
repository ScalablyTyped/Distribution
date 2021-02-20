package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `67` extends StObject {
  
  var `type`: VariableDeclaration = js.native
}
object `67` {
  
  @scala.inline
  def apply(`type`: VariableDeclaration): `67` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit class `67MutableBuilder`[Self <: `67`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
