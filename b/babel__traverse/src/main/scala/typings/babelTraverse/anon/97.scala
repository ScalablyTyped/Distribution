package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `97` extends StObject {
  
  var `type`: Identifier = js.native
}
object `97` {
  
  @scala.inline
  def apply(`type`: Identifier): `97` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit class `97MutableBuilder`[Self <: `97`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
