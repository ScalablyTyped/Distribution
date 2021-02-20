package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumStringMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var `type`: EnumStringMember = js.native
}
object `4` {
  
  @scala.inline
  def apply(`type`: EnumStringMember): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumStringMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
