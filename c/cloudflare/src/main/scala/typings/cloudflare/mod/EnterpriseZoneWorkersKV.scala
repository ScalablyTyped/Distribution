package typings.cloudflare.mod

import typings.cloudflare.anon.Base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseZoneWorkersKV extends StObject {
  
  def add(account_id: String, namespace_id: String, key_name: String, value: String): js.Promise[js.Object]
  
  def addMulti(account_id: String, namespace_id: String, data: js.Array[Base64]): js.Promise[js.Object]
  
  def browse(account_id: String, namespace_id: String): js.Promise[js.Object]
  
  def del(account_id: String, namespace_id: String, key_name: String): js.Promise[js.Object]
  
  def delMulti(account_id: String, namespace_id: String, data: js.Array[String]): js.Promise[js.Object]
  
  def read(account_id: String, namespace_id: String, key_name: String): js.Promise[js.Object]
}
object EnterpriseZoneWorkersKV {
  
  inline def apply(
    add: (String, String, String, String) => js.Promise[js.Object],
    addMulti: (String, String, js.Array[Base64]) => js.Promise[js.Object],
    browse: (String, String) => js.Promise[js.Object],
    del: (String, String, String) => js.Promise[js.Object],
    delMulti: (String, String, js.Array[String]) => js.Promise[js.Object],
    read: (String, String, String) => js.Promise[js.Object]
  ): EnterpriseZoneWorkersKV = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add), addMulti = js.Any.fromFunction3(addMulti), browse = js.Any.fromFunction2(browse), del = js.Any.fromFunction3(del), delMulti = js.Any.fromFunction3(delMulti), read = js.Any.fromFunction3(read))
    __obj.asInstanceOf[EnterpriseZoneWorkersKV]
  }
  
  extension [Self <: EnterpriseZoneWorkersKV](x: Self) {
    
    inline def setAdd(value: (String, String, String, String) => js.Promise[js.Object]): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    
    inline def setAddMulti(value: (String, String, js.Array[Base64]) => js.Promise[js.Object]): Self = StObject.set(x, "addMulti", js.Any.fromFunction3(value))
    
    inline def setBrowse(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
    
    inline def setDel(value: (String, String, String) => js.Promise[js.Object]): Self = StObject.set(x, "del", js.Any.fromFunction3(value))
    
    inline def setDelMulti(value: (String, String, js.Array[String]) => js.Promise[js.Object]): Self = StObject.set(x, "delMulti", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String, String) => js.Promise[js.Object]): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
  }
}
