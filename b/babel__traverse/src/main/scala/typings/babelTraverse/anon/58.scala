package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSVoidKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var `type`: TSVoidKeyword
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[`58`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `58`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
