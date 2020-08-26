package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string = js.native
  /**
    * The ID of the function definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListFunctionDefinitionVersions'' requests. If the version is the last one that was associated with a function definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var FunctionDefinitionVersionId: string = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object GetFunctionDefinitionVersionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: string, FunctionDefinitionVersionId: string): GetFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any], FunctionDefinitionVersionId = FunctionDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDefinitionVersionRequest]
  }
  @scala.inline
  implicit class GetFunctionDefinitionVersionRequestOps[Self <: GetFunctionDefinitionVersionRequest] (val x: Self) extends AnyVal {
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
    def setFunctionDefinitionId(value: string): Self = this.set("FunctionDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionDefinitionVersionId(value: string): Self = this.set("FunctionDefinitionVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

