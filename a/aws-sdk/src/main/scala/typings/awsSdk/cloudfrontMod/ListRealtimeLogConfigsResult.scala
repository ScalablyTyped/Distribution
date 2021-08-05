package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRealtimeLogConfigsResult extends StObject {
  
  /**
    * A list of real-time log configurations.
    */
  var RealtimeLogConfigs: js.UndefOr[typings.awsSdk.cloudfrontMod.RealtimeLogConfigs] = js.undefined
}
object ListRealtimeLogConfigsResult {
  
  inline def apply(): ListRealtimeLogConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRealtimeLogConfigsResult]
  }
  
  extension [Self <: ListRealtimeLogConfigsResult](x: Self) {
    
    inline def setRealtimeLogConfigs(value: RealtimeLogConfigs): Self = StObject.set(x, "RealtimeLogConfigs", value.asInstanceOf[js.Any])
    
    inline def setRealtimeLogConfigsUndefined: Self = StObject.set(x, "RealtimeLogConfigs", js.undefined)
  }
}
