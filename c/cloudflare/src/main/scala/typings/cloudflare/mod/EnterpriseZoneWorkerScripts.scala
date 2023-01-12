package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseZoneWorkerScripts extends StObject {
  
  def browse(account_id: String, name: String): js.Promise[js.Object]
  
  def del(account_id: String, name: String): js.Promise[js.Object]
  
  def edit(account_id: String, name: String, script: String): js.Promise[js.Object]
  
  def read(account_id: String, name: String): js.Promise[js.Object]
}
object EnterpriseZoneWorkerScripts {
  
  inline def apply(
    browse: (String, String) => js.Promise[js.Object],
    del: (String, String) => js.Promise[js.Object],
    edit: (String, String, String) => js.Promise[js.Object],
    read: (String, String) => js.Promise[js.Object]
  ): EnterpriseZoneWorkerScripts = {
    val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit), read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[EnterpriseZoneWorkerScripts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseZoneWorkerScripts] (val x: Self) extends AnyVal {
    
    inline def setBrowse(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
    
    inline def setDel(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, String) => js.Promise[js.Object]): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
  }
}
