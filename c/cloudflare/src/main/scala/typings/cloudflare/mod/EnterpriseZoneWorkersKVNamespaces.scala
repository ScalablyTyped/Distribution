package typings.cloudflare.mod

import typings.cloudflare.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseZoneWorkersKVNamespaces extends StObject {
  
  def add(account_id: String, config: Title): ResponseObjectPromise
  
  def browse(account_id: String): ResponseObjectPromise
  
  def del(account_id: String, id: String): ResponseObjectPromise
  
  def edit(account_id: String, id: String, config: Title): ResponseObjectPromise
}
object EnterpriseZoneWorkersKVNamespaces {
  
  inline def apply(
    add: (String, Title) => ResponseObjectPromise,
    browse: String => ResponseObjectPromise,
    del: (String, String) => ResponseObjectPromise,
    edit: (String, String, Title) => ResponseObjectPromise
  ): EnterpriseZoneWorkersKVNamespaces = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), browse = js.Any.fromFunction1(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit))
    __obj.asInstanceOf[EnterpriseZoneWorkersKVNamespaces]
  }
  
  extension [Self <: EnterpriseZoneWorkersKVNamespaces](x: Self) {
    
    inline def setAdd(value: (String, Title) => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBrowse(value: String => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction1(value))
    
    inline def setDel(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, Title) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
  }
}
