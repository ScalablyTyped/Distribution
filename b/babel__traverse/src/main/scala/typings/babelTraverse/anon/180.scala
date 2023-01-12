package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  var `type`: TypeAlias
}
object `180` {
  
  inline def apply(): `180` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[`180`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `180`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
