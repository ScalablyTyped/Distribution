package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait PushSubscriptionOptions extends StObject {
  
  val applicationServerKey: ArrayBuffer | Null
}
object PushSubscriptionOptions {
  
  inline def apply(): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(applicationServerKey = null)
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  
  extension [Self <: PushSubscriptionOptions](x: Self) {
    
    inline def setApplicationServerKey(value: ArrayBuffer): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
  }
}
