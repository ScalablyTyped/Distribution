package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceInit extends StObject {
  
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}
object EventSourceInit {
  
  inline def apply(): EventSourceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceInit]
  }
  
  extension [Self <: EventSourceInit](x: Self) {
    
    inline def setWithCredentials(value: scala.Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
