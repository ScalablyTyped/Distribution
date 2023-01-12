package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var `type`: TSTypeParameterInstantiation
}
object `76` {
  
  inline def apply(): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `76`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
