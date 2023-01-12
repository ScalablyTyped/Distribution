package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var `type`: TSThisType
}
object `208` {
  
  inline def apply(): `208` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `208`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
