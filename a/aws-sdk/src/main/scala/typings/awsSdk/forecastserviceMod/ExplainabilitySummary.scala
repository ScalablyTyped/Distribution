package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainabilitySummary extends StObject {
  
  /**
    * When the Explainability was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability.
    */
  var ExplainabilityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The configuration settings that define the granularity of time series and time points for the Explainability.
    */
  var ExplainabilityConfig: js.UndefOr[typings.awsSdk.forecastserviceMod.ExplainabilityConfig] = js.undefined
  
  /**
    * The name of the Explainability.
    */
  var ExplainabilityName: js.UndefOr[Name] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about any errors that may have occurred during the Explainability creation process.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the Explainability. States include:     ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.undefined
}
object ExplainabilitySummary {
  
  inline def apply(): ExplainabilitySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainabilitySummary]
  }
  
  extension [Self <: ExplainabilitySummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityArnUndefined: Self = StObject.set(x, "ExplainabilityArn", js.undefined)
    
    inline def setExplainabilityConfig(value: ExplainabilityConfig): Self = StObject.set(x, "ExplainabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityConfigUndefined: Self = StObject.set(x, "ExplainabilityConfig", js.undefined)
    
    inline def setExplainabilityName(value: Name): Self = StObject.set(x, "ExplainabilityName", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityNameUndefined: Self = StObject.set(x, "ExplainabilityName", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
