package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkNickname
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional display name for the plan provided by the customer to help differentiate multiple plans
    */
  var nickname: js.UndefOr[String] = js.undefined
  
  /**
    * Mandatory if openStatus is OPEN
    */
  var planOverview: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * An array of servicePointIds, representing NMIs, that this plan is linked to.  If there are no service points allocated to this plan then an empty array would be expected
    */
  var servicePointIds: js.Array[String]
}
object DictkNickname {
  
  inline def apply(servicePointIds: js.Array[String]): DictkNickname = {
    val __obj = js.Dynamic.literal(servicePointIds = servicePointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkNickname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkNickname] (val x: Self) extends AnyVal {
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPlanOverview(value: DisplayName): Self = StObject.set(x, "planOverview", value.asInstanceOf[js.Any])
    
    inline def setPlanOverviewUndefined: Self = StObject.set(x, "planOverview", js.undefined)
    
    inline def setServicePointIds(value: js.Array[String]): Self = StObject.set(x, "servicePointIds", value.asInstanceOf[js.Any])
    
    inline def setServicePointIdsVarargs(value: String*): Self = StObject.set(x, "servicePointIds", js.Array(value*))
  }
}
