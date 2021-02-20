package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatePrincipalWithPortfolioInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: typings.awsSdk.servicecatalogMod.PrincipalARN = js.native
  
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: typings.awsSdk.servicecatalogMod.PrincipalType = js.native
}
object AssociatePrincipalWithPortfolioInput {
  
  @scala.inline
  def apply(PortfolioId: Id, PrincipalARN: PrincipalARN, PrincipalType: PrincipalType): AssociatePrincipalWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], PrincipalARN = PrincipalARN.asInstanceOf[js.Any], PrincipalType = PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
  }
  
  @scala.inline
  implicit class AssociatePrincipalWithPortfolioInputMutableBuilder[Self <: AssociatePrincipalWithPortfolioInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalARN(value: PrincipalARN): Self = StObject.set(x, "PrincipalARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
  }
}
