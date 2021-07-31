package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRuleFilter extends StObject {
  
  /**
    * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter. For example:    If you specify both a Prefix and a Tag filter, wrap these filters in an And tag.   If you specify a filter based on multiple tags, wrap the Tag elements in an And tag.  
    */
  var And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
  
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.undefined
  
  /**
    * A container for specifying a tag key and value.  The rule applies only to objects that have the tag in their tag set.
    */
  var Tag: js.UndefOr[typings.awsSdk.s3Mod.Tag] = js.undefined
}
object ReplicationRuleFilter {
  
  @scala.inline
  def apply(): ReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleFilter]
  }
  
  @scala.inline
  implicit class ReplicationRuleFilterMutableBuilder[Self <: ReplicationRuleFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: ReplicationRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
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
