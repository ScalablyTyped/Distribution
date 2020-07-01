package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KendraConfiguration extends js.Object {
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
  def apply(kendraIndex: KendraIndexArn, role: roleArn, queryFilterString: QueryFilterString = null): KendraConfiguration = {
    val __obj = js.Dynamic.literal(kendraIndex = kendraIndex.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (queryFilterString != null) __obj.updateDynamic("queryFilterString")(queryFilterString.asInstanceOf[js.Any])
    __obj.asInstanceOf[KendraConfiguration]
  }
}

