package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.Enabled
import typings.cassandraDriver.libTypesMod.types.Uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DseClientOptions
  extends StObject
     with ClientOptions {
  
  var applicationName: js.UndefOr[String] = js.undefined
  
  var applicationVersion: js.UndefOr[String] = js.undefined
  
  var graphOptions: js.UndefOr[GraphOptions] = js.undefined
  
  var id: js.UndefOr[Uuid] = js.undefined
  
  var monitorReporting: js.UndefOr[Enabled] = js.undefined
}
object DseClientOptions {
  
  inline def apply(): DseClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DseClientOptions]
  }
  
  extension [Self <: DseClientOptions](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    inline def setGraphOptions(value: GraphOptions): Self = StObject.set(x, "graphOptions", value.asInstanceOf[js.Any])
    
    inline def setGraphOptionsUndefined: Self = StObject.set(x, "graphOptions", js.undefined)
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMonitorReporting(value: Enabled): Self = StObject.set(x, "monitorReporting", value.asInstanceOf[js.Any])
    
    inline def setMonitorReportingUndefined: Self = StObject.set(x, "monitorReporting", js.undefined)
  }
}
