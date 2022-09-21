package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventInit[T]
  extends StObject
     with EventInit {
  
  var detail: js.UndefOr[T] = js.undefined
}
object CustomEventInit {
  
  inline def apply[T](): CustomEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventInit[T]]
  }
  
  extension [Self <: CustomEventInit[?], T](x: Self & CustomEventInit[T]) {
    
    inline def setDetail(value: T): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
