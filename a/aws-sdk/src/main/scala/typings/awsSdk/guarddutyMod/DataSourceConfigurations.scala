package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfigurations extends StObject {
  
  /**
    * Describes whether S3 data event logs are enabled as a data source.
    */
  var S3Logs: js.UndefOr[S3LogsConfiguration] = js.undefined
}
object DataSourceConfigurations {
  
  @scala.inline
  def apply(): DataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfigurations]
  }
  
  @scala.inline
  implicit class DataSourceConfigurationsMutableBuilder[Self <: DataSourceConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Logs(value: S3LogsConfiguration): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
