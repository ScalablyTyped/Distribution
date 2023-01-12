package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeConfig extends StObject {
  
  /**
    * Determines how long a challenge timestamp in the token remains valid after the client successfully responds to a challenge. 
    */
  var ImmunityTimeProperty: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ImmunityTimeProperty] = js.undefined
}
object ChallengeConfig {
  
  inline def apply(): ChallengeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChallengeConfig] (val x: Self) extends AnyVal {
    
    inline def setImmunityTimeProperty(value: ImmunityTimeProperty): Self = StObject.set(x, "ImmunityTimeProperty", value.asInstanceOf[js.Any])
    
    inline def setImmunityTimePropertyUndefined: Self = StObject.set(x, "ImmunityTimeProperty", js.undefined)
  }
}
