package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUnknownKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var `type`: TSUnknownKeyword
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSUnknownKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
