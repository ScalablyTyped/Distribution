package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRuleFilter extends StObject {
  
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
  
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * This tag must exist in the object's tag set in order for the rule to apply.
    */
  var Tag: js.UndefOr[typings.awsSdk.s3Mod.Tag] = js.undefined
}
object LifecycleRuleFilter {
  
  @scala.inline
  def apply(): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
  
  @scala.inline
  implicit class LifecycleRuleFilterMutableBuilder[Self <: LifecycleRuleFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: LifecycleRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
