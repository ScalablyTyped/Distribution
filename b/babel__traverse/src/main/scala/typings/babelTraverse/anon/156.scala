package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  var `type`: TSTypeLiteral
}
object `156` {
  
  inline def apply(): `156` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[`156`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `156`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
