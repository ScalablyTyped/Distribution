package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRuleFilter extends StObject {
  
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
  
  /**
    * Minimum object size to which the rule applies.
    */
  var ObjectSizeGreaterThan: js.UndefOr[ObjectSizeGreaterThanBytes] = js.undefined
  
  /**
    * Maximum object size to which the rule applies.
    */
  var ObjectSizeLessThan: js.UndefOr[ObjectSizeLessThanBytes] = js.undefined
  
  /**
    * Prefix identifying one or more objects to which the rule applies.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var Prefix: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * This tag must exist in the object's tag set in order for the rule to apply.
    */
  var Tag: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Tag] = js.undefined
}
object LifecycleRuleFilter {
  
  inline def apply(): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleRuleFilter] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: LifecycleRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setObjectSizeGreaterThan(value: ObjectSizeGreaterThanBytes): Self = StObject.set(x, "ObjectSizeGreaterThan", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeGreaterThanUndefined: Self = StObject.set(x, "ObjectSizeGreaterThan", js.undefined)
    
    inline def setObjectSizeLessThan(value: ObjectSizeLessThanBytes): Self = StObject.set(x, "ObjectSizeLessThan", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeLessThanUndefined: Self = StObject.set(x, "ObjectSizeLessThan", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
