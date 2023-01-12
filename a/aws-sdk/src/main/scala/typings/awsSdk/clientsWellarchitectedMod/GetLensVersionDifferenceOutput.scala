package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensVersionDifferenceOutput extends StObject {
  
  /**
    * The base version of the lens.
    */
  var BaseLensVersion: js.UndefOr[LensVersion] = js.undefined
  
  /**
    * The latest version of the lens.
    */
  var LatestLensVersion: js.UndefOr[LensVersion] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  /**
    * The target lens version for the lens.
    */
  var TargetLensVersion: js.UndefOr[LensVersion] = js.undefined
  
  var VersionDifferences: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.VersionDifferences] = js.undefined
}
object GetLensVersionDifferenceOutput {
  
  inline def apply(): GetLensVersionDifferenceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLensVersionDifferenceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLensVersionDifferenceOutput] (val x: Self) extends AnyVal {
    
    inline def setBaseLensVersion(value: LensVersion): Self = StObject.set(x, "BaseLensVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseLensVersionUndefined: Self = StObject.set(x, "BaseLensVersion", js.undefined)
    
    inline def setLatestLensVersion(value: LensVersion): Self = StObject.set(x, "LatestLensVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestLensVersionUndefined: Self = StObject.set(x, "LatestLensVersion", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setTargetLensVersion(value: LensVersion): Self = StObject.set(x, "TargetLensVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetLensVersionUndefined: Self = StObject.set(x, "TargetLensVersion", js.undefined)
    
    inline def setVersionDifferences(value: VersionDifferences): Self = StObject.set(x, "VersionDifferences", value.asInstanceOf[js.Any])
    
    inline def setVersionDifferencesUndefined: Self = StObject.set(x, "VersionDifferences", js.undefined)
  }
}
