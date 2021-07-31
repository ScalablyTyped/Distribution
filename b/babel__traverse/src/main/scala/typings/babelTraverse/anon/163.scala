package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var `type`: Placeholder
}
object `163` {
  
  @scala.inline
  def apply(): `163` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit class `163MutableBuilder`[Self <: `163`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
