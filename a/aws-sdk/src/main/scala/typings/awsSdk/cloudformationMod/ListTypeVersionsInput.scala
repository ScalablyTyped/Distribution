package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeVersionsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type for which you want version summary information. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.native
  /**
    * The deprecation status of the type versions that you want to get summary information about. Valid values include:    LIVE: The type version is registered and can be used in CloudFormation operations, dependent on its provisioning behavior and visibility scope.    DEPRECATED: The type version has been deregistered and can no longer be used in CloudFormation operations.    The default is LIVE.
    */
  var DeprecatedStatus: js.UndefOr[typings.awsSdk.cloudformationMod.DeprecatedStatus] = js.native
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.native
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The kind of the type. Currently the only valid value is RESOURCE. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type for which you want version summary information. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
}

object ListTypeVersionsInput {
  @scala.inline
  def apply(): ListTypeVersionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeVersionsInput]
  }
  @scala.inline
  implicit class ListTypeVersionsInputOps[Self <: ListTypeVersionsInput] (val x: Self) extends AnyVal {
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
    def setArn(value: PrivateTypeArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setDeprecatedStatus(value: DeprecatedStatus): Self = this.set("DeprecatedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedStatus: Self = this.set("DeprecatedStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setType(value: RegistryType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setTypeName(value: TypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
  }
  
}

