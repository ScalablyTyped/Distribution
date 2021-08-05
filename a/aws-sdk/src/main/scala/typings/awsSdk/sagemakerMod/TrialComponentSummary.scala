package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentSummary extends StObject {
  
  /**
    * Who created the component.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the component was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the component as displayed. If DisplayName isn't specified, TrialComponentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * When the component ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Who last modified the component.
    */
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the component was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * When the component started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the component. States include:   InProgress   Completed   Failed  
    */
  var Status: js.UndefOr[TrialComponentStatus] = js.undefined
  
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.undefined
  
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  var TrialComponentSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSource] = js.undefined
}
object TrialComponentSummary {
  
  inline def apply(): TrialComponentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSummary]
  }
  
  extension [Self <: TrialComponentSummary](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: TrialComponentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
    
    inline def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentNameUndefined: Self = StObject.set(x, "TrialComponentName", js.undefined)
    
    inline def setTrialComponentSource(value: TrialComponentSource): Self = StObject.set(x, "TrialComponentSource", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentSourceUndefined: Self = StObject.set(x, "TrialComponentSource", js.undefined)
  }
}
