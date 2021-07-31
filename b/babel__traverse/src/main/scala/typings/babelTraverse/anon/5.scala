package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var `type`: ReturnStatement
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
