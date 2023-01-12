package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  var `type`: TSTypeAssertion
}
object `236` {
  
  inline def apply(): `236` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[`236`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `236`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypeAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
