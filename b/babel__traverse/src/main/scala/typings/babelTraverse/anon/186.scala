package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `186` extends StObject {
  
  var `type`: EnumDefaultedMember = js.native
}
object `186` {
  
  @scala.inline
  def apply(`type`: EnumDefaultedMember): `186` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit class `186MutableBuilder`[Self <: `186`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
