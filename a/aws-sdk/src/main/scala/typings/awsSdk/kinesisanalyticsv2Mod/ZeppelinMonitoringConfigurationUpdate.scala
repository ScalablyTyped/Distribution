package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeppelinMonitoringConfigurationUpdate extends StObject {
  
  /**
    * Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
    */
  var LogLevelUpdate: LogLevel
}
object ZeppelinMonitoringConfigurationUpdate {
  
  inline def apply(LogLevelUpdate: LogLevel): ZeppelinMonitoringConfigurationUpdate = {
    val __obj = js.Dynamic.literal(LogLevelUpdate = LogLevelUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeppelinMonitoringConfigurationUpdate]
  }
  
  extension [Self <: ZeppelinMonitoringConfigurationUpdate](x: Self) {
    
    inline def setLogLevelUpdate(value: LogLevel): Self = StObject.set(x, "LogLevelUpdate", value.asInstanceOf[js.Any])
  }
}
