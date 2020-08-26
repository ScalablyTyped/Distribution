package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResourcesOutput extends js.Object {
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.resourcegroupsMod.NextToken] = js.native
  /**
    * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var QueryErrors: js.UndefOr[QueryErrorList] = js.native
  /**
    * The ARNs and resource types of resources that are members of the group that you specified.
    */
  var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.native
}

object SearchResourcesOutput {
  @scala.inline
  def apply(): SearchResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesOutput]
  }
  @scala.inline
  implicit class SearchResourcesOutputOps[Self <: SearchResourcesOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setQueryErrorsVarargs(value: QueryError*): Self = this.set("QueryErrors", js.Array(value :_*))
    @scala.inline
    def setQueryErrors(value: QueryErrorList): Self = this.set("QueryErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryErrors: Self = this.set("QueryErrors", js.undefined)
    @scala.inline
    def setResourceIdentifiersVarargs(value: ResourceIdentifier*): Self = this.set("ResourceIdentifiers", js.Array(value :_*))
    @scala.inline
    def setResourceIdentifiers(value: ResourceIdentifierList): Self = this.set("ResourceIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifiers: Self = this.set("ResourceIdentifiers", js.undefined)
  }
  
}

