package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The self-service action definition. Can be one of the following:  Name  The name of the AWS Systems Manager document (SSM document). For example, AWS-RestartEC2Instance. If you are using a shared SSM document, you must provide the ARN instead of the name.  Version  The AWS Systems Manager automation document version. For example, "Version": "1"   AssumeRole  The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example, "AssumeRole": "arn:aws:iam::12345678910:role/ActionRole". To reuse the provisioned product launch role, set to "AssumeRole": "LAUNCH_ROLE".  Parameters  The list of parameters in JSON format. For example: [{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}] or [{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}].  
    */
  var Definition: ServiceActionDefinitionMap = js.native
  /**
    * The service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: ServiceActionDefinitionType = js.native
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The self-service action name.
    */
  var Name: ServiceActionName = js.native
}

object CreateServiceActionInput {
  @scala.inline
  def apply(
    Definition: ServiceActionDefinitionMap,
    DefinitionType: ServiceActionDefinitionType,
    IdempotencyToken: IdempotencyToken,
    Name: ServiceActionName,
    AcceptLanguage: AcceptLanguage = null,
    Description: ServiceActionDescription = null
  ): CreateServiceActionInput = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any], DefinitionType = DefinitionType.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceActionInput]
  }
}

