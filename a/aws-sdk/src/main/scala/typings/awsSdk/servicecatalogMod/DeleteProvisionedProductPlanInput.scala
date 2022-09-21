package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProvisionedProductPlanInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * If set to true, Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.IgnoreErrors] = js.undefined
  
  /**
    * The plan identifier.
    */
  var PlanId: Id
}
object DeleteProvisionedProductPlanInput {
  
  inline def apply(PlanId: Id): DeleteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(PlanId = PlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
  }
  
  extension [Self <: DeleteProvisionedProductPlanInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setIgnoreErrors(value: IgnoreErrors): Self = StObject.set(x, "IgnoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "IgnoreErrors", js.undefined)
    
    inline def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
  }
}
