package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BehaviorModelTrainingSummary extends StObject {
  
  /**
    *  The name of the behavior. 
    */
  var behaviorName: js.UndefOr[BehaviorName] = js.undefined
  
  /**
    *  The percentage of datapoints collected. 
    */
  var datapointsCollectionPercentage: js.UndefOr[DataCollectionPercentage] = js.undefined
  
  /**
    *  The date the model was last refreshed. 
    */
  var lastModelRefreshDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of the behavior model. 
    */
  var modelStatus: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    *  The name of the security profile. 
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    *  The date a training model started collecting data. 
    */
  var trainingDataCollectionStartDate: js.UndefOr[js.Date] = js.undefined
}
object BehaviorModelTrainingSummary {
  
  inline def apply(): BehaviorModelTrainingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BehaviorModelTrainingSummary]
  }
  
  extension [Self <: BehaviorModelTrainingSummary](x: Self) {
    
    inline def setBehaviorName(value: BehaviorName): Self = StObject.set(x, "behaviorName", value.asInstanceOf[js.Any])
    
    inline def setBehaviorNameUndefined: Self = StObject.set(x, "behaviorName", js.undefined)
    
    inline def setDatapointsCollectionPercentage(value: DataCollectionPercentage): Self = StObject.set(x, "datapointsCollectionPercentage", value.asInstanceOf[js.Any])
    
    inline def setDatapointsCollectionPercentageUndefined: Self = StObject.set(x, "datapointsCollectionPercentage", js.undefined)
    
    inline def setLastModelRefreshDate(value: js.Date): Self = StObject.set(x, "lastModelRefreshDate", value.asInstanceOf[js.Any])
    
    inline def setLastModelRefreshDateUndefined: Self = StObject.set(x, "lastModelRefreshDate", js.undefined)
    
    inline def setModelStatus(value: ModelStatus): Self = StObject.set(x, "modelStatus", value.asInstanceOf[js.Any])
    
    inline def setModelStatusUndefined: Self = StObject.set(x, "modelStatus", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setTrainingDataCollectionStartDate(value: js.Date): Self = StObject.set(x, "trainingDataCollectionStartDate", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataCollectionStartDateUndefined: Self = StObject.set(x, "trainingDataCollectionStartDate", js.undefined)
  }
}
