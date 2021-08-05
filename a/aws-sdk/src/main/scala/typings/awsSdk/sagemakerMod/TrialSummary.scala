package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialSummary extends StObject {
  
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * When the trial was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.undefined
  
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  var TrialSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialSource] = js.undefined
}
object TrialSummary {
  
  inline def apply(): TrialSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialSummary]
  }
  
  extension [Self <: TrialSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    inline def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
    
    inline def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    inline def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
    
    inline def setTrialSource(value: TrialSource): Self = StObject.set(x, "TrialSource", value.asInstanceOf[js.Any])
    
    inline def setTrialSourceUndefined: Self = StObject.set(x, "TrialSource", js.undefined)
  }
}
