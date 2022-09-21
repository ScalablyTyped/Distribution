package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLockConfiguration extends StObject {
  
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled. Enable ObjectLockEnabled when you apply ObjectLockConfiguration to a bucket. 
    */
  var ObjectLockEnabled: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockEnabled] = js.undefined
  
  /**
    * Specifies the Object Lock rule for the specified object. Enable the this rule when you apply ObjectLockConfiguration to a bucket. Bucket settings require both a mode and a period. The period can be either Days or Years but you must select one. You cannot specify Days and Years at the same time.
    */
  var Rule: js.UndefOr[ObjectLockRule] = js.undefined
}
object ObjectLockConfiguration {
  
  inline def apply(): ObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockConfiguration]
  }
  
  extension [Self <: ObjectLockConfiguration](x: Self) {
    
    inline def setObjectLockEnabled(value: ObjectLockEnabled): Self = StObject.set(x, "ObjectLockEnabled", value.asInstanceOf[js.Any])
    
    inline def setObjectLockEnabledUndefined: Self = StObject.set(x, "ObjectLockEnabled", js.undefined)
    
    inline def setRule(value: ObjectLockRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
