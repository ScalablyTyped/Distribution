package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackProperty extends StObject {
  
  /**
    * The type of distributed denial of service (DDoS) event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
    */
  var AttackLayer: js.UndefOr[typings.awsSdk.shieldMod.AttackLayer] = js.undefined
  
  /**
    * Defines the DDoS attack property information that is provided. The WORDPRESS_PINGBACK_REFLECTOR and WORDPRESS_PINGBACK_SOURCE values are valid only for WordPress reflective pingback DDoS attacks.
    */
  var AttackPropertyIdentifier: js.UndefOr[typings.awsSdk.shieldMod.AttackPropertyIdentifier] = js.undefined
  
  /**
    * The array of contributor objects that includes the top five contributors to an attack. 
    */
  var TopContributors: js.UndefOr[typings.awsSdk.shieldMod.TopContributors] = js.undefined
  
  /**
    * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
    */
  var Total: js.UndefOr[Long] = js.undefined
  
  /**
    * The unit of the Value of the contributions.
    */
  var Unit: js.UndefOr[typings.awsSdk.shieldMod.Unit] = js.undefined
}
object AttackProperty {
  
  inline def apply(): AttackProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackProperty]
  }
  
  extension [Self <: AttackProperty](x: Self) {
    
    inline def setAttackLayer(value: AttackLayer): Self = StObject.set(x, "AttackLayer", value.asInstanceOf[js.Any])
    
    inline def setAttackLayerUndefined: Self = StObject.set(x, "AttackLayer", js.undefined)
    
    inline def setAttackPropertyIdentifier(value: AttackPropertyIdentifier): Self = StObject.set(x, "AttackPropertyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAttackPropertyIdentifierUndefined: Self = StObject.set(x, "AttackPropertyIdentifier", js.undefined)
    
    inline def setTopContributors(value: TopContributors): Self = StObject.set(x, "TopContributors", value.asInstanceOf[js.Any])
    
    inline def setTopContributorsUndefined: Self = StObject.set(x, "TopContributors", js.undefined)
    
    inline def setTopContributorsVarargs(value: Contributor*): Self = StObject.set(x, "TopContributors", js.Array(value :_*))
    
    inline def setTotal(value: Long): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
