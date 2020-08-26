package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConstraintInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:  LAUNCH  You are required to specify either the RoleArn or the LocalRoleName but can't use both. Specify the RoleArn property as follows:  {"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}  Specify the LocalRoleName property as follows:  {"LocalRoleName": "SCBasicLaunchRole"}  If you specify the LocalRoleName property, when an account uses the launch constraint, the IAM role with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the administrator can create fewer resources per shared account.  The given role name must exist in the account used to create the launch constraint and the account of the user who launches a product with this launch constraint.  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one LAUNCH constraint on a product and portfolio.  NOTIFICATION  Specify the NotificationArns property as follows:  {"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}   RESOURCE_UPDATE  Specify the TagUpdatesOnProvisionedProduct property as follows:  {"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}  The TagUpdatesOnProvisionedProduct property accepts a string value of ALLOWED or NOT_ALLOWED.  STACKSET  Specify the Parameters property as follows:  {"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one STACKSET constraint on a product and portfolio. Products with a STACKSET constraint will launch an AWS CloudFormation stack set.  TEMPLATE  Specify the Rules property. For more information, see Template Constraint Rules.  
    */
  var Parameters: ConstraintParameters = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION     RESOURCE_UPDATE     STACKSET     TEMPLATE   
    */
  var Type: ConstraintType = js.native
}

object CreateConstraintInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Parameters: ConstraintParameters,
    PortfolioId: Id,
    ProductId: Id,
    Type: ConstraintType
  ): CreateConstraintInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], PortfolioId = PortfolioId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConstraintInput]
  }
  @scala.inline
  implicit class CreateConstraintInputOps[Self <: CreateConstraintInput] (val x: Self) extends AnyVal {
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
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: ConstraintParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortfolioId(value: Id): Self = this.set("PortfolioId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ConstraintType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setDescription(value: ConstraintDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

