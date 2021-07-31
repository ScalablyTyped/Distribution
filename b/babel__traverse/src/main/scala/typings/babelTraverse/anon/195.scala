package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DoWhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  var `type`: DoWhileStatement
}
object `195` {
  
  @scala.inline
  def apply(): `195` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[`195`]
  }
  
  @scala.inline
  implicit class `195MutableBuilder`[Self <: `195`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
