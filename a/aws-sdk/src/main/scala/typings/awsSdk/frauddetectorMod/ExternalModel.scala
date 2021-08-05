package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalModel extends StObject {
  
  /**
    * The model ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * Timestamp of when the model was last created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The input configuration.
    */
  var inputConfiguration: js.UndefOr[ModelInputConfiguration] = js.undefined
  
  /**
    * The role used to invoke the model. 
    */
  var invokeModelEndpointRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp of when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The Amazon SageMaker model endpoints.
    */
  var modelEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Fraud Detector status for the external model endpoint
    */
  var modelEndpointStatus: js.UndefOr[ModelEndpointStatus] = js.undefined
  
  /**
    * The source of the model.
    */
  var modelSource: js.UndefOr[ModelSource] = js.undefined
  
  /**
    * The output configuration.
    */
  var outputConfiguration: js.UndefOr[ModelOutputConfiguration] = js.undefined
}
object ExternalModel {
  
  inline def apply(): ExternalModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalModel]
  }
  
  extension [Self <: ExternalModel](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setInputConfiguration(value: ModelInputConfiguration): Self = StObject.set(x, "inputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurationUndefined: Self = StObject.set(x, "inputConfiguration", js.undefined)
    
    inline def setInvokeModelEndpointRoleArn(value: String): Self = StObject.set(x, "invokeModelEndpointRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInvokeModelEndpointRoleArnUndefined: Self = StObject.set(x, "invokeModelEndpointRoleArn", js.undefined)
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setModelEndpoint(value: String): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
    
    inline def setModelEndpointStatus(value: ModelEndpointStatus): Self = StObject.set(x, "modelEndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setModelEndpointStatusUndefined: Self = StObject.set(x, "modelEndpointStatus", js.undefined)
    
    inline def setModelEndpointUndefined: Self = StObject.set(x, "modelEndpoint", js.undefined)
    
    inline def setModelSource(value: ModelSource): Self = StObject.set(x, "modelSource", value.asInstanceOf[js.Any])
    
    inline def setModelSourceUndefined: Self = StObject.set(x, "modelSource", js.undefined)
    
    inline def setOutputConfiguration(value: ModelOutputConfiguration): Self = StObject.set(x, "outputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigurationUndefined: Self = StObject.set(x, "outputConfiguration", js.undefined)
  }
}
