package typings.babelWalk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[`type` /* <: String */] extends StObject {
  
  var `type`: `type` = js.native
}
object Type {
  
  @scala.inline
  def apply[`type` /* <: String */](`type`: `type`): Type[`type`] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[`type`]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[_], `type` /* <: String */] (val x: Self with Type[`type`]) extends AnyVal {
    
    @scala.inline
    def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
