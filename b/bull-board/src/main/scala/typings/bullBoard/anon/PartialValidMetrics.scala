package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bull-board.bull-board/dist/app.ValidMetrics> */
trait PartialValidMetrics extends StObject {
  
  var blocked_clients: js.UndefOr[String] = js.undefined
  
  var connected_clients: js.UndefOr[String] = js.undefined
  
  var mem_fragmentation_ratio: js.UndefOr[String] = js.undefined
  
  var redis_version: js.UndefOr[String] = js.undefined
  
  var total_system_memory: js.UndefOr[String] = js.undefined
  
  var used_memory: js.UndefOr[String] = js.undefined
}
object PartialValidMetrics {
  
  inline def apply(): PartialValidMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialValidMetrics]
  }
  
  extension [Self <: PartialValidMetrics](x: Self) {
    
    inline def setBlocked_clients(value: String): Self = StObject.set(x, "blocked_clients", value.asInstanceOf[js.Any])
    
    inline def setBlocked_clientsUndefined: Self = StObject.set(x, "blocked_clients", js.undefined)
    
    inline def setConnected_clients(value: String): Self = StObject.set(x, "connected_clients", value.asInstanceOf[js.Any])
    
    inline def setConnected_clientsUndefined: Self = StObject.set(x, "connected_clients", js.undefined)
    
    inline def setMem_fragmentation_ratio(value: String): Self = StObject.set(x, "mem_fragmentation_ratio", value.asInstanceOf[js.Any])
    
    inline def setMem_fragmentation_ratioUndefined: Self = StObject.set(x, "mem_fragmentation_ratio", js.undefined)
    
    inline def setRedis_version(value: String): Self = StObject.set(x, "redis_version", value.asInstanceOf[js.Any])
    
    inline def setRedis_versionUndefined: Self = StObject.set(x, "redis_version", js.undefined)
    
    inline def setTotal_system_memory(value: String): Self = StObject.set(x, "total_system_memory", value.asInstanceOf[js.Any])
    
    inline def setTotal_system_memoryUndefined: Self = StObject.set(x, "total_system_memory", js.undefined)
    
    inline def setUsed_memory(value: String): Self = StObject.set(x, "used_memory", value.asInstanceOf[js.Any])
    
    inline def setUsed_memoryUndefined: Self = StObject.set(x, "used_memory", js.undefined)
  }
}
