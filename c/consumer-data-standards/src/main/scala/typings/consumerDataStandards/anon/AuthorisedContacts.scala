package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorisedContacts
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
    * Detail on the plan applicable to this account
    */
  var planDetail: ElectricityContract
  
  var planOverview: DisplayName
  
  /**
    * An array of servicePointIds, representing NMIs, that this account is linked to
    */
  var servicePointIds: js.Array[String]
}
object AuthorisedContacts {
  
  inline def apply(planDetail: ElectricityContract, planOverview: DisplayName, servicePointIds: js.Array[String]): AuthorisedContacts = {
    val __obj = js.Dynamic.literal(planDetail = planDetail.asInstanceOf[js.Any], planOverview = planOverview.asInstanceOf[js.Any], servicePointIds = servicePointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorisedContacts]
  }
  
  extension [Self <: AuthorisedContacts](x: Self) {
    
    inline def setAuthorisedContacts(value: js.Array[LastName]): Self = StObject.set(x, "authorisedContacts", value.asInstanceOf[js.Any])
    
    inline def setAuthorisedContactsUndefined: Self = StObject.set(x, "authorisedContacts", js.undefined)
    
    inline def setAuthorisedContactsVarargs(value: LastName*): Self = StObject.set(x, "authorisedContacts", js.Array(value*))
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPlanDetail(value: ElectricityContract): Self = StObject.set(x, "planDetail", value.asInstanceOf[js.Any])
    
    inline def setPlanOverview(value: DisplayName): Self = StObject.set(x, "planOverview", value.asInstanceOf[js.Any])
    
    inline def setServicePointIds(value: js.Array[String]): Self = StObject.set(x, "servicePointIds", value.asInstanceOf[js.Any])
    
    inline def setServicePointIdsVarargs(value: String*): Self = StObject.set(x, "servicePointIds", js.Array(value*))
  }
}
