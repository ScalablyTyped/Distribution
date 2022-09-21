package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `245` extends StObject {
  
  var `type`: TypeParameterInstantiation
}
object `245` {
  
  inline def apply(): `245` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[`245`]
  }
  
  extension [Self <: `245`](x: Self) {
    
    inline def setType(value: TypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
