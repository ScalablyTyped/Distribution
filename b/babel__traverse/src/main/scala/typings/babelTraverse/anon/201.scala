package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var `type`: TSDeclareFunction
}
object `201` {
  
  inline def apply(): `201` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSDeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
