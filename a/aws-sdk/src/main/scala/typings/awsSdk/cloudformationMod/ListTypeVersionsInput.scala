package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeVersionsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type for which you want version summary information. Conditional: You must specify TypeName or Arn.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.native
  /**
    * The deprecation status of the type versions that you want to get summary information about. Valid values include:    LIVE: The type version is registered and can be used in CloudFormation operations, dependent on its provisioning behavior and visibility scope.    DEPRECATED: The type version has been deregistered and can no longer be used in CloudFormation operations.   
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
    * The kind of the type. Currently the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type for which you want version summary information. Conditional: You must specify TypeName or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
}

object ListTypeVersionsInput {
  @scala.inline
  def apply(
    Arn: PrivateTypeArn = null,
    DeprecatedStatus: DeprecatedStatus = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    Type: RegistryType = null,
    TypeName: TypeName = null
  ): ListTypeVersionsInput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DeprecatedStatus != null) __obj.updateDynamic("DeprecatedStatus")(DeprecatedStatus.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypeVersionsInput]
  }
}

