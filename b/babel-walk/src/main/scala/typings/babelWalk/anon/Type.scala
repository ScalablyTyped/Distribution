package typings.babelWalk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[`type` /* <: String */] extends StObject {
  
  var `type`: `type`
}
object Type {
  
  inline def apply[`type` /* <: String */](`type`: `type`): Type[`type`] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[`type`]]
  }
  
  extension [Self <: Type[?], `type` /* <: String */](x: Self & Type[`type`]) {
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
