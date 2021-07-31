package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  var `type`: ForStatement
}
object `185` {
  
  @scala.inline
  def apply(): `185` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[`185`]
  }
  
  @scala.inline
  implicit class `185MutableBuilder`[Self <: `185`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
