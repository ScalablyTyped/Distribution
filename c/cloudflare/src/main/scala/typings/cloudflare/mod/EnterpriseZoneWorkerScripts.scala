package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseZoneWorkerScripts extends StObject {
  
  def browse(account_id: String, name: String): ResponseObjectPromise
  
  def del(account_id: String, name: String): ResponseObjectPromise
  
  def edit(account_id: String, name: String, script: String): ResponseObjectPromise
  
  def read(account_id: String, name: String): ResponseObjectPromise
}
object EnterpriseZoneWorkerScripts {
  
  inline def apply(
    browse: (String, String) => ResponseObjectPromise,
    del: (String, String) => ResponseObjectPromise,
    edit: (String, String, String) => ResponseObjectPromise,
    read: (String, String) => ResponseObjectPromise
  ): EnterpriseZoneWorkerScripts = {
    val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit), read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[EnterpriseZoneWorkerScripts]
  }
  
  extension [Self <: EnterpriseZoneWorkerScripts](x: Self) {
    
    inline def setBrowse(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
    
    inline def setDel(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, String) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
  }
}
