package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDetail extends StObject {
  
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  var ChoiceId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ChoiceId] = js.undefined
  
  /**
    * Trusted Advisor check description.
    */
  var Description: js.UndefOr[CheckDescription] = js.undefined
  
  /**
    * Count of flagged resources associated to the check.
    */
  var FlaggedResources: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.FlaggedResources] = js.undefined
  
  /**
    * Trusted Advisor check ID.
    */
  var Id: js.UndefOr[CheckId] = js.undefined
  
  /**
    * Well-Architected Lens ARN associated to the check.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  /**
    * Trusted Advisor check name.
    */
  var Name: js.UndefOr[CheckName] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarId] = js.undefined
  
  /**
    * Provider of the check related to the best practice.
    */
  var Provider: js.UndefOr[CheckProvider] = js.undefined
  
  var QuestionId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionId] = js.undefined
  
  /**
    * Reason associated to the check.
    */
  var Reason: js.UndefOr[CheckFailureReason] = js.undefined
  
  /**
    * Status associated to the check.
    */
  var Status: js.UndefOr[CheckStatus] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object CheckDetail {
  
  inline def apply(): CheckDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckDetail] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "ChoiceId", js.undefined)
    
    inline def setDescription(value: CheckDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFlaggedResources(value: FlaggedResources): Self = StObject.set(x, "FlaggedResources", value.asInstanceOf[js.Any])
    
    inline def setFlaggedResourcesUndefined: Self = StObject.set(x, "FlaggedResources", js.undefined)
    
    inline def setId(value: CheckId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setName(value: CheckName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setProvider(value: CheckProvider): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "QuestionId", js.undefined)
    
    inline def setReason(value: CheckFailureReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: CheckStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
