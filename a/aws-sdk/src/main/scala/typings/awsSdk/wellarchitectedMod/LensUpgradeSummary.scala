package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensUpgradeSummary extends StObject {
  
  /**
    * The current version of the lens.
    */
  var CurrentLensVersion: js.UndefOr[LensVersion] = js.undefined
  
  /**
    * The latest version of the lens.
    */
  var LatestLensVersion: js.UndefOr[LensVersion] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadName: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadName] = js.undefined
}
object LensUpgradeSummary {
  
  inline def apply(): LensUpgradeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LensUpgradeSummary]
  }
  
  extension [Self <: LensUpgradeSummary](x: Self) {
    
    inline def setCurrentLensVersion(value: LensVersion): Self = StObject.set(x, "CurrentLensVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentLensVersionUndefined: Self = StObject.set(x, "CurrentLensVersion", js.undefined)
    
    inline def setLatestLensVersion(value: LensVersion): Self = StObject.set(x, "LatestLensVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestLensVersionUndefined: Self = StObject.set(x, "LatestLensVersion", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
