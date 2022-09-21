package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSRecords extends StObject {
  
  def add(zone_id: String, record: DnsRecord): ResponseObjectPromise
  
  def browse(zone_id: String): ResponseObjectPromise
  
  def del(zone_id: String, id: String): ResponseObjectPromise
  
  def edit(zone_id: String, id: String, record: DnsRecord): ResponseObjectPromise
  
  def `export`(zone_id: String): ResponseObjectPromise
  
  def read(zone_id: String, id: String): ResponseObjectPromise
}
object DNSRecords {
  
  inline def apply(
    add: (String, DnsRecord) => ResponseObjectPromise,
    browse: String => ResponseObjectPromise,
    del: (String, String) => ResponseObjectPromise,
    edit: (String, String, DnsRecord) => ResponseObjectPromise,
    `export`: String => ResponseObjectPromise,
    read: (String, String) => ResponseObjectPromise
  ): DNSRecords = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), browse = js.Any.fromFunction1(browse), del = js.Any.fromFunction2(del), edit = js.Any.fromFunction3(edit), read = js.Any.fromFunction2(read))
    __obj.updateDynamic("export")(js.Any.fromFunction1(`export`))
    __obj.asInstanceOf[DNSRecords]
  }
  
  extension [Self <: DNSRecords](x: Self) {
    
    inline def setAdd(value: (String, DnsRecord) => ResponseObjectPromise): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBrowse(value: String => ResponseObjectPromise): Self = StObject.set(x, "browse", js.Any.fromFunction1(value))
    
    inline def setDel(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
    
    inline def setEdit(value: (String, String, DnsRecord) => ResponseObjectPromise): Self = StObject.set(x, "edit", js.Any.fromFunction3(value))
    
    inline def setExport(value: String => ResponseObjectPromise): Self = StObject.set(x, "export", js.Any.fromFunction1(value))
    
    inline def setRead(value: (String, String) => ResponseObjectPromise): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
  }
}
