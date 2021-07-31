package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var `type`: DebuggerStatement
}
object `135` {
  
  @scala.inline
  def apply(): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit class `135MutableBuilder`[Self <: `135`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
