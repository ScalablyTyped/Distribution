package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `238` extends StObject {
  
  var `type`: NullLiteral
}
object `238` {
  
  @scala.inline
  def apply(): `238` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[`238`]
  }
  
  @scala.inline
  implicit class `238MutableBuilder`[Self <: `238`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
