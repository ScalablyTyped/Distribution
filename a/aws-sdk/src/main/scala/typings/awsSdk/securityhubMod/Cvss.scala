package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvss extends StObject {
  
  /**
    * Adjustments to the CVSS metrics.
    */
  var Adjustments: js.UndefOr[AdjustmentList] = js.undefined
  
  /**
    * The base CVSS score.
    */
  var BaseScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The base scoring vector for the CVSS score.
    */
  var BaseVector: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The origin of the original CVSS score and vector.
    */
  var Source: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of CVSS for the CVSS score.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object Cvss {
  
  inline def apply(): Cvss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvss]
  }
  
  extension [Self <: Cvss](x: Self) {
    
    inline def setAdjustments(value: AdjustmentList): Self = StObject.set(x, "Adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "Adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: Adjustment*): Self = StObject.set(x, "Adjustments", js.Array(value*))
    
    inline def setBaseScore(value: Double): Self = StObject.set(x, "BaseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "BaseScore", js.undefined)
    
    inline def setBaseVector(value: NonEmptyString): Self = StObject.set(x, "BaseVector", value.asInstanceOf[js.Any])
    
    inline def setBaseVectorUndefined: Self = StObject.set(x, "BaseVector", js.undefined)
    
    inline def setSource(value: NonEmptyString): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
