package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `224` extends StObject {
  
  var `type`: ObjectPattern
}
object `224` {
  
  inline def apply(): `224` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[`224`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `224`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
