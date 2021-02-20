package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportFilter extends StObject {
  
  /**
    * Supported condition: EQUALS 
    */
  var condition: Condition = js.native
  
  /**
    * A single ExportFilter name. Supported filters: agentId.
    */
  var name: FilterName = js.native
  
  /**
    * A single agentId for a Discovery Agent. An agentId can be found using the DescribeAgents action. Typically an ADS agentId is in the form o-0123456789abcdef0.
    */
  var values: FilterValues = js.native
}
object ExportFilter {
  
  @scala.inline
  def apply(condition: Condition, name: FilterName, values: FilterValues): ExportFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFilter]
  }
  
  @scala.inline
  implicit class ExportFilterMutableBuilder[Self <: ExportFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
