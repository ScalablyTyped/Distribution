package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends StObject {
  
  var as: K
}
object As {
  
  @scala.inline
  def apply[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](as: K): As[K] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[As[K]]
  }
  
  @scala.inline
  implicit class AsMutableBuilder[Self <: As[?], K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self & As[K]) extends AnyVal {
    
    @scala.inline
    def setAs(value: K): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
