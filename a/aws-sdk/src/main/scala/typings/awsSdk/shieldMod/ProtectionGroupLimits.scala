package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionGroupLimits extends StObject {
  
  /**
    * The maximum number of protection groups that you can have at one time. 
    */
  var MaxProtectionGroups: Long
  
  /**
    * Limits settings by pattern type in the protection groups for your subscription. 
    */
  var PatternTypeLimits: ProtectionGroupPatternTypeLimits
}
object ProtectionGroupLimits {
  
  @scala.inline
  def apply(MaxProtectionGroups: Long, PatternTypeLimits: ProtectionGroupPatternTypeLimits): ProtectionGroupLimits = {
    val __obj = js.Dynamic.literal(MaxProtectionGroups = MaxProtectionGroups.asInstanceOf[js.Any], PatternTypeLimits = PatternTypeLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroupLimits]
  }
  
  @scala.inline
  implicit class ProtectionGroupLimitsMutableBuilder[Self <: ProtectionGroupLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxProtectionGroups(value: Long): Self = StObject.set(x, "MaxProtectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTypeLimits(value: ProtectionGroupPatternTypeLimits): Self = StObject.set(x, "PatternTypeLimits", value.asInstanceOf[js.Any])
  }
}
