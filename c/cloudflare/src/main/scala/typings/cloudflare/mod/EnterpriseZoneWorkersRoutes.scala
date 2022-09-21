package typings.cloudflare.mod

import typings.cloudflare.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseZoneWorkersRoutes extends StObject {
  
  def add(zone_id: String, config: Pattern): ResponseObjectPromise
  
  def browse(zone_id: String): ResponseObjectPromise
  
  def del(zone_id: String, id: String): ResponseObjectPromise
  
  def edit(zone_id: String, id: String, config: Pattern): ResponseObjectPromise
  
  def read(zone_id: String, id: String): ResponseObjectPromise
}
object EnterpriseZoneWorkersRoutes {
  
  inline def apply(
    add: (String, Pattern) => ResponseObjectPromise,
    browse: String => ResponseObjectPromise,
    del: (String, String) => ResponseObjectPromise,
    edit: (String, String, Pattern) => ResponseObjectPromise,
    read: (String, String) => ResponseObjectPromise
  ): EnterpriseZoneWorkersRoutes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), browse = js.Any.fromFunction1(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit), read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[EnterpriseZoneWorkersRoutes]
  }
  
  extension [Self <: EnterpriseZoneWorkersRoutes](x: Self) {
    
    inline def setAdd(value: (String, Pattern) => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBrowse(value: String => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction1(value))
    
    inline def setDel(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, Pattern) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
  }
}
