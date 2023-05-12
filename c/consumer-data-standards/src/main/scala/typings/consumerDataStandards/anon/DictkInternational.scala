package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.LIMITED
import typings.consumerDataStandards.consumerDataStandardsStrings.METERED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNMETERED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNSUPPORTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkInternational
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * International voice calls
    */
  var international: js.UndefOr[DescriptionDuration] = js.undefined
  
  /**
    * National voice calls
    */
  var national: js.UndefOr[DescriptionDuration] = js.undefined
  
  /**
    * Plan type for this feature. METERED: A plan is charged by usage for the feature. UNMETERED: A plan with no limits for a feature. LIMITED: Where plan limit inclusions apply. UNSUPPORTED: Feature is not supported
    */
  var planType: METERED | UNMETERED | LIMITED | UNSUPPORTED
  
  /**
    * Roaming voice calls
    */
  var roaming: js.UndefOr[DescriptionDuration] = js.undefined
}
object DictkInternational {
  
  inline def apply(planType: METERED | UNMETERED | LIMITED | UNSUPPORTED): DictkInternational = {
    val __obj = js.Dynamic.literal(planType = planType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkInternational]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkInternational] (val x: Self) extends AnyVal {
    
    inline def setInternational(value: DescriptionDuration): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setNational(value: DescriptionDuration): Self = StObject.set(x, "national", value.asInstanceOf[js.Any])
    
    inline def setNationalUndefined: Self = StObject.set(x, "national", js.undefined)
    
    inline def setPlanType(value: METERED | UNMETERED | LIMITED | UNSUPPORTED): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: DescriptionDuration): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
    
    inline def setRoamingUndefined: Self = StObject.set(x, "roaming", js.undefined)
  }
}
