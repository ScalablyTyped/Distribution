package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  var `type`: TSTypePredicate
}
object `186` {
  
  inline def apply(): `186` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[`186`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `186`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
