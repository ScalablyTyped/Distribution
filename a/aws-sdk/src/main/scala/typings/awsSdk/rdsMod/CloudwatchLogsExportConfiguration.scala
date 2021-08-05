package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchLogsExportConfiguration extends StObject {
  
  /**
    * The list of log types to disable.
    */
  var DisableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * The list of log types to enable.
    */
  var EnableLogTypes: js.UndefOr[LogTypeList] = js.undefined
}
object CloudwatchLogsExportConfiguration {
  
  inline def apply(): CloudwatchLogsExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
  }
  
  extension [Self <: CloudwatchLogsExportConfiguration](x: Self) {
    
    inline def setDisableLogTypes(value: LogTypeList): Self = StObject.set(x, "DisableLogTypes", value.asInstanceOf[js.Any])
    
    inline def setDisableLogTypesUndefined: Self = StObject.set(x, "DisableLogTypes", js.undefined)
    
    inline def setDisableLogTypesVarargs(value: String*): Self = StObject.set(x, "DisableLogTypes", js.Array(value :_*))
    
    inline def setEnableLogTypes(value: LogTypeList): Self = StObject.set(x, "EnableLogTypes", value.asInstanceOf[js.Any])
    
    inline def setEnableLogTypesUndefined: Self = StObject.set(x, "EnableLogTypes", js.undefined)
    
    inline def setEnableLogTypesVarargs(value: String*): Self = StObject.set(x, "EnableLogTypes", js.Array(value :_*))
  }
}
