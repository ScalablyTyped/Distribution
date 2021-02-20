package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any */] extends StObject {
  
  var `type`: T = js.native
}
object Type {
  
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any */](`type`: T): Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 242 */ js.Any */] (val x: Self with Type[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
