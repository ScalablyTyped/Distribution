package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumNumberBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var `type`: EnumNumberBody
}
object `233` {
  
  @scala.inline
  def apply(): `233` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit class `233MutableBuilder`[Self <: `233`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
