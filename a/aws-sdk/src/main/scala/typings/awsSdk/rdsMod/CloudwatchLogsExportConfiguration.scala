package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchLogsExportConfiguration extends StObject {
  
  /**
    * The list of log types to disable.
    */
  var DisableLogTypes: js.UndefOr[LogTypeList] = js.native
  
  /**
    * The list of log types to enable.
    */
  var EnableLogTypes: js.UndefOr[LogTypeList] = js.native
}
object CloudwatchLogsExportConfiguration {
  
  @scala.inline
  def apply(): CloudwatchLogsExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
  }
  
  @scala.inline
  implicit class CloudwatchLogsExportConfigurationMutableBuilder[Self <: CloudwatchLogsExportConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableLogTypes(value: LogTypeList): Self = StObject.set(x, "DisableLogTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLogTypesUndefined: Self = StObject.set(x, "DisableLogTypes", js.undefined)
    
    @scala.inline
    def setDisableLogTypesVarargs(value: String*): Self = StObject.set(x, "DisableLogTypes", js.Array(value :_*))
    
    @scala.inline
    def setEnableLogTypes(value: LogTypeList): Self = StObject.set(x, "EnableLogTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLogTypesUndefined: Self = StObject.set(x, "EnableLogTypes", js.undefined)
    
    @scala.inline
    def setEnableLogTypesVarargs(value: String*): Self = StObject.set(x, "EnableLogTypes", js.Array(value :_*))
  }
}
