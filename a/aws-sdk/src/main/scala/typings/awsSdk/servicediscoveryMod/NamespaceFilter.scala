package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceFilter extends StObject {
  
  /**
    * The operator that you want to use to determine whether ListNamespaces returns a namespace. Valid values for condition include:    EQ: When you specify EQ for the condition, you can choose to list only public namespaces or private namespaces, but not both. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can choose to list public namespaces, private namespaces, or both.     BETWEEN: Not applicable  
    */
  var Condition: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    * Specify TYPE.
    */
  var Name: NamespaceFilterName
  
  /**
    * If you specify EQ for Condition, specify either DNS_PUBLIC or DNS_PRIVATE. If you specify IN for Condition, you can specify DNS_PUBLIC, DNS_PRIVATE, or both.
    */
  var Values: FilterValues
}
object NamespaceFilter {
  
  @scala.inline
  def apply(Name: NamespaceFilterName, Values: FilterValues): NamespaceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceFilter]
  }
  
  @scala.inline
  implicit class NamespaceFilterMutableBuilder[Self <: NamespaceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: FilterCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setName(value: NamespaceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
