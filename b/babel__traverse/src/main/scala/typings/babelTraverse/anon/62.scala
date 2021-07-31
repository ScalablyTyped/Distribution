package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var `type`: Directive
}
object `62` {
  
  @scala.inline
  def apply(): `62` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[`62`]
  }
  
  @scala.inline
  implicit class `62MutableBuilder`[Self <: `62`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
