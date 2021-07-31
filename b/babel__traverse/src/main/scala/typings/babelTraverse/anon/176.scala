package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNumberKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  var `type`: TSNumberKeyword
}
object `176` {
  
  @scala.inline
  def apply(): `176` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[`176`]
  }
  
  @scala.inline
  implicit class `176MutableBuilder`[Self <: `176`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
