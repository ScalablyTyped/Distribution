package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumBooleanBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `134` extends StObject {
  
  var `type`: EnumBooleanBody = js.native
}
object `134` {
  
  @scala.inline
  def apply(`type`: EnumBooleanBody): `134` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`134`]
  }
  
  @scala.inline
  implicit class `134MutableBuilder`[Self <: `134`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
