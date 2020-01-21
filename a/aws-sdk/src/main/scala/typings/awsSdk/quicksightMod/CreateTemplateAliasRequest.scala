package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateAliasRequest extends js.Object {
  /**
    * The name that you want to give to the template alias that you're creating. Don't start the alias name with the $ character. Alias names that start with $ are reserved by QuickSight. 
    */
  var AliasName: typings.awsSdk.quicksightMod.AliasName = js.native
  /**
    * The ID of the AWS account that contains the template that you creating an alias for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * An ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * The version number of the template.
    */
  var TemplateVersionNumber: VersionNumber = js.native
}

object CreateTemplateAliasRequest {
  @scala.inline
  def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    TemplateVersionNumber: VersionNumber
  ): CreateTemplateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateVersionNumber = TemplateVersionNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTemplateAliasRequest]
  }
}

