package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumBooleanMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `114` extends StObject {
  
  var `type`: EnumBooleanMember = js.native
}
object `114` {
  
  @scala.inline
  def apply(`type`: EnumBooleanMember): `114` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`114`]
  }
  
  @scala.inline
  implicit class `114MutableBuilder`[Self <: `114`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumBooleanMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
