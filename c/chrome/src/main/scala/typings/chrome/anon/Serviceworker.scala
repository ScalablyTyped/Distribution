package typings.chrome.anon

import typings.chrome.chromeStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serviceworker extends StObject {
  
  var service_worker: String
  
  var `type`: js.UndefOr[module] = js.undefined
}
object Serviceworker {
  
  inline def apply(service_worker: String): Serviceworker = {
    val __obj = js.Dynamic.literal(service_worker = service_worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceworker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serviceworker] (val x: Self) extends AnyVal {
    
    inline def setService_worker(value: String): Self = StObject.set(x, "service_worker", value.asInstanceOf[js.Any])
    
    inline def setType(value: module): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
