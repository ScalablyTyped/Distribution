package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSEnumMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `130` extends StObject {
  
  var `type`: TSEnumMember = js.native
}
object `130` {
  
  @scala.inline
  def apply(`type`: TSEnumMember): `130` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`130`]
  }
  
  @scala.inline
  implicit class `130MutableBuilder`[Self <: `130`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
