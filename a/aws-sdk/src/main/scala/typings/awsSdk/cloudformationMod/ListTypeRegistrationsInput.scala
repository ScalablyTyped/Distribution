package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeRegistrationsInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.native
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The current status of the type registration request. The default is IN_PROGRESS.
    */
  var RegistrationStatusFilter: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The kind of type. Currently the only valid value is RESOURCE. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.native
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
}

object ListTypeRegistrationsInput {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    RegistrationStatusFilter: RegistrationStatus = null,
    Type: RegistryType = null,
    TypeArn: TypeArn = null,
    TypeName: TypeName = null
  ): ListTypeRegistrationsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RegistrationStatusFilter != null) __obj.updateDynamic("RegistrationStatusFilter")(RegistrationStatusFilter.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeArn != null) __obj.updateDynamic("TypeArn")(TypeArn.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypeRegistrationsInput]
  }
}

