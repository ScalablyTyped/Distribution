package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationOptions extends StObject {
  
  var scope: js.UndefOr[java.lang.String] = js.undefined
  
  var `type`: js.UndefOr[WorkerType] = js.undefined
  
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.undefined
}
object RegistrationOptions {
  
  inline def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  
  extension [Self <: RegistrationOptions](x: Self) {
    
    inline def setScope(value: java.lang.String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(value: WorkerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateViaCache(value: ServiceWorkerUpdateViaCache): Self = StObject.set(x, "updateViaCache", value.asInstanceOf[js.Any])
    
    inline def setUpdateViaCacheUndefined: Self = StObject.set(x, "updateViaCache", js.undefined)
  }
}
