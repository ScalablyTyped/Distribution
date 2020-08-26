package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionRequest extends js.Object {
  /**
    * The action that the principal can use on the function. For example, lambda:InvokeFunction or lambda:GetFunction.
    */
  var Action: typings.awsSdk.lambdaMod.Action = js.native
  /**
    * For Alexa Smart Home functions, a token that must be supplied by the invoker.
    */
  var EventSourceToken: js.UndefOr[typings.awsSdk.lambdaMod.EventSourceToken] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The AWS service or account that invokes the function. If you specify a service, use SourceArn or SourceAccount to limit who can invoke the function through that service.
    */
  var Principal: typings.awsSdk.lambdaMod.Principal = js.native
  /**
    * Specify a version or alias to add permissions to a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.lambdaMod.Qualifier] = js.native
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * For Amazon S3, the ID of the account that owns the resource. Use this together with SourceArn to ensure that the resource is owned by the specified account. It is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
    */
  var SourceAccount: js.UndefOr[SourceOwner] = js.native
  /**
    * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or Amazon SNS topic.
    */
  var SourceArn: js.UndefOr[Arn] = js.native
  /**
    * A statement identifier that differentiates the statement from others in the same policy.
    */
  var StatementId: typings.awsSdk.lambdaMod.StatementId = js.native
}

object AddPermissionRequest {
  @scala.inline
  def apply(Action: Action, FunctionName: FunctionName, Principal: Principal, StatementId: StatementId): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionRequest]
  }
  @scala.inline
  implicit class AddPermissionRequestOps[Self <: AddPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionName(value: FunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipal(value: Principal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementId(value: StatementId): Self = this.set("StatementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceToken(value: EventSourceToken): Self = this.set("EventSourceToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSourceToken: Self = this.set("EventSourceToken", js.undefined)
    @scala.inline
    def setQualifier(value: Qualifier): Self = this.set("Qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("Qualifier", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    @scala.inline
    def setSourceAccount(value: SourceOwner): Self = this.set("SourceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAccount: Self = this.set("SourceAccount", js.undefined)
    @scala.inline
    def setSourceArn(value: Arn): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
  }
  
}

