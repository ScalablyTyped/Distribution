package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScoreDetails extends StObject {
  
  /**
    * An object that contains details about adjustment Amazon Inspector made to the CVSS score.
    */
  var adjustments: js.UndefOr[CvssScoreAdjustmentList] = js.undefined
  
  /**
    * The source of the CVSS data.
    */
  var cvssSource: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The CVSS score.
    */
  var score: Double
  
  /**
    * The source for the CVSS score.
    */
  var scoreSource: NonEmptyString
  
  /**
    * The vector for the CVSS score.
    */
  var scoringVector: NonEmptyString
  
  /**
    * The CVSS version used in scoring.
    */
  var version: NonEmptyString
}
object CvssScoreDetails {
  
  inline def apply(score: Double, scoreSource: NonEmptyString, scoringVector: NonEmptyString, version: NonEmptyString): CvssScoreDetails = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], scoreSource = scoreSource.asInstanceOf[js.Any], scoringVector = scoringVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CvssScoreDetails]
  }
  
  extension [Self <: CvssScoreDetails](x: Self) {
    
    inline def setAdjustments(value: CvssScoreAdjustmentList): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentsUndefined: Self = StObject.set(x, "adjustments", js.undefined)
    
    inline def setAdjustmentsVarargs(value: CvssScoreAdjustment*): Self = StObject.set(x, "adjustments", js.Array(value*))
    
    inline def setCvssSource(value: NonEmptyString): Self = StObject.set(x, "cvssSource", value.asInstanceOf[js.Any])
    
    inline def setCvssSourceUndefined: Self = StObject.set(x, "cvssSource", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreSource(value: NonEmptyString): Self = StObject.set(x, "scoreSource", value.asInstanceOf[js.Any])
    
    inline def setScoringVector(value: NonEmptyString): Self = StObject.set(x, "scoringVector", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
