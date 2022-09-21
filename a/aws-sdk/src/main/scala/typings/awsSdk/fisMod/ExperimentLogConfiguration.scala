package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentLogConfiguration extends StObject {
  
  /**
    * The configuration for experiment logging to Amazon CloudWatch Logs.
    */
  var cloudWatchLogsConfiguration: js.UndefOr[ExperimentCloudWatchLogsLogConfiguration] = js.undefined
  
  /**
    * The schema version.
    */
  var logSchemaVersion: js.UndefOr[LogSchemaVersion] = js.undefined
  
  /**
    * The configuration for experiment logging to Amazon S3.
    */
  var s3Configuration: js.UndefOr[ExperimentS3LogConfiguration] = js.undefined
}
object ExperimentLogConfiguration {
  
  inline def apply(): ExperimentLogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentLogConfiguration]
  }
  
  extension [Self <: ExperimentLogConfiguration](x: Self) {
    
    inline def setCloudWatchLogsConfiguration(value: ExperimentCloudWatchLogsLogConfiguration): Self = StObject.set(x, "cloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "cloudWatchLogsConfiguration", js.undefined)
    
    inline def setLogSchemaVersion(value: LogSchemaVersion): Self = StObject.set(x, "logSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setLogSchemaVersionUndefined: Self = StObject.set(x, "logSchemaVersion", js.undefined)
    
    inline def setS3Configuration(value: ExperimentS3LogConfiguration): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
  }
}
