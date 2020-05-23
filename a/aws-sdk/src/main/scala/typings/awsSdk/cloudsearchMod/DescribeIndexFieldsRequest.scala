package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexFieldsRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * A list of the index fields you want to describe. If not specified, information is returned for all configured index fields.
    */
  var FieldNames: js.UndefOr[DynamicFieldNameList] = js.native
}

object DescribeIndexFieldsRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    Deployed: js.UndefOr[Boolean] = js.undefined,
    FieldNames: DynamicFieldNameList = null
  ): DescribeIndexFieldsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.get.asInstanceOf[js.Any])
    if (FieldNames != null) __obj.updateDynamic("FieldNames")(FieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexFieldsRequest]
  }
}

