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
  def apply(kendraIndex: KendraIndexArn, role: roleArn): KendraConfiguration = {
    val __obj = js.Dynamic.literal(kendraIndex = kendraIndex.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[KendraConfiguration]
  }
  @scala.inline
  implicit class KendraConfigurationOps[Self <: KendraConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKendraIndex(value: KendraIndexArn): Self = this.set("kendraIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: roleArn): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryFilterString(value: QueryFilterString): Self = this.set("queryFilterString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryFilterString: Self = this.set("queryFilterString", js.undefined)
  }
  
}

