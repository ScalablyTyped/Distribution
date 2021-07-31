package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInterfaceBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `type`: TSInterfaceBody
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
