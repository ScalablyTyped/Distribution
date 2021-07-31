package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BreakStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `type`: BreakStatement
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
