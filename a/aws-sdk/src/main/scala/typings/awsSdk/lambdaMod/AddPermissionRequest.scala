package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionRequest extends StObject {
  
  /**
    * The action that the principal can use on the function. For example, lambda:InvokeFunction or lambda:GetFunction.
    */
  var Action: typings.awsSdk.lambdaMod.Action
  
  /**
    * For Alexa Smart Home functions, a token that must be supplied by the invoker.
    */
  var EventSourceToken: js.UndefOr[typings.awsSdk.lambdaMod.EventSourceToken] = js.undefined
  
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName
  
  /**
    * The AWS service or account that invokes the function. If you specify a service, use SourceArn or SourceAccount to limit who can invoke the function through that service.
    */
  var Principal: typings.awsSdk.lambdaMod.Principal
  
  /**
    * Specify a version or alias to add permissions to a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.lambdaMod.Qualifier] = js.undefined
  
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * For Amazon S3, the ID of the account that owns the resource. Use this together with SourceArn to ensure that the resource is owned by the specified account. It is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
    */
  var SourceAccount: js.UndefOr[SourceOwner] = js.undefined
  
  /**
    * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or Amazon SNS topic.
    */
  var SourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A statement identifier that differentiates the statement from others in the same policy.
    */
  var StatementId: typings.awsSdk.lambdaMod.StatementId
}
object AddPermissionRequest {
  
  inline def apply(Action: Action, FunctionName: FunctionName, Principal: Principal, StatementId: StatementId): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionRequest]
  }
  
  extension [Self <: AddPermissionRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setEventSourceToken(value: EventSourceToken): Self = StObject.set(x, "EventSourceToken", value.asInstanceOf[js.Any])
    
    inline def setEventSourceTokenUndefined: Self = StObject.set(x, "EventSourceToken", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setSourceAccount(value: SourceOwner): Self = StObject.set(x, "SourceAccount", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountUndefined: Self = StObject.set(x, "SourceAccount", js.undefined)
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
  }
}
