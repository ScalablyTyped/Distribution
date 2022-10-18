package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * An array of additional contacts that are authorised to act on this account
    */
  var authorisedContacts: js.UndefOr[js.Array[LastName]] = js.undefined
  
  /**
    * Optional display name for the plan provided by the customer to help differentiate multiple plans
    */
  var nickname: js.UndefOr[String] = js.undefined
  
  /**
    * Detail on the plan applicable to this account. Mandatory if openStatus is OPEN
    */
  var planDetail: js.UndefOr[ElectricityContract] = js.undefined
  
  /**
    * Mandatory if openStatus is OPEN
    */
  var planOverview: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * An array of servicePointIds, representing NMIs, that this account is linked to
    */
  var servicePointIds: js.Array[String]
}
object PlanDetail {
  
  inline def apply(servicePointIds: js.Array[String]): PlanDetail = {
    val __obj = js.Dynamic.literal(servicePointIds = servicePointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDetail]
  }
  
  extension [Self <: PlanDetail](x: Self) {
    
    inline def setAuthorisedContacts(value: js.Array[LastName]): Self = StObject.set(x, "authorisedContacts", value.asInstanceOf[js.Any])
    
    inline def setAuthorisedContactsUndefined: Self = StObject.set(x, "authorisedContacts", js.undefined)
    
    inline def setAuthorisedContactsVarargs(value: LastName*): Self = StObject.set(x, "authorisedContacts", js.Array(value*))
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPlanDetail(value: ElectricityContract): Self = StObject.set(x, "planDetail", value.asInstanceOf[js.Any])
    
    inline def setPlanDetailUndefined: Self = StObject.set(x, "planDetail", js.undefined)
    
    inline def setPlanOverview(value: DisplayName): Self = StObject.set(x, "planOverview", value.asInstanceOf[js.Any])
    
    inline def setPlanOverviewUndefined: Self = StObject.set(x, "planOverview", js.undefined)
    
    inline def setServicePointIds(value: js.Array[String]): Self = StObject.set(x, "servicePointIds", value.asInstanceOf[js.Any])
    
    inline def setServicePointIdsVarargs(value: String*): Self = StObject.set(x, "servicePointIds", js.Array(value*))
  }
}
