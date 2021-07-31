package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingCloudwatchLogsExports extends StObject {
  
  /**
    * Log types that are in the process of being enabled. After they are enabled, these log types are exported to CloudWatch Logs.
    */
  var LogTypesToDisable: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * Log types that are in the process of being deactivated. After they are deactivated, these log types aren't exported to CloudWatch Logs.
    */
  var LogTypesToEnable: js.UndefOr[LogTypeList] = js.undefined
}
object PendingCloudwatchLogsExports {
  
  @scala.inline
  def apply(): PendingCloudwatchLogsExports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingCloudwatchLogsExports]
  }
  
  @scala.inline
  implicit class PendingCloudwatchLogsExportsMutableBuilder[Self <: PendingCloudwatchLogsExports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogTypesToDisable(value: LogTypeList): Self = StObject.set(x, "LogTypesToDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypesToDisableUndefined: Self = StObject.set(x, "LogTypesToDisable", js.undefined)
    
    @scala.inline
    def setLogTypesToDisableVarargs(value: String*): Self = StObject.set(x, "LogTypesToDisable", js.Array(value :_*))
    
    @scala.inline
    def setLogTypesToEnable(value: LogTypeList): Self = StObject.set(x, "LogTypesToEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypesToEnableUndefined: Self = StObject.set(x, "LogTypesToEnable", js.undefined)
    
    @scala.inline
    def setLogTypesToEnableVarargs(value: String*): Self = StObject.set(x, "LogTypesToEnable", js.Array(value :_*))
  }
}
