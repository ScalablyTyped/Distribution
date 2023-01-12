package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var `type`: TSDeclareMethod
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `77`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSDeclareMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
