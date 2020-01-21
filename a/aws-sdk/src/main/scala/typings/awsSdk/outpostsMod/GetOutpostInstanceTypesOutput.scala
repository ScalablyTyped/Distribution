package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInstanceTypesOutput extends js.Object {
  var InstanceTypes: js.UndefOr[InstanceTypeListDefinition] = js.native
  var NextToken: js.UndefOr[Token] = js.native
  var OutpostArn: js.UndefOr[typings.awsSdk.outpostsMod.OutpostArn] = js.native
  var OutpostId: js.UndefOr[typings.awsSdk.outpostsMod.OutpostId] = js.native
}

object GetOutpostInstanceTypesOutput {
  @scala.inline
  def apply(
    InstanceTypes: InstanceTypeListDefinition = null,
    NextToken: Token = null,
    OutpostArn: OutpostArn = null,
    OutpostId: OutpostId = null
  ): GetOutpostInstanceTypesOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceTypes != null) __obj.updateDynamic("InstanceTypes")(InstanceTypes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (OutpostId != null) __obj.updateDynamic("OutpostId")(OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
  }
}

