package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensReview extends StObject {
  
  var LensAlias: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  var LensName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensName] = js.undefined
  
  /**
    * The status of the lens.
    */
  var LensStatus: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensStatus] = js.undefined
  
  /**
    * The version of the lens.
    */
  var LensVersion: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensVersion] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var Notes: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Notes] = js.undefined
  
  var PillarReviewSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarReviewSummaries] = js.undefined
  
  var RiskCounts: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.RiskCounts] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object LensReview {
  
  inline def apply(): LensReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LensReview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LensReview] (val x: Self) extends AnyVal {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setLensName(value: LensName): Self = StObject.set(x, "LensName", value.asInstanceOf[js.Any])
    
    inline def setLensNameUndefined: Self = StObject.set(x, "LensName", js.undefined)
    
    inline def setLensStatus(value: LensStatus): Self = StObject.set(x, "LensStatus", value.asInstanceOf[js.Any])
    
    inline def setLensStatusUndefined: Self = StObject.set(x, "LensStatus", js.undefined)
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
    
    inline def setLensVersionUndefined: Self = StObject.set(x, "LensVersion", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNotes(value: Notes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setPillarReviewSummaries(value: PillarReviewSummaries): Self = StObject.set(x, "PillarReviewSummaries", value.asInstanceOf[js.Any])
    
    inline def setPillarReviewSummariesUndefined: Self = StObject.set(x, "PillarReviewSummaries", js.undefined)
    
    inline def setPillarReviewSummariesVarargs(value: PillarReviewSummary*): Self = StObject.set(x, "PillarReviewSummaries", js.Array(value*))
    
    inline def setRiskCounts(value: RiskCounts): Self = StObject.set(x, "RiskCounts", value.asInstanceOf[js.Any])
    
    inline def setRiskCountsUndefined: Self = StObject.set(x, "RiskCounts", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
