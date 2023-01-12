package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckSummary extends StObject {
  
  /**
    * Account summary associated to the check.
    */
  var AccountSummary: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.AccountSummary] = js.undefined
  
  var ChoiceId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ChoiceId] = js.undefined
  
  /**
    * Trusted Advisor check description.
    */
  var Description: js.UndefOr[CheckDescription] = js.undefined
  
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
    * Status associated to the check.
    */
  var Status: js.UndefOr[CheckStatus] = js.undefined
  
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object CheckSummary {
  
  inline def apply(): CheckSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckSummary] (val x: Self) extends AnyVal {
    
    inline def setAccountSummary(value: AccountSummary): Self = StObject.set(x, "AccountSummary", value.asInstanceOf[js.Any])
    
    inline def setAccountSummaryUndefined: Self = StObject.set(x, "AccountSummary", js.undefined)
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "ChoiceId", js.undefined)
    
    inline def setDescription(value: CheckDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
    
    inline def setStatus(value: CheckStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
