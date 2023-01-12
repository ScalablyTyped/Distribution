package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `246` extends StObject {
  
  var `type`: TypeParameterInstantiation
}
object `246` {
  
  inline def apply(): `246` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[`246`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `246`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
