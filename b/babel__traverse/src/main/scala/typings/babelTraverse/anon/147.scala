package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `147` extends StObject {
  
  var `type`: JSXFragment = js.native
}
object `147` {
  
  @scala.inline
  def apply(`type`: JSXFragment): `147` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit class `147MutableBuilder`[Self <: `147`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
