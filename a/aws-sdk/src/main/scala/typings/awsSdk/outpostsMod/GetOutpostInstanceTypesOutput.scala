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
  def apply(): GetOutpostInstanceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostInstanceTypesOutput]
  }
  @scala.inline
  implicit class GetOutpostInstanceTypesOutputOps[Self <: GetOutpostInstanceTypesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceTypeItem*): Self = this.set("InstanceTypes", js.Array(value :_*))
    @scala.inline
    def setInstanceTypes(value: InstanceTypeListDefinition): Self = this.set("InstanceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTypes: Self = this.set("InstanceTypes", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOutpostArn(value: OutpostArn): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setOutpostId(value: OutpostId): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostId: Self = this.set("OutpostId", js.undefined)
  }
  
}

