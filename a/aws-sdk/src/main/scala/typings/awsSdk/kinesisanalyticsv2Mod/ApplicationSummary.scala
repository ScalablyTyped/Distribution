package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationStatus
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId
  
  /**
    * The runtime environment for the application (SQL-1.0, FLINK-1_6, or FLINK-1_8).
    */
  var RuntimeEnvironment: typings.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment
}
object ApplicationSummary {
  
  inline def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  extension [Self <: ApplicationSummary](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "RuntimeEnvironment", value.asInstanceOf[js.Any])
  }
}
