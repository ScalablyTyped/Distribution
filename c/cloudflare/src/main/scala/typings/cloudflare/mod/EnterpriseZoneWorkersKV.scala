package typings.cloudflare.mod

import typings.cloudflare.anon.Base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseZoneWorkersKV extends StObject {
  
  def add(account_id: String, namespace_id: String, key_name: String, value: String): ResponseObjectPromise
  
  def addMulti(account_id: String, namespace_id: String, data: js.Array[Base64]): ResponseObjectPromise
  
  def browse(account_id: String, namespace_id: String): ResponseObjectPromise
  
  def del(account_id: String, namespace_id: String, key_name: String): ResponseObjectPromise
  
  def delMulti(account_id: String, namespace_id: String, data: js.Array[String]): ResponseObjectPromise
  
  def read(account_id: String, namespace_id: String, key_name: String): ResponseObjectPromise
}
object EnterpriseZoneWorkersKV {
  
  inline def apply(
    add: (String, String, String, String) => ResponseObjectPromise,
    addMulti: (String, String, js.Array[Base64]) => ResponseObjectPromise,
    browse: (String, String) => ResponseObjectPromise,
    del: (String, String, String) => ResponseObjectPromise,
    delMulti: (String, String, js.Array[String]) => ResponseObjectPromise,
    read: (String, String, String) => ResponseObjectPromise
  ): EnterpriseZoneWorkersKV = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add), addMulti = js.Any.fromFunction3(addMulti), browse = js.Any.fromFunction2(browse), del = js.Any.fromFunction3(del), delMulti = js.Any.fromFunction3(delMulti), read = js.Any.fromFunction3(read))
    __obj.asInstanceOf[EnterpriseZoneWorkersKV]
  }
  
  extension [Self <: EnterpriseZoneWorkersKV](x: Self) {
    
    inline def setAdd(value: (String, String, String, String) => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    
    inline def setAddMulti(value: (String, String, js.Array[Base64]) => ResponseObjectPromise): Self = StObject.set(x, "addMulti", js.Any.fromFunction3(value))
    
    inline def setBrowse(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
    
    inline def setDel(value: (String, String, String) => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction3(value))
    
    inline def setDelMulti(value: (String, String, js.Array[String]) => ResponseObjectPromise): Self = StObject.set(x, "delMulti", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String, String) => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
  }
}
