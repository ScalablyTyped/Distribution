package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.RegExpLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var `type`: RegExpLiteral
}
object `37` {
  
  @scala.inline
  def apply(): `37` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
