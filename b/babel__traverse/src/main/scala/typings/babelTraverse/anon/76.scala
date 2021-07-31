package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var `type`: TemplateLiteral
}
object `76` {
  
  @scala.inline
  def apply(): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76MutableBuilder`[Self <: `76`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
