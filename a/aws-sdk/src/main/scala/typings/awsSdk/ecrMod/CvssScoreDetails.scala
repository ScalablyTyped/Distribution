package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScoreDetails extends StObject {
  
  /**
    * An object that contains details about adjustment Amazon Inspector made to the CVSS score.
    */
  var adjustments: js.UndefOr[CvssScoreAdjustmentList] = js.undefined
  
  /**
    * The CVSS score.
    */
  var score: js.UndefOr[Score] = js.undefined
  
  /**
    * The source for the CVSS score.
    */
  var scoreSource: js.UndefOr[Source] = js.undefined
  
  /**
    * The vector for the CVSS score.
    */
  var scoringVector: js.UndefOr[ScoringVector] = js.undefined
  
  /**
    * The CVSS version used in scoring.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object CvssScoreDetails {
  
  inline def apply(): CvssScoreDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CvssScoreDetails]
  }
  
  extension [Self <: CvssScoreDetails](x: Self) {
    
    inline def setAdjustments(value: CvssScoreAdjustmentList): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: CvssScoreAdjustment*): Self = StObject.set(x, "adjustments", js.Array(value*))
    
    inline def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreSource(value: Source): Self = StObject.set(x, "scoreSource", value.asInstanceOf[js.Any])
    
    inline def setScoreSourceUndefined: Self = StObject.set(x, "scoreSource", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setScoringVector(value: ScoringVector): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setScoringVectorUndefined: Self = StObject.set(x, "scoringVector", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
