package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.undefined
  
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typings.awsSdk.mqMod.BrokerState] = js.undefined
  
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsSdk.mqMod.DeploymentMode] = js.undefined
  
  /**
    * Required. The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.undefined
  
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
}
object BrokerSummary {
  
  inline def apply(): BrokerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSummary]
  }
  
  extension [Self <: BrokerSummary](x: Self) {
    
    inline def setBrokerArn(value: string): Self = StObject.set(x, "BrokerArn", value.asInstanceOf[js.Any])
    
    inline def setBrokerArnUndefined: Self = StObject.set(x, "BrokerArn", js.undefined)
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    inline def setBrokerName(value: string): Self = StObject.set(x, "BrokerName", value.asInstanceOf[js.Any])
    
    inline def setBrokerNameUndefined: Self = StObject.set(x, "BrokerName", js.undefined)
    
    inline def setBrokerState(value: BrokerState): Self = StObject.set(x, "BrokerState", value.asInstanceOf[js.Any])
    
    inline def setBrokerStateUndefined: Self = StObject.set(x, "BrokerState", js.undefined)
    
    inline def setCreated(value: timestampIso8601): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDeploymentMode(value: DeploymentMode): Self = StObject.set(x, "DeploymentMode", value.asInstanceOf[js.Any])
    
    inline def setDeploymentModeUndefined: Self = StObject.set(x, "DeploymentMode", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
  }
}
