package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumNumberMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `200` extends StObject {
  
  var `type`: EnumNumberMember = js.native
}
object `200` {
  
  @scala.inline
  def apply(`type`: EnumNumberMember): `200` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit class `200MutableBuilder`[Self <: `200`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumNumberMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
