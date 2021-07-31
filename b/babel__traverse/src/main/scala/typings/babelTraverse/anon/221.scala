package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  var `type`: FunctionTypeParam
}
object `221` {
  
  @scala.inline
  def apply(): `221` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[`221`]
  }
  
  @scala.inline
  implicit class `221MutableBuilder`[Self <: `221`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
