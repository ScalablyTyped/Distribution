package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRuleFilter extends StObject {
  
  /**
    * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter. For example:    If you specify both a Prefix and a Tag filter, wrap these filters in an And tag.   If you specify a filter based on multiple tags, wrap the Tag elements in an And tag.  
    */
  var And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
  
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var Prefix: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * A container for specifying a tag key and value.  The rule applies only to objects that have the tag in their tag set.
    */
  var Tag: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Tag] = js.undefined
}
object ReplicationRuleFilter {
  
  inline def apply(): ReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRuleFilter] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: ReplicationRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
