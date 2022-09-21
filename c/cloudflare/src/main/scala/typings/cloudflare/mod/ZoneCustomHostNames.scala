package typings.cloudflare.mod

import typings.cloudflare.anon.Hostname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneCustomHostNames extends StObject {
  
  def add(zone_id: String, config: Hostname): ResponseObjectPromise
  
  def browse(zone_id: String): ResponseObjectPromise
  
  def del(zone_id: String, id: String): ResponseObjectPromise
  
  def edit(zone_id: String, id: String, config: Hostname): ResponseObjectPromise
  
  def read(zone_id: String, id: String): ResponseObjectPromise
}
object ZoneCustomHostNames {
  
  inline def apply(
    add: (String, Hostname) => ResponseObjectPromise,
    browse: String => ResponseObjectPromise,
    del: (String, String) => ResponseObjectPromise,
    edit: (String, String, Hostname) => ResponseObjectPromise,
    read: (String, String) => ResponseObjectPromise
  ): ZoneCustomHostNames = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), browse = js.Any.fromFunction1(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit), read = js.Any.fromFunction2(read))
    __obj.asInstanceOf[ZoneCustomHostNames]
  }
  
  extension [Self <: ZoneCustomHostNames](x: Self) {
    
    inline def setAdd(value: (String, Hostname) => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBrowse(value: String => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction1(value))
    
    inline def setDel(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, Hostname) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
    
    inline def setRead(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
  }
}
