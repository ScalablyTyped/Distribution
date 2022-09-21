package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushEventInit
  extends StObject
     with EventInit {
  
  var data: js.UndefOr[PushMessageDataInit] = js.undefined
}
object PushEventInit {
  
  inline def apply(): PushEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushEventInit]
  }
  
  extension [Self <: PushEventInit](x: Self) {
    
    inline def setData(value: PushMessageDataInit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
