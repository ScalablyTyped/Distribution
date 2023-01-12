package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `245` extends StObject {
  
  var `type`: NullLiteral
}
object `245` {
  
  inline def apply(): `245` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[`245`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `245`] (val x: Self) extends AnyVal {
    
    inline def setType(value: NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
