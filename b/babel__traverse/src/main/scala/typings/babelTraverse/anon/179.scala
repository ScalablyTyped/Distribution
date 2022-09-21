package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var `type`: TypeAlias
}
object `179` {
  
  inline def apply(): `179` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[`179`]
  }
  
  extension [Self <: `179`](x: Self) {
    
    inline def setType(value: TypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
