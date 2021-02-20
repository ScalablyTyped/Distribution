package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KendraConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to search. The index must be in the same account and Region as the Amazon Lex bot. If the Amazon Kendra index does not exist, you get an exception when you call the PutIntent operation.
    */
  var kendraIndex: KendraIndexArn = js.native
  
  /**
    * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from the query. The filter is in the format defined by Amazon Kendra. For more information, see Filtering queries. You can override this filter string with a new filter string at runtime.
    */
  var queryFilterString: js.UndefOr[QueryFilterString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permission to search the Amazon Kendra index. The role must be in the same account and Region as the Amazon Lex bot. If the role does not exist, you get an exception when you call the PutIntent operation.
    */
  var role: roleArn = js.native
}
object KendraConfiguration {
  
  @scala.inline
  def apply(kendraIndex: KendraIndexArn, role: roleArn): KendraConfiguration = {
    val __obj = js.Dynamic.literal(kendraIndex = kendraIndex.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[KendraConfiguration]
  }
  
  @scala.inline
  implicit class KendraConfigurationMutableBuilder[Self <: KendraConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKendraIndex(value: KendraIndexArn): Self = StObject.set(x, "kendraIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFilterString(value: QueryFilterString): Self = StObject.set(x, "queryFilterString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFilterStringUndefined: Self = StObject.set(x, "queryFilterString", js.undefined)
    
    @scala.inline
    def setRole(value: roleArn): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
