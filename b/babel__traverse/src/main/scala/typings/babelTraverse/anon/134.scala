package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumBooleanBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  var `type`: EnumBooleanBody
}
object `134` {
  
  @scala.inline
  def apply(): `134` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[`134`]
  }
  
  @scala.inline
  implicit class `134MutableBuilder`[Self <: `134`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
