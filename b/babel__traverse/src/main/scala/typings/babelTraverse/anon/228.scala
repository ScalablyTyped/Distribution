package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassPrivateMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `228` extends StObject {
  
  var `type`: ClassPrivateMethod = js.native
}
object `228` {
  
  @scala.inline
  def apply(`type`: ClassPrivateMethod): `228` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  
  @scala.inline
  implicit class `228MutableBuilder`[Self <: `228`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassPrivateMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
