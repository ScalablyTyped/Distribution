package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `217` extends StObject {
  
  var `type`: ObjectPattern = js.native
}
object `217` {
  
  @scala.inline
  def apply(`type`: ObjectPattern): `217` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`217`]
  }
  
  @scala.inline
  implicit class `217MutableBuilder`[Self <: `217`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
