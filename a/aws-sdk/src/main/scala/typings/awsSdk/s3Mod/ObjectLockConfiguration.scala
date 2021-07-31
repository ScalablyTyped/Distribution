package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLockConfiguration extends StObject {
  
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled.
    */
  var ObjectLockEnabled: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockEnabled] = js.undefined
  
  /**
    * The Object Lock rule in place for the specified object.
    */
  var Rule: js.UndefOr[ObjectLockRule] = js.undefined
}
object ObjectLockConfiguration {
  
  @scala.inline
  def apply(): ObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockConfiguration]
  }
  
  @scala.inline
  implicit class ObjectLockConfigurationMutableBuilder[Self <: ObjectLockConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectLockEnabled(value: ObjectLockEnabled): Self = StObject.set(x, "ObjectLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockEnabledUndefined: Self = StObject.set(x, "ObjectLockEnabled", js.undefined)
    
    @scala.inline
    def setRule(value: ObjectLockRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
