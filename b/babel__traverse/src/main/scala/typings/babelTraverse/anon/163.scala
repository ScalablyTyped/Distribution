package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `163` extends StObject {
  
  var `type`: Placeholder = js.native
}
object `163` {
  
  @scala.inline
  def apply(`type`: Placeholder): `163` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit class `163MutableBuilder`[Self <: `163`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
