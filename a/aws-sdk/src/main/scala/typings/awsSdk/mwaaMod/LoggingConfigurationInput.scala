package typings.awsSdk.mwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfigurationInput extends StObject {
  
  /**
    * Publishes Airflow DAG processing logs to CloudWatch Logs.
    */
  var DagProcessingLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined
  
  /**
    * Publishes Airflow scheduler logs to CloudWatch Logs.
    */
  var SchedulerLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined
  
  /**
    * Publishes Airflow task logs to CloudWatch Logs.
    */
  var TaskLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined
  
  /**
    * Publishes Airflow web server logs to CloudWatch Logs.
    */
  var WebserverLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined
  
  /**
    * Publishes Airflow worker logs to CloudWatch Logs.
    */
  var WorkerLogs: js.UndefOr[ModuleLoggingConfigurationInput] = js.undefined
}
object LoggingConfigurationInput {
  
  inline def apply(): LoggingConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfigurationInput]
  }
  
  extension [Self <: LoggingConfigurationInput](x: Self) {
    
    inline def setDagProcessingLogs(value: ModuleLoggingConfigurationInput): Self = StObject.set(x, "DagProcessingLogs", value.asInstanceOf[js.Any])
    
    inline def setDagProcessingLogsUndefined: Self = StObject.set(x, "DagProcessingLogs", js.undefined)
    
    inline def setSchedulerLogs(value: ModuleLoggingConfigurationInput): Self = StObject.set(x, "SchedulerLogs", value.asInstanceOf[js.Any])
    
    inline def setSchedulerLogsUndefined: Self = StObject.set(x, "SchedulerLogs", js.undefined)
    
    inline def setTaskLogs(value: ModuleLoggingConfigurationInput): Self = StObject.set(x, "TaskLogs", value.asInstanceOf[js.Any])
    
    inline def setTaskLogsUndefined: Self = StObject.set(x, "TaskLogs", js.undefined)
    
    inline def setWebserverLogs(value: ModuleLoggingConfigurationInput): Self = StObject.set(x, "WebserverLogs", value.asInstanceOf[js.Any])
    
    inline def setWebserverLogsUndefined: Self = StObject.set(x, "WebserverLogs", js.undefined)
    
    inline def setWorkerLogs(value: ModuleLoggingConfigurationInput): Self = StObject.set(x, "WorkerLogs", value.asInstanceOf[js.Any])
    
    inline def setWorkerLogsUndefined: Self = StObject.set(x, "WorkerLogs", js.undefined)
  }
}
